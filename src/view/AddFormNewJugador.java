package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

//import com.toedter.calendar.JDateChooser;

import controller.ActionCompoonet;

public class AddFormNewJugador extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AddJTextField firstName;
	AddJTextField secondName;
	AddJTextField lastName; 
	AddJTextField second;
	AddJTextField minute;
	AddJTextField hora; 
	JComboBox<String> jComboTeam;
	JComboBox<String> jComboGender;
	ButtonGroup team;
	String gender;
	JDateChooser birthDate;

	public AddFormNewJugador( ActionListener actionListener) {
		setPreferredSize(new Dimension(450,700));
		setBackground(Color.white);
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(5);
		setLayout( flowLayout);
		setBackground(Color.getColor("#DDDD5F5"));
		Border border = LineBorder.createGrayLineBorder();
		setBorder(border);
		initComponents(actionListener);
	}
	private void initComponents(ActionListener actionListener) {
		add(Box.createRigidArea(new Dimension(0,30)));
		addTitle();
		addJTextField(); 
		addJcaledarBirthDate( actionListener);
//		addGender();
//		addTeam();
		addTotalTravelTime();
		addButtone(actionListener); 
//		addRegistro();
//		add(Box.createRigidArea(new Dimension(0,30)));
	}
	private void addTitle() {
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(400,50));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(5);
		panel.setLayout(flowLayout);
		JLabel title = new JLabel("Ingrese los datos del jugador");
		title.setFont(new Font("Rubik, Arial, sans-serif", 1, 25));
		panel.add(title);
		this.add(panel,BorderLayout.CENTER);
	}
	private void addJTextField() {

		JPanel panel=new JPanel();
		JPanel panelTitle=new JPanel();
		panel.setPreferredSize(new Dimension(400,125));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(5);
		panel.setLayout(flowLayout);
		panelTitle.setLayout(flowLayout);
		//String id, String firstName,String secondName, String lastName, String birthDate, String gender, TypeTeam team, String totalTravelTime 
		firstName =new AddJTextField("NOMBRE");
//		firstName.setActionCommand(ActionCompoonet.C_BORRAR_TEXT.toString());
//		secondName =new AddJTextField("Segun nombre");
		lastName =new AddJTextField("APELLIDO");

		panel.add(firstName);
//		panel.add(secondName);
		panel.add(lastName);
		this.add(panel,BorderLayout.CENTER);
	}
	private void addJcaledarBirthDate(ActionListener actionListener) {

		JPanel panel=new JPanel();
		JPanel panelTitle=new JPanel();
		panel.setPreferredSize(new Dimension(400,50));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(20);
		panel.setLayout(flowLayout);
		panelTitle.setLayout(flowLayout);
		panelTitle.setPreferredSize(new Dimension(400,30));
//		panelTitle.setBackground(Color.blue);
		
		JLabel title = new JLabel("Ingrese su fecha de nacimiento");
		title.setFont(new Font("Rubik, Arial, sans-serif", 1, 16));
		birthDate = new JDateChooser("yyyy/MM/dd", "####/##/##", '_');
		birthDate.setPreferredSize(new Dimension(350,35));
		
		panelTitle.add(title);
//		panel.add(birthDate);
		this.add(panelTitle);
		this.add(birthDate,BorderLayout.CENTER);
	}
	private void addJersey() {
		// TODO Auto-generated method stub

	}
	private void addGender() {
		JPanel panel=new JPanel();
		JPanel panelTitle=new JPanel();
		panel.setPreferredSize(new Dimension(400,25));
		panelTitle.setPreferredSize(new Dimension(400,25));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(20);
//		panel.setLayout(flowLayout);
		panelTitle.setLayout(flowLayout);
		
		JLabel title = new JLabel("Selecione su genero");
		title.setFont(new Font("Rubik, Arial, sans-serif", 1, 16));
		
		JRadioButton masculino= new JRadioButton("Masculino",true);
		JRadioButton femenino= new JRadioButton("Femenino",false);
	
		
		ButtonGroup groupGender = new ButtonGroup();

		groupGender.add(masculino); 
		groupGender.add(femenino); 
		
		System.out.println(femenino.isSelected());
		if(masculino.isSelected()) {
			gender = masculino.getText();
		}else if(femenino.isSelected()){
			gender = femenino.getText();
		
		}
		panelTitle.add(title);
//		panel.add(masculino);
//		panel.add(femenino);
		
		jComboGender=new JComboBox<String>();
		jComboGender.setPreferredSize(new Dimension(350,30));
		jComboGender.addItem("Masculino");
		jComboGender.addItem("Femenino");
		this.add(panelTitle);
		this.add(jComboGender);

	}
	private void addTeam() {
		JPanel panel=new JPanel();
		JPanel panelTitle=new JPanel();
		panel.setPreferredSize(new Dimension(400,80));
		panelTitle.setPreferredSize(new Dimension(400,30));
//		panelTitle.setBackground(Color.blue);
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(20);
//		panel.setLayout(flowLayout);
		panelTitle.setLayout(flowLayout);
		
		JLabel title = new JLabel("Selecione su Equipo");
		title.setFont(new Font("Rubik, Arial, sans-serif", 1, 16));
		
		JRadioButton movistar= new JRadioButton("MOVISTAR",true);
		JRadioButton katusha= new JRadioButton("KATUSHA",false);
		JRadioButton nkoff= new JRadioButton("NKOFF",true);
		JRadioButton bmc= new JRadioButton("BMC",false);
		JRadioButton sky= new JRadioButton("SKY",true);
		JRadioButton iam= new JRadioButton("IAM CYCLING",false);
		JRadioButton tin= new JRadioButton("TINKOFF",false);
		
		team = new ButtonGroup();
		team.add(movistar); 
		team.add(katusha); 
		team.add(nkoff); 
		team.add(bmc); 
		team.add(sky); 
		team.add(iam); 
		team.add(tin); 
		
		panelTitle.add(title);
		panel.add(panelTitle);
//		panel.add(movistar); 
//		panel.add(katusha); 
//		panel.add(nkoff); 
//		panel.add(bmc); 
//		panel.add(sky); 
//		panel.add(iam); 
//		panel.add(tin); 
		
//		JTextField p =new JTextField();
//		p.setPreferredSize(new Dimension(100,30));
//		p.setBorder(BorderFactory.createTitledBorder("Java Zone"));
		
		  JTextField t=new JTextField(20);
		  t.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
		  JTextArea ta=new JTextArea(10,10);
		  ta.setBorder(BorderFactory.createMatteBorder(8, 2, 2, 2, Color.BLUE));
//		  JPanel p2=new JPanel();
//		  p2.add(ta);
//		  p.setBorder(BorderFactory.createTitledBorder("Java Zone"));
		  
		  
//		  JPanel p1=new JPanel();
//	        p1.setBorder(BorderFactory.createTitledBorder("Con ToolTipText"));       
//	        p1.add(p);
	
//		this.add(p);
		
			jComboTeam= new JComboBox<>();
			jComboTeam.setPreferredSize(new Dimension(350,30));
//			for (TypeTeam team : TypeTeam.values()) {
//				jComboTeam.addItem(team.getName());
//			}
		panel.add(jComboTeam);
		this.add(panel);
//		add(Box.createRigidArea(new Dimension(0,10)));
	

	}
	private void addTotalTravelTime() {
		JPanel panel=new JPanel();
		JPanel paneltitle=new JPanel();
		
		JLabel title = new JLabel("Ingrese su fecha la duracion del ciclista");
		title.setFont(new Font("Rubik, Arial, sans-serif", 1, 16));
		panel.setPreferredSize(new Dimension(300,80));
		paneltitle.setPreferredSize(new Dimension(400,25));
		FlowLayout flowLayout1=new FlowLayout(FlowLayout.LEFT);
		panel.setLayout(flowLayout1);
//		panel.setLayout( new BoxLayout( this, BoxLayout.X_AXIS ));
		JPanel panelHora=new JPanel();
		JPanel panelminuto=new JPanel();
		JPanel panelSecond=new JPanel();
		
		panelHora.setPreferredSize(new Dimension(80,60));
		panelminuto.setPreferredSize(new Dimension(80,60));
		panelSecond.setPreferredSize(new Dimension(80,60));
		
		FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);
		flowLayout.setHgap(20);
		
		paneltitle.setLayout(flowLayout);
		panelHora.setLayout(flowLayout);
		panelminuto.setLayout(flowLayout);
		panelSecond.setLayout(flowLayout);
		
		JLabel titleHora = new JLabel("Horas");
		JLabel titleMin = new JLabel("Minutos");
		JLabel titleSecond = new JLabel("segundos");
		
		hora=new AddJTextField();
		minute=new AddJTextField();
		second=new AddJTextField();
		paneltitle.add(title);
		
		panelHora.add(titleHora);
		panelHora.add(hora);

		panelminuto.add(titleMin);
		panelminuto.add(minute);
		

		panelSecond.add(titleSecond);
		panelSecond.add(second);
		
		panel.add(panelHora);
		panel.add(panelminuto);
		panel.add(panelSecond);
	
		this.add(paneltitle);
		this.add(panel);
		
	}
	private void addButtone(ActionListener actionListener) {
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(400,80));
		FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER);
		flowLayout.setHgap(10);
		panel.setLayout(flowLayout);
		JButton guardar = new JButton("GUARDAR");
		guardar.setPreferredSize(new Dimension(100,50));
		guardar.setActionCommand(ActionCompoonet.C_GUARDAR.toString());
		
		guardar.addActionListener(actionListener);
		this.add(guardar);
		JButton cancelar = new JButton("CANCELAR");
		cancelar.setPreferredSize(new Dimension(100,50));
		panel.add(guardar);
		panel.add(cancelar);
		this.add(panel);
	}
//	public String addRegistro() {
	
//		String registro = firstName.getText()+"?"+secondName.getText()+"?"+lastName.getText()+"?"+secondName.getText()+"?"+ hora.getText()+(String)jComboTeam.getSelectedItem()+"?"+gender;
		
//		JButton guardar = new JButton("GUARDAR");
//		guardar.setActionCommand(ActionCompoonet.C_GUARDAR.toString());
//		guardar.addActionListener(actionListener);
//		this.add(guardar);
//				AddJTextField firstName;
//		AddJTextField secondName;
//		AddJTextField lastName; 
//		AddJTextField second;
//		AddJTextField minute;
//		AddJTextField hora; 
//		return registro;

//	}
	public AddJTextField getFirstName() {
		return firstName;
	}
	public void setFirstName(AddJTextField firstName) {
		this.firstName = firstName;
	}
	public AddJTextField getSecondName() {
		return secondName;
	}
	public void setSecondName(AddJTextField secondName) {
		this.secondName = secondName;
	}
	public AddJTextField getLastName() {
		return lastName;
	}
	public void setLastName(AddJTextField lastName) {
		this.lastName = lastName;
	}
	

	
}
