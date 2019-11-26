package views.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.simple.DeserializationException;

import controller.Commands;
import general.HandlerLanguage;
import models.Pond;
import models.FishFarm;
import views.Constants;
import views.JButtonsMenuAndDialogs;
import views.MyJFramePpal;
import views.MyJTextField;

public class JDialogTwo extends JDialog{

    private static final long serialVersionUID = 1L;
    private MyJTextField id, year, seeded, harvested, weight, production, price;
    private JComboBox<String> species, municipality;
    private JButtonsMenuAndDialogs buttonAcept, buttonCancel;
    private JLabel idL, yearL, seededL, harvestedL, weightL, productionL, priceL, specieslL, municipalityL;
	
    public JDialogTwo(MyJFramePpal frame,ActionListener actionListenner,String title, String routeImage,boolean editButtons) {
    	setMinimumSize(new Dimension(430,600));
    	setMaximumSize(new Dimension(430,600));
    	getRootPane().setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    	setIconImage(new ImageIcon(routeImage).getImage());
		setLocationRelativeTo(frame);
		setTitle(title);
		setModal(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		initComponents(actionListenner,editButtons);
    }
    public JDialogTwo() {}
      private void initComponents(ActionListener actionListenner,boolean editButtons) {
    	addJDialogs();
    	addJComboBoxSpecies();
    	addJComboBoxMunicipality();
    	if(editButtons == false)
            addButtons(actionListenner);
    }
	
    private void addJDialogs() {
//    	idL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
//    	add(idL);
//    	id = new MyJTextField();
//    	add(id);
    	yearL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_YEAR));
    	add(yearL);
    	year = new MyJTextField();
    	add(year);
    	seededL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_SEEDED_ANIMALS));
		add(seededL);
		seeded = new MyJTextField();
		add(seeded);
		harvestedL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_HARVESTED_ANIMALS));
		add(harvestedL);
		harvested = new MyJTextField();
		add(harvested);
		weightL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_WEIGHT_ANIMALS));
		add(weightL);
		weight = new MyJTextField();
		add(weight);
		productionL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRODUCTION_ANIMALS));
		add(productionL);
		production = new MyJTextField();
		add(production);
		priceL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRICE_ANIMALS));
		add(priceL);
		price = new MyJTextField();
		add(price);
    }
	
    private void addJComboBoxSpecies() {
    	specieslL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_SPECIE));
    	add(specieslL);
    	species = new JComboBox<String>();
    	species.setBackground(Color.WHITE);
    	species.setForeground(Color.BLACK);
    	species.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 16));
    	species.addItem("BOCACHICO");
    	species.addItem("CACHAMA");
    	species.addItem("CARPA");
    	species.addItem("RTRUCHA");
    	species.addItem("TILAPIA NEGRA");
    	species.addItem("TILAPIA O MOJARRA");
    	species.addItem("TILAPIA O MOJARRA ROJA");
    	species.addItem("TRUCHA");
    	species.addItem("UCACHAMA");
    	species.addItem("UTILAPIA NEGRA");
    	species.addItem("UTILAPIA O MOJARRA");
    	species.setFocusable(false);
    	add(species);
    }
	
    private void addJComboBoxMunicipality() {
    	municipalityL = createLabel(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_MUNICIPALITY));
    	add(municipalityL);
    	municipality = new JComboBox<String>();
    	municipality.setBackground(Color.WHITE);
    	municipality.setForeground(Color.BLACK);
    	municipality.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 16));
    	municipality.addItem("ALMEIDA");
		municipality.addItem("AQUITANA");
		municipality.addItem("ARCABUCO");
		municipality.addItem("BELEN");
		municipality.addItem("BERBEO");
		municipality.addItem("BETEITIVA");
		municipality.addItem("BOAVITA");
		municipality.addItem("BOYACA");
		municipality.addItem("BRICEÑO");
		municipality.addItem("CAMPOHERMOSO");
		municipality.addItem("CHINAVITA");
		municipality.addItem("CHIQUINQUIRA");
		municipality.addItem("CHISCAS");
		municipality.addItem("CHIVOR");
		municipality.addItem("COPER");
		municipality.addItem("COVARACHIA");
		municipality.addItem("CUBARA");
		municipality.addItem("DUITAMA");
		municipality.addItem("EL COCUY");
		municipality.addItem("GAMEZA");
		municipality.addItem("GARAGOA");
		municipality.addItem("GUACAMAYAS");
		municipality.addItem("GUAYATAN");
		municipality.addItem("GUICAN");
		municipality.addItem("JENESANO");
		municipality.addItem("LABRANZAGRANDE");
		municipality.addItem("LA UVITA");
		municipality.addItem("LA VICTORIA");
		municipality.addItem("MARIPI");
		municipality.addItem("MIRAFLORES");
		municipality.addItem("MONGUI");
		municipality.addItem("MONIQUIRA");
		municipality.addItem("MUZO");
		municipality.addItem("OTANCHE");
		municipality.addItem("PACHAVITA");
		municipality.addItem("PAEZ");
		municipality.addItem("PAIPA");
		municipality.addItem("PAJARITO");
		municipality.addItem("PANQUEBA");
		municipality.addItem("PAUNA");
		municipality.addItem("PAYA");
		municipality.addItem("PAZ DEL RIO");
		municipality.addItem("PESCA");
		municipality.addItem("PISBA");
		municipality.addItem("PUERTO BOYACA");
		municipality.addItem("QUIPAMA");
		municipality.addItem("RAQUIRA");
		municipality.addItem("SABOYA");
		municipality.addItem("SAMACA");
		municipality.addItem("SAN EDUARDO");
		municipality.addItem("SAN JOSE DE PARE");
		municipality.addItem("SAN LUIS DE GACENO");
		municipality.addItem("SAN MATEO");
		municipality.addItem("SAN PABLO DE BORB");
		municipality.addItem("SAN PABLO DE BORBUR");
		municipality.addItem("SANTA MARIA");
		municipality.addItem("SANTANA");
		municipality.addItem("SANTA ROSA DE VITERBO");
		municipality.addItem("SATIVANORTE");
		municipality.addItem("SATIVASUR");
		municipality.addItem("SOATA");
		municipality.addItem("SOCOTA");
		municipality.addItem("SOGAMOSO");
		municipality.addItem("SOMONDONGO");
		municipality.addItem("SORACA");
		municipality.addItem("SOTAQUIRA");
		municipality.addItem("SUSACON");
		municipality.addItem("SUTAMARCHAN");
		municipality.addItem("TASCO");
		municipality.addItem("TIBANA");
		municipality.addItem("TINJACA");
		municipality.addItem("TOGUI");
		municipality.addItem("TUNUNGUA");
		municipality.addItem("TURMEQUE");
		municipality.addItem("TUTAZA");
		municipality.addItem("UMBITA");
		municipality.addItem("VENTAQUEMADA");
		municipality.addItem("VIRACACHA");
		municipality.addItem("ZETAQUIRA");
		municipality.setFocusable(false);
		add(municipality);
    }

	
    private void addButtons(ActionListener actionListenner) {
    	JPanel panelButtons = createPanel(10);
    	panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
    	buttonAcept = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.ACCEPT),120,35);
    	buttonAcept.addActionListener(actionListenner);
    	buttonAcept.setActionCommand(Commands.CLOSE_ADD_DIALOG.toString());
    	panelButtons.add(buttonAcept);
		buttonCancel = new JButtonsMenuAndDialogs(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL),120,35);
		buttonCancel.addActionListener(actionListenner);
		buttonCancel.setActionCommand(Commands.CLOSE_DIALOG_ADD_CANCEL.toString());
		panelButtons.add(buttonCancel);
		add(panelButtons);
    }
    
    public void changeLanguage(){
//		idL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_ID));
		yearL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_YEAR));
		seededL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_SEEDED_ANIMALS));
		harvestedL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_HARVESTED_ANIMALS));
		weightL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_WEIGHT_ANIMALS));
		productionL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRODUCTION_ANIMALS));
		priceL.setText(HandlerLanguage.languageProperties.getProperty(Constants.IN_PRICE_ANIMALS));
		specieslL.setText(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_SPECIE));
		municipalityL.setText(HandlerLanguage.languageProperties.getProperty(Constants.SELECT_MUNICIPALITY));
		buttonAcept.setText(HandlerLanguage.languageProperties.getProperty(Constants.ACCEPT));
		buttonCancel.setText(HandlerLanguage.languageProperties.getProperty(Constants.CANCEL));
	}
	
    private JPanel createPanel(int separation) {
    	JPanel panel = new JPanel();
    	FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    	layout.setHgap(separation);
    	panel.setLayout(layout);
		panel.setOpaque(false);
		return panel;
    }
	
    private JLabel createLabel(String text) {
    	JLabel label = new JLabel("<html><b>" +text +"</b></html>");
    	label.setForeground(Color.BLACK);
    	label.setAlignmentX(RIGHT_ALIGNMENT);
    	label.setFont(new Font(Constants.FONT_RUBIK, Font.ITALIC, 14));
    	label.setOpaque(false);
    	return label;
    }
	
    public long getId() {
    	return Long.parseLong(id.getText());
    }
	
    public long getYear() {
    	long yearLong =0;
    	try {
    		yearLong=Long.parseLong(year.getText());
		} catch (NumberFormatException e) {
			yearLong=validaCadena(year.getText());
		}
    	return yearLong;
    }
	private long validaCadena(String text) {
		long newLong =0;
		String newtext="";
		for (int i = 0; i < text.length(); i++) {
//			System.out.println("char"+text.charAt(i));
			if((int)text.charAt(i)!=32) {
				newtext+=Character.toString(text.charAt(i)); 
			}
			
		}
		newLong=Long.parseLong(newtext);
//		System.out.println("vota"+newLong);
		return newLong;
	}
    public long getSeeded() {
    	long longSeeded =0;
    	try {
    		longSeeded=Long.parseLong(seeded.getText());
		} catch (NumberFormatException e) {
			longSeeded=validaCadena(seeded.getText());
		}
//    	System.out.println(year.getText());
    	return longSeeded;
    }
	
    public long getHarvested() {
    	long longHarvested =0;
    	try {
    		longHarvested=Long.parseLong(harvested.getText());
		} catch (NumberFormatException e) {
			longHarvested=validaCadena(harvested.getText());
		}
//    	System.out.println(year.getText());
    	return longHarvested;
    }
    
    public long getWeight() {
    	long longWeight =0;
    	try {
    		longWeight=Long.parseLong(weight.getText());
		} catch (NumberFormatException e) {
			longWeight=validaCadena(weight.getText());
		}
    	return longWeight;
    }
    
    public long getProduction() {
    	long longProduction =0;
    	try {
    		longProduction=Long.parseLong(production.getText());
		} catch (NumberFormatException e) {
			longProduction=validaCadena(production.getText());
		}
    	return longProduction;
    }
    
    public long getPrice() {
    	long longPrice =0;
    	try {
    		longPrice=Long.parseLong(price.getText());
		} catch (NumberFormatException e) {
			longPrice=validaCadena(price.getText());
		}
    	return longPrice;
    }
	
    public String getSpecie() {
    	return (String) species.getSelectedItem();
    }
	
    public String getMunicipality() {
    	return (String) municipality.getSelectedItem();
    }
	
    public void clearComponents() {
//    	id.setText(Constants.EMPTY);
    	year.setText(Constants.EMPTY);
    	seeded.setText(Constants.EMPTY);
    	harvested.setText(Constants.EMPTY);
    	weight.setText(Constants.EMPTY);
    	production.setText(Constants.EMPTY);
    	price.setText(Constants.EMPTY);
    }
	
	 
    public boolean verifyEmptyComponents() {
    	boolean isEmpty = true;
    	if(year.getText().isEmpty() || seeded.getText().isEmpty() || harvested.getText().isEmpty() || weight.getText().isEmpty() || production.getText().isEmpty() || price.getText().isEmpty())
            isEmpty = false;
    	return isEmpty;
    }
//	
    public void getInformationRunner(Pond pond) {
//    	id.setEditable(false);
//    	id.setText(Long.toString(pond.getId()));
    	year.setText(Long.toString(pond.getYear()));
    	seeded.setText(Long.toString(pond.getSeeded()));
    	harvested.setText(Long.toString(pond.getHaversted()));
    	weight.setText(Long.toString(pond.getWeight()));
    	production.setText(Long.toString(pond.getProduction()));
    	price.setText(Long.toString(pond.getPrice()));
    	species.setSelectedItem(pond.getSpecie());
    	municipality.setSelectedItem(pond.getMunicipality()); 
    }
	
    public Pond createRunner() {
    	return FishFarm.createRunner( getYear(), getMunicipality(), getSpecie(), getSeeded(), getHarvested(), getWeight(), getProduction(), getPrice());
    }
    
    public Object[] createRunner2() {
    	Object[] object = new Object[8];
    	object[0]=Long.toString(getId());
    	object[1]=Long.toString(getYear());
    	object[2]=getMunicipality();
    	object[3]=getSpecie();
    	object[4]=getSeeded();
    	object[5]=Long.toString(getHarvested());
    	object[6]=Long.toString(getWeight());
    	object[7]=Long.toString(getProduction());
    	object[8]=Long.toString(getPrice());
    	
    	return object;
    }
//    public static void main(String[] args) throws IOException, DeserializationException {
//    	JDialogTwo jDialogTwo= new JDialogTwo();
//    	jDialogTwo.validaCadena("  1212");
//    }
}
