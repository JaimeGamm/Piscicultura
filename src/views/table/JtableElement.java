package views.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import general.HandlerLanguage;
import views.Constants;
import views.PLogoTable;
import views.PTextLabel;
import views.footer.Footer;

public class JtableElement extends JPanel{

	
	public static final int WIDTH_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	public static final int HEIGHT_SCREEN = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;
    private PLogoTable logoTable;
    private PTextLabel label;
    private Footer footer;
    private Panel jPanel;
	
	public JtableElement(ActionListener actionListenner) {
		logoTable = new PLogoTable();
		logoTable.setPreferredSize(new Dimension(WIDTH_SCREEN-50,100));
		logoTable.setBackground(Color.WHITE);;
		this.add(logoTable);
		label = new PTextLabel(actionListenner);
		label.setPreferredSize(new Dimension(WIDTH_SCREEN-50,40));
		add(label);
		initComponents();
		jPanel = new Panel();
		jPanel.setPreferredSize(new Dimension(WIDTH_SCREEN-50,230));
		jPanel.setBackground(Color.white);
		add(jPanel);
		footer = new Footer(actionListenner);
		footer.setPreferredSize(new Dimension(WIDTH_SCREEN, 150));
    	add(footer, BorderLayout.SOUTH);
	}
	
	public void changeLanguage() {
		label.changeLanguage();
	}

	
	private void initComponents() {
		this.setBackground(Color.white);
		dtmElements=new DefaultTableModel();
		changeLanguageColunmJtable();
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
		jsTable.setPreferredSize(new Dimension(WIDTH_SCREEN-100, 600));
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable);
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
