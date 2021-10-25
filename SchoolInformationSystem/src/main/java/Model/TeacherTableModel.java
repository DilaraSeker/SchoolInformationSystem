package Model;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class TeacherTableModel extends DefaultTableModel{
	
private static TableModel table;
	
	public void showTeacher() {
		
		Database db =new Database();
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList=db.getTeachers();
		      
        Object[] columnData = new Object[] {"Surname","Name","Branch","Salary"};
		DefaultTableModel model = new DefaultTableModel(columnData, 0);
        
        try {
        	for (int i = 0; i < teacherList.size(); i++){
        		 String surname = teacherList.get(i).getSurname();
        		 String name = teacherList.get(i).getName();
        		 String branch = teacherList.get(i).getBranch();
        		 int salary = teacherList.get(i).getSalary();
        		        		 
        		 Object[] data = { surname, name, branch, salary};

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
