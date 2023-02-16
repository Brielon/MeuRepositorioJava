package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		/**
		s=s.replace("X", "Senhora");
		s=s.toUpperCase();
		**/
		s=s.replace("X","Senhora").concat("!!!").toUpperCase();
		System.out.println(s);
	}
}
