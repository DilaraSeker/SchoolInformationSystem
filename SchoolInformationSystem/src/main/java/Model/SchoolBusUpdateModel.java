package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;

public class SchoolBusUpdateModel {
	
private Database db ;
private boolean statuss;
private String schoolBusID;
private int capacity;
private String status;
private String arrived;
private JsonArray students;

public SchoolBusUpdateModel(){

	db =new Database();
}

public void getStudentById(String schoolBusID) throws FileNotFoundException{

    	JsonObject schoolBusList = db.getSchoolBusObject();
        if(schoolBusList.containsKey(schoolBusID)){
        
            statuss = true;
                        
			for (final Entry<String, ?> entry : schoolBusList.entrySet()) {
				  
				if( entry.getKey().equals(schoolBusID)) {
					 
					schoolBusID = entry.getKey();
		            JsonObject value = (JsonObject) entry.getValue();
		            capacity = value.getInt("capacity");
		            status = value.getString("status");
		            arrived = value.getString("arrived");
		            students = value.getJsonArray("students");		            
				}	  
			}
        }
        else{
            statuss = false;
            JOptionPane.showMessageDialog(null, "Record Not Found");
        }        
}


@SuppressWarnings("unchecked")
public void updateSchoolBusById(String schoolBusID,int capacity, String status, String arrived, String students2) throws  IOException, Exception{
	
	JSONObject schoolBus = new JSONObject();
	schoolBus.put("capacity", capacity);
	schoolBus.put("status", status);
	schoolBus.put("arrived", arrived);
	schoolBus.put("students", students2);

   JSONObject school= db.getSchoolObject();
   JSONObject schoolObj = (JSONObject) school.get("school of music");
   JSONObject entity = (JSONObject) schoolObj.get("school bus");
 
   entity.put(schoolBusID, schoolBus);
   db.writeSchoolObject(school);
}

public boolean getStatuss(){

    return statuss;
}

public Database getDb() {
	return db;
}

public String getSchoolBusID() {
	return schoolBusID;
}

public int getCapacity() {
	return capacity;
}

public String getStatus() {
	return status;
}

public String getArrived() {
	return arrived;
}

public JsonArray getStudents() {
	return students;
}




}