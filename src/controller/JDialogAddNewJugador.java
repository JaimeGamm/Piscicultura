package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import view.AddFormNewJugador;
import view.PanelNewCycking;

public class JDialogAddNewJugador extends JDialog{
	
	AddFormNewJugador panelNewCycking;
	public JDialogAddNewJugador(ActionListener actionListener) {
		setPreferredSize(new Dimension(500,800));
		setMinimumSize(new Dimension(400,700));
		initComponents(actionListener);
	}
	private void initComponents(ActionListener actionListener) {
		panelNewCycking = new AddFormNewJugador(actionListener);
		add(panelNewCycking,BorderLayout.CENTER);
	}
	
//	public String createCyclist() {
//		return panelNewCycking.addRegistro();
//	}
}
