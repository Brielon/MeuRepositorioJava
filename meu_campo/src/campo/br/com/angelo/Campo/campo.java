package campo.br.com.angelo.Campo;

public class campo {
	boolean explodido;
	boolean minado;
	boolean marcado;
	//temporario true para testes
	boolean fechado;
	public boolean isMined() {
		return minado;
	}
	public void minar() {
		minado = true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (explodido) return "*X*";
		else if(marcado) return " ? ";
		else if(fechado) return " X ";
		else if(minado)  return " * ";
		else return "   ";
	}
	public void marcar() {
		// TODO Auto-generated method stub
		if(marcado)	marcado = false;
		else this.marcado = true;
	}
}
