package views.body;

import java.awt.Color;
import javax.swing.JPanel;
import views.Constants;

public class JPBody extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private BackgroundHome backgroundHome;
    private BackgroundHome2 backgroundHome2, backgroundHome3;
	
	public JPBody() {
		setBackground(Color.WHITE);
		initComponets();
	}
	
	 public void initComponets() {
	    	backgroundHome2 = new BackgroundHome2(Constants.BACKGROUND_HOME_ONE);
	    	add(backgroundHome2);
	    	backgroundHome = new BackgroundHome();
	    	add(backgroundHome);
	    	backgroundHome3 = new BackgroundHome2(Constants.BACKGROUND_HOME_TWO);
	    	add(backgroundHome3);
	    }

}
