package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {

	private Campo campo = new Campo(3,3);
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoDitancia1Esquerda() {		
		Campo vizinhoEsquerda = new Campo (3,2);		
		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);		
		assertTrue(resultadoEsquerda); //Se for true o teste passou
	}
	
	@Test
	void testeVizinhoDitancia1Direita() {		
		Campo vizinhoDireita = new Campo (3,4);		
		boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);		
		assertTrue(resultadoDireita); //Se for true o teste passou
	}
	
	@Test
	void testeVizinhoDitancia1EmCima() {		
		Campo vizinhoEmCima = new Campo (2,3);		
		boolean resultadoEmCima = campo.adicionarVizinho(vizinhoEmCima);		
		assertTrue(resultadoEmCima); //Se for true o teste passou
	}
	
	@Test
	void testeVizinhoDitancia1Embaixo() {		
		Campo vizinhoEmbaixo = new Campo (4,3);		
		boolean resultadoEmbaixo = campo.adicionarVizinho(vizinhoEmbaixo);		
		assertTrue(resultadoEmbaixo); //Se for true o teste passou
	}
	
	
	@Test
	void testeVizinhoDitanciaDiagonal1() {		
		Campo vizinhoDiagonal1 = new Campo (2,2);		
		boolean resultadoDiagonal1 = campo.adicionarVizinho(vizinhoDiagonal1);		
		assertTrue(resultadoDiagonal1); //Se for true o teste passou
	}
	
	@Test
	void testeNaoVizinho() {		
		Campo vizinho = new Campo (1,1);		
		boolean resultado = campo.adicionarVizinho(vizinho);		
		assertFalse(resultado); //Se for false o teste passou, pois não é para ser vizinho do (3,3) o campo (1,1)
	}
	
	
}
