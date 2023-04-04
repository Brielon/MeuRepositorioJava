package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ChegadaAniversarianteObservador> observadores = 
			new ArrayList<>(); 
	public void registrarObservador(ChegadaAniversarianteObservador Observador) {
		observadores.add(Observador);
	}
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou");
			valor = entrada.nextLine();
			if("Sim".equalsIgnoreCase(valor)) {
				EventoChegadaAniversariante Evento = 
					new EventoChegadaAniversariante(new Date());
				observadores.stream().forEach(o -> o.chegou(Evento));
			}else{
				System.out.println("Alarme Falso");
			}
		}
	}
}
