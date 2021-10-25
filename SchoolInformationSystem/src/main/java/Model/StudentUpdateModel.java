package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import javax.json.JsonObject;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;


public class StudentUpdateModel {
	
private Database db ;
private boolean status;
private String studentID;
private String surname;
private String name;
private int grade;
private int age;
private int fee ;


public StudentUpdateModel(){

	db =new Database();
}

public void getStudentById(String studentId) throws FileNotFoundException{

    	JsonObject studentList = db.getStudentsObject();
        if(studentList.containsKey(studentId)){
        
            status = true;
                        
			for (final Entry<String, ?> entry : studentList.entrySet()) {
				  
				if( entry.getKey().equals(studentId)) {
					 
		            studentID = entry.getKey();
		            JsonObject value = (JsonObject) entry.getValue();
		            surname = value.getString("surname");
		            name = value.getString("name");
		            grade = value.getInt("grade");
		            age = value.getInt("age");
		            fee = value.getInt("fee");
				}	  
			}
        }
        else{
            status = false;
            JOptionPane.showMessageDialog(null, "Record Not Found");
        }
      
        
   
}


@SuppressWarnings("unchecked")
public void updateStudentByID(String id,String surname, String name, int grade, int age, int fee) throws  IOException, Exception{
	
	JSONObject student = new JSONObject();
	student.put("surname", surname);
	student.put("name", name);
	student.put("grade", grade);
	student.put("age", age);
	student.put("fee", fee);

   JSONObject school= db.getSchoolObject();
   JSONObject schoolObj = (JSONObject) school.get("school of music");
   JSONObject entity = (JSONObject) schoolObj.get("student");
 
   entity.put(id, student);
   db.writeSchoolObject(school);
}

public boolean getStatus(){

    return status;
}

public Database getDb() {
	return db;
}

public String getStudentID() {
	return studentID;
}

public String getSurname() {
	return surname;
}

public String getName() {
	return name;
}

public int getGrade() {
	return grade;
}

public int getAge() {
	return age;
}

public int getFee() {
	return fee;
}

}