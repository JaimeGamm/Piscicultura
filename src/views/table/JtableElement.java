package views.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import general.HandlerLanguage;
import views.Constants;

public class JtableElement extends JPanel{
	/**
	 * 
	 */
	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;
	public JtableElement() {
		initComponents();
	}
	private void initComponents() {
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.white);
		dtmElements=new DefaultTableModel();
		changeLanguageColunmJtable();
		Font fontHeader =new Font(Constants.FONT_RUBIK, Font.BOLD,14);
		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Constants.GRAY);
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
	
	public void changeLanguageColunmJtable(){
		String[] headers = {HandlerLanguage.languageProperties.getProperty(Constants.ID), 
				HandlerLanguage.languageProperties.getProperty(Constants.YEAR),
				HandlerLanguage.languageProperties.getProperty(Constants.MUNICIPALITY)
				,HandlerLanguage.languageProperties.getProperty(Constants.SPECIE)
				,HandlerLanguage.languageProperties.getProperty(Constants.SEEDED_ANIMALS)
				,HandlerLanguage.languageProperties.getProperty(Constants.HARVESTED_ANIMALS)
				,HandlerLanguage.languageProperties.getProperty(Constants.WEIGHT_ANIMAL)
				,HandlerLanguage.languageProperties.getProperty(Constants.PRODUCTION)
				,HandlerLanguage.languageProperties.getProperty(Constants.PRICE_ANIMAL)};
		dtmElements.setColumnIdentifiers(headers);
		repaint();
	}
	
	public void addPondList(ArrayList<Object[]> info) {
		for (Object[] objects : info) {
			dtmElements.addRow(objects);
		}
	}
	
	public void addElementTOtable(Object[] vector) {
		dtmElements.addRow(vector);
	}
	
	public void cleanRowsTable() {
		dtmElements.setNumRows(0);
	}
	
	public void showTablePonds(ArrayList<Object[]> info) {
		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		cleanRowsTable();
		String[] header = {Constants.ID,Constants.YEAR, Constants.MUNICIPALITY,Constants.SPECIE,Constants.SEEDED_ANIMALS,Constants.HARVESTED_ANIMALS,Constants.WEIGHT_ANIMAL,Constants.PRODUCTION,Constants.PRICE_ANIMAL};
		dtmElements=new DefaultTableModel();
		dtmElements.setColumnIdentifiers(header);

	}  
	
	public void stringFormat(ArrayList<Object[]> info) {
		ArrayList<Object[]> arrayFormat = new ArrayList<Object[]>();
		for (Object[] objects : info) {
			int i = 0;
			arrayFormat.add(new Object[] {objects[i],objects[++i],objects[++i],objects[++i],objects[++i],objects[++i],objects[++i],objects[++i]});
		}
		addPondList(arrayFormat);
	}
	public JTable tableOriginal() {
		return jtElements;
	}
	
}
