package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import view.AddFormNewJugador;

public class JDialogAddGrafica extends JDialog{
	public JDialogAddGrafica(ActionListener actionListener) {
		setPreferredSize(new Dimension(500,800));
		setMinimumSize(new Dimension(400,700));
		initComponents(actionListener);
	}
	private void initComponents(ActionListener actionListener) {

	}

}
