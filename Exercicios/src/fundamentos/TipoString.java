package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoar".charAt(2));
		String s = "Boa tarde";
		//metodo .concat
		System.out.println(s.concat("!!!!"));
		//concatenando sem metodo
		System.out.println(s + "!!!!");
		//começa com Boa?
		System.out.println(s.startsWith("Boa"));
		//coloca tudo em munusculo, começa com boa?
		System.out.println(s.toLowerCase().startsWith("boa"));
		//coloca tudo em maiusculo, termina com TARDE?
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		//retorna quantos characteres tem 's'
		System.out.println(s.length());
		//coloca tudo eem minusculo e pergunta se e igual a "boa tarde"
		System.out.println(s.toLowerCase().equals("boa tarde"));
		//compara string ignorando se for maiuscula ou minuscula 
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12454.54;
		var endl="\n";
		System.out.println(endl+endl+endl);
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario);
		System.out.println(endl+endl+endl);
		//lembra de como se fazia no c?
		System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: %.2f",nome,sobrenome,idade,salario);
		
		String frase = String.format("Nome: %s\nSobrenome: %s\nIdade: %d\nSalario: %.2f","Armando",sobrenome,idade,salario);
		System.out.println(endl+endl+endl);
		System.out.println(frase);
		
	}
}
