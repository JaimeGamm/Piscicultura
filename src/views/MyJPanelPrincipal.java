package views;

import views.table.JtableElement;
import views.table.JtableReport;
import views.header.JPanelHeader;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MyJPanelPrincipal extends JPanel{
	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    private static final long serialVersionUID = 1L;
    private JtableElement jtableElement;
    private JPanelHeader jPanelHeader;
    private JtableReport jtableReport;

	
    public MyJPanelPrincipal(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1300,1000));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(30);
		setLayout(flowLayout);
//		setLayout(new BorderLayout());
//		setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ));
		initComponents(actionListenner, datasFarm);
		setVisible(true);
    }
	
    private void initComponents(ActionListener actionListenner, ArrayList<Object[]> datasFarm) {
    	jPanelHeader=new JPanelHeader(actionListenner);
 
    	add(jPanelHeader,BorderLayout.NORTH);
    	showDatas(datasFarm);
		
    }
    public void changeLanguage() {
    	jtableElement.changeLanguageColunmJtable();
    	jPanelHeader.changeLanguageButtonsMenu();

	}
	public void showDatas(ArrayList<Object[]> datasFarm) {
		jtableElement = new JtableElement();
	    jtableElement.setPreferredSize(new Dimension(1200,500));
		for (Object[] objects : datasFarm) {
			jtableElement.addElementTOtable(objects);
		}
//		jtableElement.setAlignmentX(CENTER_ALIGNMENT);

		this.add(jtableElement,BorderLayout.CENTER);
	}
	public void showDatasReport(ArrayList<Object[]> datasFarm) {
		jtableReport = new JtableReport("ESPECIES", "PROMEDIO");
		for (Object[] objects : datasFarm) {
			jtableReport.addElementTOtable(objects);
		}
     
		this.add(jtableReport,BorderLayout.CENTER);
	}
	public void visibletableReport(boolean estado) {
		jtableReport.setVisible(estado);
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
	public void visibleTable(boolean estado) {
		jtableElement.setVisible(estado);
	}
	public String estadoJComboReport() {
		return jPanelHeader.estadoJComboReport();
	}
	public void tabledeReport(String titule, String operacion,ArrayList<Object[]> datasFarm) {
		jtableReport.clean(titule,operacion);
//		jtableReport.cleanRowsTable();
//		jtableReport=new JtableReport(titule,operacion);
		for (Object[] objects : datasFarm) {
	
		jtableReport.addElementTOtable(objects);
		}
		this.add(jtableReport,BorderLayout.CENTER);
	}
	public void borrarJtableReport() {
		jtableReport.cleanRowsTable();
	}


}
