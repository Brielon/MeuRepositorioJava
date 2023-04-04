package streams;

import java.util.function.Function;

public class funcoesdodesafio {
	private funcoesdodesafio(){
	}
	String NtoSB(Integer inteiro){//funcionando
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
	}
}
