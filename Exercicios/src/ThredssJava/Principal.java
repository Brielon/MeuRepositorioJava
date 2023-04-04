package ThredssJava;

public class Principal {
	public static void main(String[] args){
		int a,b;
		a=b=0;
		
		Runnable t1 = () -> {
			for(;;)
				
				System.out.println("picles");
		};
		Runnable t2 = () -> {
			for(;;)
				System.out.println("batata frita");
		};
		Thread trabalho1 = new Thread(t1);
		Thread trabalho2 = new Thread(t2);
		trabalho1.start();
		trabalho2.start(); 
		trabalho1.stop();
		trabalho2.stop();
		
		}
	}

