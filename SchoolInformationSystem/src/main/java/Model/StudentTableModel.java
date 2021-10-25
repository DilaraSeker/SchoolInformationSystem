package Model;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


@SuppressWarnings("serial")
public class StudentTableModel extends DefaultTableModel{

	private static TableModel table;
	
	public void showStudent() {
		
		Database db =new Database();
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList=db.getStudents();
      
        Object[] columnData = new Object[] {"Student Id","Surname","Name","Grade","Age","Fee"};
		DefaultTableModel model = new DefaultTableModel(columnData, 0);
        
        try {
        	for (int i = 0; i < studentList.size(); i++){
        		 String studentID = studentList.get(i).getStudentID();
        		 String surname = studentList.get(i).getSurname();
        		 String name = studentList.get(i).getName();
        		 int grade = studentList.get(i).getGrade();
        		 int age = studentList.get(i).getAge();
        		 int fee = studentList.get(i).getFee();
        		 
        		 Object[] data = {studentID, surname, name, grade, age, fee};

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
