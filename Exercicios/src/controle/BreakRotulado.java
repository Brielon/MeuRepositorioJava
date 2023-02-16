package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		externo:
			for(int i = 0;i < 3;i++) {
				for(int j = 0;j < 3;j++) {
					if(i==2)break externo;
					System.out.printf(" mensagen i%d-j%d\n",i,j);
				}
			}
		System.out.println("saiu");
	}
}
