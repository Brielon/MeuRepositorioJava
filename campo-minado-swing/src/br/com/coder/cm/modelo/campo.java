package br.com.coder.cm.modelo;
import java.util.ArrayList;
import java.util.List;

public class campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto;
	private boolean minado;
	private boolean marcado;
	
	private List<campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();

	
	campo(int linha , int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservadores(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream()
			.forEach(obs -> obs.eventoOcorreu(this,evento));
	}
	
	boolean adicionarVizinho(campo vizinho) {
		//\\int digerenca = Math.abs(this.linha-vizinho.linha)
		//		+Math.abs(this.coluna-vizinho.coluna);
		//boolean vizinhoDiagonal = digerenca==2;
		//boolean vizinholateral = digerenca==1;
		//return vizinhoDiagonal || vizinholateral;
		boolean linhaDiferente = vizinho.linha!=linha;
		boolean colunaDiferente= vizinho.coluna!=coluna;
		boolean mesmaLinha = !linhaDiferente;
		boolean mesmaColuna = !colunaDiferente;
		boolean diagonal = linhaDiferente&&colunaDiferente;
		
		int DeltaLinha = Math.abs(this.linha-vizinho.linha);
		int DeltaColuna = Math.abs(this.coluna-vizinho.coluna);
		int DeltaGeral = DeltaLinha+DeltaColuna;
		
		boolean vizinhodiagonal = DeltaGeral==2&&diagonal;
		boolean vizinhoVerticalouHorizontal = DeltaGeral==1&&(mesmaLinha||mesmaColuna);
		//isso e desnecessario so pra deixar explicito que entendi
		
		
		
		if(vizinhoVerticalouHorizontal||vizinhodiagonal) {
			this.vizinhos.add(vizinho);   
			return true;
		}
		return false; 
	}
	public void AlternarMarcado() {
		if(!aberto)
			marcado=!marcado;
		
		if(marcado) {
			notificarObservadores(CampoEvento.MARCAR);
		}else {
			notificarObservadores(CampoEvento.DESMARCAR);
			
		}
	}
	public boolean Abrir() {
		if(!aberto&&!marcado) {
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			setAberto(true);
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.Abrir());
			}
			return true;
		}else {
			return false;
		}
	}
	void setAberto(boolean b) {
		this.aberto=aberto;
		if(aberto)
			notificarObservadores(CampoEvento.ABRIR);
	}

	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v->v.minado); 
	}
	void minar() {
		minado = true;
	}
	public boolean isMinado() {
			return minado;
	}
	public boolean isMarcado() {
		return marcado;
	}
	public int getLinha() {
		return this.linha;
	}
	public int getColuna() {
		return this.coluna;
	}
	
	boolean ObjetivoAlcancado(){
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
		}
	long minasVizinhanca() {
		return vizinhos.stream()
						.filter(v -> v.minado)
						.count();
	}
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	public String toString() {
		if(marcado) 
			return "x";
		else if(aberto && minado)
			return "*";
		else if(aberto && minasVizinhanca()>0)
			return Long.toString(minasVizinhanca()); 
		else if(aberto)
			return " ";
		else
			return "?";
	}
	public String toEstourado() {
		if(marcado) 
			return "x";
		else if(minado)
			return "*";
		else if(aberto && minado)
			return "*";
		else if(aberto && minasVizinhanca()>0)
			return Long.toString(minasVizinhanca()); 
		else if(aberto)
			return " ";
		else
			return "?";
	}
	
}
	

