package Main;

import View.MainView;
import javax.swing.UIManager;

import Controller.MainController;
import Model.MainModel;

public class Main {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch ( Exception e) {
			((Throwable) e).printStackTrace();
		}
		
		MainView view = new MainView();
		MainModel model = new MainModel();
		MainController control= new MainController( model,view);
		java.awt.EventQueue.invokeLater(() -> {
            view.setVisible(true);
        });
	}

}
