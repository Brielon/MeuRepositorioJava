package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);//aqui estou referenciando a Data(int,int,int);
	}
	Data(int dia,int mes,int ano){ 
		this.dia = dia;//referenciar funçao atual
		this.mes = mes;// 
		this.ano = ano;
		//this(dia,mes,ano);==Data(dia,mes,ano);

	}
	String DataF() {
		return String.format("%d/%d/%d",dia,mes,ano ); 
	}
}
