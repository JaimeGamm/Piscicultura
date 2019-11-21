package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class JtableElement extends JPanel{
	private DefaultTableModel dtmElements;
	private JTable jtElements;
	private JScrollPane jsTable;
	public JtableElement() {
		initComponents();
	}
	private void initComponents() {
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#30373D"));
		String[] headrs = {"ID","MUNICIPIO","ESPECIE","ANIMALES SEMBRADOS","ANIMALES COSECHADOS","PESO PROMEDIO DEL ANIMAL AL COSECHA  (g)","PRODUCION ESTIMADA (kg)","PRECI AL PRODUCTOR(kg)"};
		dtmElements=new DefaultTableModel();
		dtmElements.setColumnIdentifiers(headrs);
		
		Font fontHeader =new Font("Frankin Gothic Demi", Font.ITALIC,14);
		
		jtElements = new JTable();
		jtElements.setModel(dtmElements);
		jtElements.getTableHeader().setReorderingAllowed(false);
		jtElements.getTableHeader().setBackground(Color.decode("#282E33"));
		jtElements.getTableHeader().setForeground(Color.white);
		jtElements.getTableHeader().setFont(fontHeader);
		jtElements.setRowHeight(40);
		
		jtElements.setFillsViewportHeight(true);
		jtElements.setBorder(null);
		
		jsTable = new JScrollPane(jtElements);
		jsTable.setForeground(Color.white);
		jsTable.setBorder(null);
		jsTable.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(jsTable,BorderLayout.PAGE_END);
		setBorder(null);
	}
	
	public void addElementTOtable(Object[] vector) {
		dtmElements.addRow(vector);
		//dtmElements.setNumRows(0);
	}
	
}
