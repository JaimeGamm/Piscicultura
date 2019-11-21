package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddJTextField extends JTextField{
	public AddJTextField(String text) {
		super(text);
		setPreferredSize(new Dimension(350,30));
		JTextArea areaText = new JTextArea();
		addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            setText("");
            }
        });
	

	}
	public AddJTextField( ) {
		setPreferredSize(new Dimension(50,30));
	}
}
