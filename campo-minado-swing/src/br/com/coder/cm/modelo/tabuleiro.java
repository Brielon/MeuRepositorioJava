package br.com.coder.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class tabuleiro implements CampoObservador {
	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<campo> campos = new ArrayList<>();
	private final List<Consumer<Boolean>> observadores = 
			new ArrayList<>();
	
	public tabuleiro(int linhas,int colunas,int minas) {
		this.linhas=linhas;
		this.colunas=colunas;
		this.minas=minas;
		
		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
	}
	
	public void paraCada(Consumer<campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registrarOservador(Consumer<Boolean> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream()
		.forEach(o -> o.accept(resultado));
	}
	
	public void abrir (int linha,int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.Abrir() );
	}
	
	private void mostrarMinas() {
		campos
		.stream()
		.filter(c -> c.isMinado())
		.forEach(c -> c.setAberto(true));
	}
	
	public void marcar (int linha,int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.AlternarMarcado() );
	}
	
	private void gerarCampos() {
		for (int linha = 0 ;linha<linhas;linha++) {
			for(int coluna = 0; coluna < colunas;coluna++) {
				campo Campo = new campo(linha, coluna);
				Campo.registrarObservadores(this);
				campos.add(Campo);
			}
		}
		
	}	
	private void associarOsVizinhos() {
			for (campo c1:campos) {
				for (campo c2:campos) {
					c1.adicionarVizinho(c2);
				}
			}
			
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<campo> minado = c -> c.isMinado();
		
		do {
			minasArmadas=campos.stream().filter(minado).count();
			int aleatorio = (int)(Math.random()*campos.size());
			campos.get(aleatorio).minar();
		}while(minasArmadas<minas);
		
	}
	public boolean ObjetivoAlcancado(){
		return campos.stream().allMatch(c -> c.ObjetivoAlcancado());
		}
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	public String toString() {
		String sb = "";
		int i = 0;
		for(int a = 1;a<=colunas;System.out.print(" "+(a++)+" ")); 
		System.out.println("\n");
		
		for (int l = 0; l < linhas; l++) {      
			for (int c = 0; c < colunas; c++) {
				sb += " ";
				sb += campos.get(i); 
				sb += " ";
			
				i++;
			}
			sb += " "+(l+1)+"\n";
		}
		return sb;
	}
	public String estourado() {
		String sb = "";
		int i = 0;
		for(int a = 1;a<=colunas;System.out.print(" "+(a++)+" "));
		System.out.println("\n");
		for (int l = 0; l < linhas; l++) {      
			for (int c = 0; c < colunas; c++) {
				sb += " ";
				sb += campos.get(i).toEstourado();
				sb += " ";
			
				i++;
			}
			sb += " "+(l+1)+"\n";
		}
		return sb;
	}
	@Override
	public void eventoOcorreu(campo Campo, CampoEvento evento) {
		if(evento== CampoEvento.EXPLODIR) {
			System.out.println("perdeu");
			mostrarMinas();
			notificarObservadores(false);
		}else if(ObjetivoAlcancado()) {
			System.out.println("Ganhou");
			notificarObservadores(true);
		}
		
		
	}
	public int getLinhas() {
		return this.linhas;
	}
	public int getColunas() {
		return this.colunas;
		
	}

}