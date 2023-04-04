package br.com.coder.cm.visao;

import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import br.com.coder.cm.modelo.CampoEvento;
import br.com.coder.cm.modelo.CampoObservador;
import br.com.coder.cm.modelo.campo;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador,MouseListener{
	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_MARCAR = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	private campo Campo;
	public BotaoCampo(campo Campo) {
		this.Campo=Campo;
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO);
		addMouseListener(this);
		Campo.registrarObservadores(this);
	}

	@Override
	public void eventoOcorreu(campo Campo, CampoEvento evento) {
		// TODO Auto-generated method stub
		switch(evento) {
		case ABRIR:
			AplicarEstiloAberto();
			break;
		case MARCAR:
			AplicarEstiloMarcar();
			break;
		case DESMARCAR:
			AplicarEstiloDesmarcar();
			break;
		case EXPLODIR:
			AplicarEstiloExplodir();
			break;
			default:
				AplicarEstiloPadrao();
		}
	}

	private void AplicarEstiloPadrao() {
		// TODO Auto-generated method stub
		
	}

	private void AplicarEstiloExplodir() {
		// TODO Auto-generated method stub
		
	}

	private void AplicarEstiloDesmarcar() {
		// TODO Auto-generated method stub
		
	}

	private void AplicarEstiloMarcar() {
		// TODO Auto-generated method stub
		
	}

	private void AplicarEstiloAberto() {
		// TODO Auto-generated method stub
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
	}
	
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		if(e.getButton()==1) {
			Campo.Abrir();
		}else
			Campo.AlternarMarcado();
		
	}
	
	
	//Mouse implements

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

	
	
	
	