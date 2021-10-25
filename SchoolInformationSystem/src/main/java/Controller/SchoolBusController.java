package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.SchoolBusTableModel;
import Model.SchoolBusUpdateModel;
import View.SchoolBusUpdateView;
import View.SchoolBusView;

public class SchoolBusController {
	 private final SchoolBusTableModel model;
	 private final SchoolBusView view;
	 
	
	public SchoolBusController(SchoolBusTableModel m,SchoolBusView v){
		    
		 model = m;
	     view = v;
	        
	     model.showSchoolBus();   
	     view.setSchoolBusTable(model.getTable());
	     view.updateSchoolBusListener(new UpdateSchoolBusListener());
	 }
	class UpdateSchoolBusListener implements ActionListener{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {
			SchoolBusUpdateModel schoolBusUpdateModel = new SchoolBusUpdateModel();
			SchoolBusUpdateView schoolBusUpdateView = new SchoolBusUpdateView();
			SchoolBusUpdateController schoolBusUpdateController = new SchoolBusUpdateController(schoolBusUpdateModel,schoolBusUpdateView);
			schoolBusUpdateView.setVisible(true);
	    }
	}

}
