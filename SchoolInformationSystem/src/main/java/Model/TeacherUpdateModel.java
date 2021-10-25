package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;

import javax.json.JsonObject;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;

public class TeacherUpdateModel {
	
private Database db ;
private boolean status;
private String surname;
private String name;
private String teacherBranch;
private int salary;


public TeacherUpdateModel(){

	db =new Database();
}

public void getTeacherByBranch(String branch) throws FileNotFoundException{

    	JsonObject teacherList = db.getTeachersObject();
    	
        if(teacherList.containsKey(branch)){
        
            status = true;
                        
			for (final Entry<String, ?> entry : teacherList.entrySet()) {
				  
				if( entry.getKey().equals(branch)) {
					 
					teacherBranch = entry.getKey();
		            JsonObject value = (JsonObject) entry.getValue();
		            surname = value.getString("surname");
		            name = value.getString("name");
		            salary = value.getInt("salary");
		            
				}	  
			}
        }
        else{
            status = false;
            JOptionPane.showMessageDialog(null, "Record Not Found");
        }
      
        
   
}


@SuppressWarnings("unchecked")
public void updateTeachertByBranch(String branch,String surname, String name, int salary) throws  IOException, Exception{
	
	JSONObject teacher = new JSONObject();
	teacher.put("surname", surname);
	teacher.put("name", name);
	teacher.put("salary", salary);

   JSONObject school= db.getSchoolObject();
   JSONObject schoolObj = (JSONObject) school.get("school of music");
   JSONObject teacherObj = (JSONObject) schoolObj.get("teacher");
   JSONObject entity = (JSONObject) teacherObj.get("bracnh");
   
   entity.put(branch, teacher);
   db.writeSchoolObject(school);
}

public boolean getStatus(){

    return status;
}

public Database getDb() {
	return db;
}

public String getBranch() {
	return teacherBranch;
}

public String getSurname() {
	return surname;
}

public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}



}