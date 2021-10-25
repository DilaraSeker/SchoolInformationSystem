package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.TeacherTableModel;
import Model.TeacherUpdateModel;
import View.TeacherUpdateView;
import View.TeacherView;

public class TeacherController {
	private final TeacherTableModel model;
	private final TeacherView view;
	 
	@SuppressWarnings("static-access")
	public TeacherController(TeacherTableModel m,TeacherView v){
		    
		 model = m;
	     view = v;
	        
	     model.showTeacher();   
	     view.setTeacherTable(model.getTable());
	     view.updateTeachersListener(new UpdateTeachersListener());
	 }
	class UpdateTeachersListener implements ActionListener{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {
			TeacherUpdateModel teacherUpdateModel = new TeacherUpdateModel();
			TeacherUpdateView teacherUpdateView = new TeacherUpdateView();
			TeacherUpdateController teacherUpdateController = new TeacherUpdateController(teacherUpdateModel,teacherUpdateView);
			teacherUpdateView.setVisible(true);
	    }
	}
}