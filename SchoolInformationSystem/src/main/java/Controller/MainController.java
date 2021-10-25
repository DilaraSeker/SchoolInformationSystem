package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ClassTableModel;
import Model.MainModel;
import Model.SchoolBusTableModel;
import Model.StudentTableModel;
import Model.TeacherTableModel;
import View.ClassView;
import View.MainView;
import View.SchoolBusView;
import View.StudentView;
import View.TeacherView;


@SuppressWarnings("unused")
public class MainController {
	  
    private final MainModel model;
    private final MainView view;
	
	public MainController(MainModel m,MainView v){
	    
        model = m;
        view = v;
	
	   view.viewStudentsListener(new ViewStudentsListener());
	   view.viewTeachersListener(new ViewTeachersListener());
	   view.viewClassesListener(new ViewClassesListener());
	   view.viewSchoolBusesListener(new ViewSchoolBusesListener());
	}
	class ViewStudentsListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			StudentTableModel studentModel = new StudentTableModel();
	        StudentView studentView = new StudentView();
	        StudentController studentController = new StudentController(studentModel,studentView);
	    
	    }
	}
	class ViewTeachersListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			TeacherTableModel teacherModel = new TeacherTableModel();
	        TeacherView teacherView = new TeacherView();
	        TeacherController studentController = new TeacherController(teacherModel,teacherView);
	        //teacherView.setVisible(true);
	    }
	}
	class ViewClassesListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ClassTableModel classModel = new ClassTableModel();
	        ClassView classView = new ClassView();
	        ClassController classController = new ClassController(classModel,classView);
	       
	    }
	}
	class ViewSchoolBusesListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			SchoolBusTableModel schoolBusModel = new SchoolBusTableModel();
			SchoolBusView schoolBusView = new SchoolBusView();
			SchoolBusController classController = new SchoolBusController(schoolBusModel,schoolBusView);
	       
	    }
	}
}
