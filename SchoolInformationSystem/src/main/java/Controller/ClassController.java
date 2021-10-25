package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ClassTableModel;
import Model.ClassUpdateModel;
import View.ClassView;
import View.ClassUpdateView;

public class ClassController {
	 private final ClassTableModel model;
	 private final ClassView view;
	
	public ClassController(ClassTableModel m,ClassView v){
		    
		 model = m;
	     view = v;
	        
	     model.showClass();   
	     view.setClassTable(model.getTable());
	     view.updateClassListener(new UpdateClassListener());
	 }
	class UpdateClassListener implements ActionListener{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {
			ClassUpdateModel classUpdateModel = new ClassUpdateModel();
			ClassUpdateView classUpdateView = new ClassUpdateView();
			ClassUpdateController classUpdateController = new ClassUpdateController(classUpdateModel,classUpdateView);
			classUpdateView.setVisible(true);
	    }
	}

}
