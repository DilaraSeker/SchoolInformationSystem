package Model;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class ClassTableModel extends DefaultTableModel{

	private static TableModel table;
	
	public void showClass() {
		
		Database db =new Database();
		ArrayList<Class> classList = new ArrayList<Class>();
		classList=db.getClasses();
      
        Object[] columnData = new Object[] {"Grade", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		DefaultTableModel model = new DefaultTableModel(columnData, 0);
        
        try {
        	for (int i = 0; i < classList.size(); i++){
        		 String grade = classList.get(i).getGradeID();
        		 String monday = classList.get(i).getMonday();
        		 String tuesday = classList.get(i).getTuesday();
        		 String wednesday = classList.get(i).getWednesday();
        		 String thursday = classList.get(i).getThursday();
        		 String friday = classList.get(i).getFriday();
        		 
        		 Object[] data = {grade, monday, tuesday, wednesday, thursday, friday};

         		 model.addRow(data);
        	}
        	table = model;
		} 
        catch (Exception e) {
				e.printStackTrace();
		}		
	}

	public TableModel getTable() {
		// TODO Auto-generated method stub
		return table;
	}


	
	
	
	
	
	

}
