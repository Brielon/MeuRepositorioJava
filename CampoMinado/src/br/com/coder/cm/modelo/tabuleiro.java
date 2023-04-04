package br.com.coder.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<campo> campos = new ArrayList<>();
	
	public tabuleiro(int linhas,int colunas,int minas) {
		this.linhas=linhas;
		this.colunas=colunas;
		this.minas=minas;
		
		gerarCampos();
		associarOsVizinhos();
		sortearMinas();
	}
	public void abrir (int linha,int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.Abrir() );
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
				campos.add(new campo(linha,coluna));
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
}