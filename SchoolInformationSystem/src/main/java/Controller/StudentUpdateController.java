package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;


import Model.StudentUpdateModel;
import View.StudentUpdateView;

public class StudentUpdateController {
    
    private final StudentUpdateModel model;
    private final StudentUpdateView view;
    
    public StudentUpdateController(StudentUpdateModel m,StudentUpdateView v){
        
        model = m;
        view = v;
        
        view.searchButtonListener(new SearchListener());
        view.submitButtonListener(new SubmitListener());
        view.cancelButtonListener(new CancelListener());
        view.closeWindowListener(new CloseListener());
    }
    
    class SearchListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            try {
				model.getStudentById(view.getStudentId());
			
            
            if(model.getStatus()){
                view.setPermissionOn();
                view.setId(model.getStudentID());
                view.setName(model.getName());
                view.setSurname(model.getSurname());
                view.setGrade(Integer.toString(model.getGrade()));
                view.setAge(Integer.toString(model.getAge()));
                view.setFee(Integer.toString(model.getFee()));
                view.submitButtonVisibilityOn();
            }
            else{
                view.setPermissionOff();
                view.setId(null);
                view.setName(null);
                view.setSurname(null);
                view.setGrade(null);
                view.setAge(null);
                view.setFee(null);
            }
            } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
    
    class SubmitListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            String id = model.getStudentID();
            String surname = view.getSurname();
            String name = view.getName();
            int grade = view.getGrade();
            int age = view.getAge();
            int fee = view.getFee();
            
			try {
				model.updateStudentByID(id,surname, name, grade, age, fee);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
        }
    }
    
    class CancelListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
           
            view.setPermissionOff();
            view.setId(null);
            view.setName(null);
            view.setSurname(null);
            view.setGrade(null);
            view.setAge(null);
            view.setFee(null);
            view.setVisible(false);
            view.submitButtonVisibilityOff();
        }
    }
    
    class CloseListener extends WindowAdapter{
       
        @Override
        public void windowClosing(WindowEvent e) {
        
            //model.closeConnection();
            view.setVisible(false);
            view.dispose();
        }
    }
    
}
