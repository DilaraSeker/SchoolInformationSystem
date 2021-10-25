package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import Model.SchoolBusUpdateModel;
import View.SchoolBusUpdateView;

public class SchoolBusUpdateController {
    
    private final SchoolBusUpdateModel model;
    private final SchoolBusUpdateView view;
    
    public SchoolBusUpdateController(SchoolBusUpdateModel m,SchoolBusUpdateView v){
        
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
			
            
            if(model.getStatuss()){
                view.setPermissionOn();
                view.setId(model.getSchoolBusID());
                view.setCapacity(Integer.toString(model.getCapacity()));
                view.setStatus(model.getStatus());
                view.setArrived(model.getArrived());
                view.setStudents(model.getStudents());
                view.submitButtonVisibilityOn();
            }
            else{
                view.setPermissionOff();
                view.setId(null);
                view.setCapacity(null);
                view.setStatus(null);
                view.setArrived(null);
                view.setStudents(null);
            }
            } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
    
    class SubmitListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
                   
            
            
            String schoolBusID = model.getSchoolBusID();
            int capacity = view.getCapacity();
            String status = view.getStatus();
            String arrived = view.getArrived();
            String students = view.getStudents();
     
            
			try {
				model.updateSchoolBusById(schoolBusID,capacity,status, arrived,students);
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
            view.setCapacity(null);
            view.setStatus(null);
            view.setArrived(null);
            view.setStudents(null);
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
