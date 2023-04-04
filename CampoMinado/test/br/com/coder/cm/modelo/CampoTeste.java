package br.com.coder.cm.modelo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CampoTeste {
	private campo Campo = new campo(3,3);
	
	boolean testeVizinho(int[]posicao) {
		campo vizinho = new campo(posicao[0],posicao[1]);
		boolean resultado = Campo.adicionarVizinho(vizinho);
		
	//	assertTrue(resultado);
		return resultado;
	}
	/*
	 * 1,1  1,2  1,3  1,4  1,5
	 * 2,1  2,2  2,3  2,4  2,5
	 * 3,1  3,2 '3,3' 3,4  3,5
	 * 4,1  4,2  4,3  4,4  4,5
	 * 5,1  5,2  5,3  5,4  5,5
	 */
	@Test
	void testeVizinho(){
		System.out.println("Teste Vizinho");
		int posicao[][]= {{2,2},{2,3},{2,4},{3,2},{3,4},{4,2},{4,3},{4,4}};
		for(int i = 0;i<posicao.length;i++) {
			System.out.printf("X: %d Y: %d %s\n",posicao[i][0],posicao[i][1],testeVizinho(posicao[i]));
			assertTrue(testeVizinho(posicao[i]));

		}
	}
	@Test
	void testeNaoVizinho(){
		System.out.println("Teste nao Vizinho");
		int posicao[][]= {{1,2},{1,3},{1,4},{1,5},{2,5},{3,5},{4,5},{5,5},
						  {5,4},{5,3},{5,2},{5,1},{4,1},{3,1},{2,1},{1,1}};
		for(int i = 0;i<posicao.length;i++) {
			System.out.printf("X: %d Y: %d %s\n",posicao[i][0],posicao[i][1],testeVizinho(posicao[i]));
			assertFalse(testeVizinho(posicao[i]));

		}
	}
	@Test
	void testeValorMarcado() {
		assertFalse(Campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacao() {
		Campo.AlternarMarcado();
		assertTrue(Campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoX2() {
		Campo.AlternarMarcado();
		Campo.AlternarMarcado();
		assertFalse(Campo.isMarcado());
	}
	@Test
	void testeVisinhancaSegura() {
		assertTrue(Campo.vizinhancaSegura());
	}
	@Test
	void testeAbrirNaoMinadoMarcado() {
		Campo.AlternarMarcado();
		assertFalse(Campo.Abrir());
	}
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(Campo.Abrir());
	}
	@Test
	void testeAbrirMinadoMarcado() {
		Campo.AlternarMarcado();
		Campo.minar();
		assertFalse(Campo.Abrir());
	}
	//@Test
	void testeAbrirMinadoNaoMarcado() {
	//	Campo.AlternarMarcado();
		Campo.minar();
		assertThrows (ExplosaoEception.class, () -> { 
			Campo.Abrir();
		});
	}
	
	
	
}
