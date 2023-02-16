package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	//(°F - 32)x5/9=°C
	final double X = 32 , Y = 5.0/9.0;
	double faren = 86;
	double celcios = (faren - X)*Y;
	System.out.println(celcios);
	
}
}
