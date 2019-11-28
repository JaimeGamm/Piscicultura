package views;

import views.table.JtableElement;
import views.header.JPanelHeader;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyJPanelPrincipal extends JPanel{
	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    private static final long serialVersionUID = 1L;
    private JtableElement jtableElement;
	
    public MyJPanelPrincipal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		initComponents(actionListenner, datasFarm);
		setVisible(true);
    }
	
    private void initComponents(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	add(new JPanelHeader(actionListenner),BorderLayout.NORTH);
    	showDatas(datasFarm);
		
    }
    
	public void showDatas(ArrayList<Object[]> datasFarm) {
		jtableElement = new JtableElement();
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
		this.add(jtableElement,BorderLayout.CENTER);
		
	}
	public void newDatas(ArrayList<Object[]> datasFarm) {
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
		this.add(jtableElement,BorderLayout.CENTER);
		
	}
	public void restartTable() {
		jtableElement.cleanRowsTable();
	}



}
