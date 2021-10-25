package Controller;

import View.StudentUpdateView;
import View.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.StudentTableModel;
import Model.StudentUpdateModel;

public class StudentController {
	 private final StudentTableModel model;
	 private final StudentView view;
	 
	public StudentController(StudentTableModel m,StudentView v){
		    
		 model = m;
	     view = v;
	        
	     model.showStudent();   
	     view.setStudentTable(model.getTable());
	     view.updateStudentsListener(new UpdateStudentsListener());
	 }
	class UpdateStudentsListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			StudentUpdateModel studentUpdateModel = new StudentUpdateModel();
			StudentUpdateView studentUpdateView = new StudentUpdateView();
			@SuppressWarnings("unused")
			StudentUpdateController studentUpdateController = new StudentUpdateController(studentUpdateModel,studentUpdateView);
			studentUpdateView.setVisible(true);
	    }
	}
}
