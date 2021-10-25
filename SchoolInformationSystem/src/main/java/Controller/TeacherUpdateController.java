package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import Model.TeacherUpdateModel;
import View.TeacherUpdateView;

public class TeacherUpdateController {
    
    private final TeacherUpdateModel model;
    private final TeacherUpdateView view;
    
    public TeacherUpdateController(TeacherUpdateModel m,TeacherUpdateView v){
        
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
				model.getTeacherByBranch(view.getTeacherBranch());
			
            
            if(model.getStatus()){
                view.setPermissionOn();
                view.setBranch(model.getBranch());
                view.setName(model.getName());
                view.setSurname(model.getSurname());
                view.setSalary(Integer.toString(model.getSalary()));
                view.submitButtonVisibilityOn();
            }
            else{
                view.setPermissionOff();
                view.setBranch(null);
                view.setName(null);
                view.setSurname(null);
                view.setSalary(null);
            }
            } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
    
    class SubmitListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            String branch = model.getBranch();
            String surname = view.getSurname();
            String name = view.getName();
            int salary = view.getSalary();
            
			try {
				model.updateTeachertByBranch(branch,surname, name, salary);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
        }
    }
    
    class CancelListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
           
            view.setPermissionOff();
            view.setBranch(null);
            view.setName(null);
            view.setSurname(null);
            view.setSalary(null);
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
