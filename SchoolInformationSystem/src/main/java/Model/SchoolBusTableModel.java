package Model;

import java.util.ArrayList;

import javax.json.JsonArray;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class SchoolBusTableModel extends DefaultTableModel{

	private static TableModel table;
	
	public void showSchoolBus() {
		
		Database db =new Database();
		ArrayList<SchoolBus> schoolBusList = new ArrayList<SchoolBus>();
		schoolBusList=db.getSchoolBus();
		
        Object[] columnData = new Object[] {"School Bus Id","Capacity","Status","Arrived","Students"};
		DefaultTableModel model = new DefaultTableModel(columnData, 0);
        
        try {
        	for (int i = 0; i < schoolBusList.size(); i++){
        		 String schoolBusID = schoolBusList.get(i).getSchoolBusID();
        		 int capacity = schoolBusList.get(i).getCapacity();
        		 String status = schoolBusList.get(i).getStatus();
        		 String arrived = schoolBusList.get(i).getArrived();
        		 JsonArray students = schoolBusList.get(i).getStudents();
        	
        		 Object[] data = {schoolBusID, capacity, status, arrived, students};

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
