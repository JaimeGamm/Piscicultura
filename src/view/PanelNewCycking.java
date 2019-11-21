package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

//import com.toedter.calendar.JCalendar;

import controller.ActionCompoonet;

public class PanelNewCycking  extends JPanel {
	public PanelNewCycking( ActionListener actionListener) {
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.white);
		setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ));
		setBackground(Color.getColor("#DDDD5F5"));
		Border border = LineBorder.createGrayLineBorder();
		setBorder(border);
		initComponents(actionListener);
	}
	public PanelNewCycking() {
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.white);
		setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ));
		setBackground(Color.getColor("#DDDD5F5"));
		Border border = LineBorder.createGrayLineBorder();
		setBorder(border);
	}
	public void initComponents(ActionListener actionListener){
		addButoon(actionListener);
	}
	private void addButoon( ActionListener actionListener) {
		PanelAddButton addCiclingFirstName = new PanelAddButton("Agregar primer nombre");
		PanelAddButton addCiclingSecondName = new PanelAddButton("Agregar segundo nombre");
		PanelAddButton addCiclingApellidoName = new PanelAddButton("Agregar apellido");
		PanelAddButton birthDate = new PanelAddButton("Fecha de nacimiento");
		//birthDate.getjButton.addActionListener(actionListener);
		//birthDate.setActionCommand(ActionCompoonet.C_ADD_CYCLING.toString());
//		JCalendar birthDate2 = new JCalendar();
		this.add(addCiclingFirstName);
		this.add(addCiclingSecondName);
		this.add(addCiclingApellidoName);
		this.add(birthDate);
	}

}
