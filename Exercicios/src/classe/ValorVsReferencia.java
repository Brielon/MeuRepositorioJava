package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.printf("%.0f %.0f\n",a,b);
		
		Data d1 = new Data(20,11,2000);
		Data d2 = d1;
		d1.ano = 2022;
		System.out.println(d2.DataF());
		print("teste");
		RefrechData(d1);
		print(d2.DataF());
		print(d1.DataF());
	}
	static void print(String mensagen) {
		System.out.println(mensagen);
	}
	static void RefrechData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
}
