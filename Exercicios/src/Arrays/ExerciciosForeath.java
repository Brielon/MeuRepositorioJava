package Arrays;

public class ExerciciosForeath { 
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0]=8;
		notasAlunoA[1]=7;
		notasAlunoA[2]=9; 
		notasAlunoA[3]=8.4;
		System.out.println(media(notasAlunoA));
		double[] notasAlunoB = {6,9,8,7,4,5};
		System.out.println(media(notasAlunoB)); 
		
		
	}
	static double media(double [] Array) {
		double total = 0;
		for(double Array_atual : Array) { 
			total+=Array_atual;
		}
		return total/Array.length;  
	}
}
