package fundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		//x-y elevado por 3 dividido por 10 elevado por 3
	double p1 = 6*(3+2);
	p1 = Math.pow(p1,2);
	p1 = p1/(3*2);
	double p2 = ((1-5)*(2-7))/2;
	p2 = Math.pow(p2, 2);
	p1 = p1 - p2;
	p1 = Math.pow(p1, 3);
	p2 = Math.pow(10, 3);
	p1 = p1/p2;
	System.out.println(p1);
	
}
}
