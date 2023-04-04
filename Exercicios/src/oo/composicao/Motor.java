package oo.composicao;

public class Motor {
	double fatorInjecao = 1;
	boolean ligado = false;
	int giros() {
		if(ligado)
		return (int) Math.round(3000*fatorInjecao);
		return 0; 
	}
}
