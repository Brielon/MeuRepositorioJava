package streams;

public class Media {
	double notas;
	int quantidade = 0;
	Media(){
	}
	Media(Media m1,Media m2){
		this.notas=
				m1.notas+m2.notas;
		this.quantidade=
				m1.quantidade+m2.quantidade;
	}
	public Media AdicionarNota(double nota) {
		this.notas+=nota;
		this.quantidade++;
		return this;
	}
	public String RetornarMedia() {
		return this.notas/this.quantidade+""; 
	}
}
