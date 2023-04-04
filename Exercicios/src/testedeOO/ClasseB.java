package testedeOO;

public class ClasseB {
	int InteiroB = 0;
	ClasseB(int InteiroB){
		this.InteiroB=InteiroB;
	}
	void apresentaB() {
		boolean nulo = !(InteiroB*2==(InteiroB+InteiroB));
		if(!nulo) 
		System.out.println(this.InteiroB);
		else
		System.out.println("Inteiro B e NULL");
	} 
}
