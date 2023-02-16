package fundamentos;

public class AreaCircunferencia {
public static void main(String[] args) {
	double raio = 3.4;
	final double PI = 3.14159;//final double ou seja o valor final da variavel e este lembrarei de usar maiuscula para nomear constantes
	double area = raio * PI * raio;
	System.out.println(area);
	raio = 20;
	area = raio * PI * raio;
	System.out.println(area);
}
}
