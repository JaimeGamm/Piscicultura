package views.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import general.HandlerLanguage;
import views.Constants;

public class JtableReport extends JPanel{

	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;
	String[] headrs;
	
	public JtableReport(String titule1,String operacion) {
		headrs=new String[2];
		initComponents(titule1, operacion);
	}
	
	private void initComponents(String titule1, String operacion) {
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.WHITE);
		headrs[0]= titule1;
		headrs[1]= operacion;
		dtmElements=new DefaultTableModel();
		dtmElements.setColumnIdentifiers(headrs);
		Font fontHeader =new Font(Constants.FONT_RUBIK, Font.BOLD,14);
		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Constants.MY_ORANGE);
		jtElements.getTableHeader().setForeground(Color.WHITE);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setBackground(Constants.GRAY_LIGHT);
		jtElements.setForeground(Color.BLACK);
		jtElements.setRowHeight(35);
		jtElements.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD,12));
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);
		jsTable = new JScrollPane(jtElements);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable,BorderLayout.PAGE_END);
		setBorder(null);
			} 
	
	public void changeLanguageColunmJtableR(String titule1, String operation){
		String[] headers = {HandlerLanguage.languageProperties.getProperty(titule1), 
				HandlerLanguage.languageProperties.getProperty(operation),
				};
		dtmElements.setColumnIdentifiers(headers);
		repaint();
	}
	
	public void changeLanguageColunmJtable1(){
		String[] headers= {HandlerLanguage.languageProperties.getProperty(Constants.SPECIE), 
				HandlerLanguage.languageProperties.getProperty(Constants.PRICE_ANIMAL),
				};
		dtmElements.setColumnIdentifiers(headers);
		repaint();
	}
	
	public void addElementTOtable(Object[] vector) {
		dtmElements.addRow(vector);
	}

	public void cleanRowsTable() {
		dtmElements.setNumRows(0);
	}
	
	public String[] getHeadrs() {
		return headrs;

	}
		
	public void clean(String titule1,String operacion) {
		dtmElements.setColumnCount(0);
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#30373D"));
		headrs[0]= titule1;
		headrs[1]= operacion;
		dtmElements=new DefaultTableModel();
		dtmElements.setColumnIdentifiers(headrs);
		Font fontHeader =new Font(Constants.FONT_RUBIK, Font.BOLD,14);
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Constants.MY_ORANGE);
		jtElements.getTableHeader().setForeground(Color.WHITE);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setBackground(Constants.GRAY_LIGHT);
		jtElements.setForeground(Color.BLACK);
		jtElements.setRowHeight(35);
		jtElements.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD,12));
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable,BorderLayout.PAGE_END);
		setBorder(null);
		
	}
	
	public void setHeadrs(String[] headrs) {
		this.headrs = headrs;
	}
}
