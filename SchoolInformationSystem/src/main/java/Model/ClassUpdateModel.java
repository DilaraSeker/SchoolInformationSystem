package Model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;

import javax.json.JsonObject;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;

public class ClassUpdateModel  {
	
private Database db ;
private boolean status;
private String classGrade;
private String monday;
private String tuesday;
private String wednesday;
private String thursday;
private String friday;


public ClassUpdateModel(){

	db =new Database();
}

public void getClassByGrade(String grade) throws FileNotFoundException{

    	JsonObject classList = db.getClassObject();
    	
        if(classList.containsKey(grade)){
        
            status = true;
                        
			for (final Entry<String, ?> entry : classList.entrySet()) {
				  
				if( entry.getKey().equals(grade)) {
					 
					classGrade = entry.getKey();
		            JsonObject value = (JsonObject) entry.getValue();
		            monday = value.getString("monday");
		            tuesday = value.getString("tuesday ");
		            wednesday = value.getString("wednesday");
		            thursday = value.getString("thursday");
		            friday = value.getString("friday");
		            
				}	  
			}
        }
        else{
            status = false;
            JOptionPane.showMessageDialog(null, "Record Not Found");
        }
      
        
   
}


@SuppressWarnings("unchecked")
public void updateTeachertByBranch(String grade,String monday, String tuesday, String wednesday,String thursday, String friday) throws  IOException, Exception{
	
	JSONObject classObj = new JSONObject();
	classObj.put("monday", monday);
	classObj.put("tuesday", tuesday);
	classObj.put("wednesday", wednesday);
	classObj.put("thursday", thursday);
	classObj.put("friday", friday);

   JSONObject school= db.getSchoolObject();
   JSONObject schoolObj = (JSONObject) school.get("school of music");
   JSONObject classOb = (JSONObject) schoolObj.get("class");
   JSONObject entity = (JSONObject) classOb.get("grade");
   
   entity.put(grade, classObj);
   db.writeSchoolObject(school);
}

public boolean getStatus(){

    return status;
}

public Database getDb() {
	return db;
}


public String getMonday() {
	return monday;
}

public String getTuesday() {
	return tuesday;
}

public String getWednesday() {
	return wednesday;
}
public String getThursday() {
	return thursday;
}
public String getFriday() {
	return friday;
}

public String getClassGrade() {
	return classGrade;
}


}