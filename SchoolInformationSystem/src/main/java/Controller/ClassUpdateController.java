package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import Model.ClassUpdateModel;
import View.ClassUpdateView;

public class ClassUpdateController  {
    
    private final ClassUpdateModel model;
    private final ClassUpdateView view;
    
    public ClassUpdateController(ClassUpdateModel m,ClassUpdateView v){
        
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
				model.getClassByGrade(view.getClassGrade());
			
            
            if(model.getStatus()){
                view.setPermissionOn();
                view.setGrade(model.getClassGrade());
                view.setMonday(model.getMonday());
                view.setTuesday(model.getTuesday());
                view.setWednesday(model.getWednesday());
                view.setThursday(model.getThursday());
                view.setFriday(model.getFriday());
                view.submitButtonVisibilityOn();
            }
            else{
                view.setPermissionOff();
                view.setGrade(null);
                view.setMonday(null);
                view.setTuesday(null);
                view.setWednesday(null);
                view.setThursday(null);
                view.setFriday(null);
            }
            } catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
    
    class SubmitListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            String grade = model.getClassGrade();
            String monday = view.getMonday();
            String tuesday = view.getTuesday();
            String wednesday = view.getWednesday();
            String thursday = view.getThursday();
            String friday = view.getFriday();
            
			try {
				model.updateTeachertByBranch(grade,monday,tuesday,wednesday,thursday,friday);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
        }
    }
    
    class CancelListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
           
            view.setPermissionOff();
            view.setGrade(null);
            view.setMonday(null);
            view.setTuesday(null);
            view.setWednesday(null);
            view.setThursday(null);
            view.setFriday(null);
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
