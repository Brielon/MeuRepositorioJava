package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {
	public static void main(String[] args) { 
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> NtoSB = inteiro -> {//funcionando
			String BinaryStr=""; 
			Integer inteiro2;	
			if(inteiro == 0)
				return "0";
			for(;;) {
				inteiro2=inteiro%2;
				BinaryStr=(inteiro2.toString())+BinaryStr;
				inteiro=inteiro/2;
				if(inteiro==0) 
					break;	
			}
			return BinaryStr;
		};
		Function<String, String> ReverceStrings = s -> {//funcionando 
		String s1 ="";
			for(int i = s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
		};
		Function<String, Integer> SBtoN = Sbinario -> {
			int i=0;
			
			for(;;i++) {
				if(Sbinario.charAt(i)=='0')
					continue;
				else 
					break;
			}
			for(int teste = 0;;teste++) {
				if(NtoSB.apply(teste)
						.equals(Sbinario
						.substring(i,Sbinario.length()))) {
					i=teste;
					break;
				}
			}
			return i; 
		};
		Consumer<String> print = palavra -> System.out.println(palavra+",");
		nums.stream()
			.map(NtoSB)
			.map(ReverceStrings) 
			.map(SBtoN)
			.forEach(System.out::println);  
	/*Teste bem sucedido
	 * 	String bina = NtoSB.apply(6);
		System.out.println(bina);
		bina = ReverceStrings.apply(bina);
		System.out.println(bina);
		Integer bina1 = SBtoN.apply(bina);
		System.out.println(bina1);
		*/
		
	}
}
