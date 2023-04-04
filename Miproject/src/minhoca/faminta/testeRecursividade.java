package minhoca.faminta;

import java.awt.FlowLayout;

import javax.swing.JFrame;
/**
 * 
 * @author angelo.santos
 *pequeno teste forçando a implementacao da recursividade
 *
 */

public class testeRecursividade{
	public static void main(String[] args) {
		
		System.out.println(fatorialRecursivo(170));
		int []minhaArray= {9,8,7,6,5,4,3,2,1};
		ApresentarArrayRecursivamente(minhaArray);
		
		
		
	
	}
	private static void ApresentarArrayRecursivamente(int[] Array) {
		// TODO Auto-generated method stub
		int i = (Array.length)-1;
		System.out.print(Array[i]+(i==0?";":","));
		if(i==0)return;
		int [] novaArray = new int [i];
		for(int c = 0;c<i;c++) {
			novaArray[c]=Array[c];
		}
		ApresentarArrayRecursivamente(novaArray);
	
		
	}
	static double fatorialRecursivo(double a) {
		if (a == 1)return 1;
		return a*fatorialRecursivo(a-1);
		
		
		
		
		
	}
	
}

