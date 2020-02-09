package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Commands;
import general.HandlerLanguage;

public class PTextLabel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel;
	private JButtonsMenuAndDialogs export;

	public PTextLabel(ActionListener actionListenner) {
		setBackground(Color.WHITE);
		jLabel = new JLabel();
		jLabel.setText(HandlerLanguage.languageProperties.getProperty(Constants.DATA_TABLE));
		jLabel.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD, 16));
		jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 300));
		add(jLabel);
		export = new JButtonsMenuAndDialogs(Constants.EXPORT_PATH);
    	export.setBackground(Color.WHITE);
    	export.addActionListener(actionListenner);
    	export.setActionCommand(Commands.SAVE_DATA.toString());
    	export.setText(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_DATA));
    	add(export, BorderLayout.EAST);
	}
	
	public void changeLanguage() {
		jLabel.setText(HandlerLanguage.languageProperties.getProperty(Constants.DATA_TABLE));
		export.setText(HandlerLanguage.languageProperties.getProperty(Constants.SAVE_DATA));
	}
	
}
