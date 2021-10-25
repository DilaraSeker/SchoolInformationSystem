package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Database {
	
	public ArrayList<Student> getStudents() {
		File jsonInputFile = new File("School.json");
        InputStream is;
		ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);     
            JsonObject jsonObj = reader.readObject();
            reader.close();
            JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
            JsonObject studentsObj = schoolsObj.getJsonObject("student");
            
			for (final Entry<String, ?> entry : studentsObj.entrySet()) {
				  
				final String key = entry.getKey();
				JsonObject value = (JsonObject) entry.getValue();	
				studentList.add(new Student(key, value.getString("surname"), 
						 value.getString("name"), value.getInt("grade"), 
						 value.getInt("age"), value.getInt("fee")));   
				  
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
        return studentList;
    	
	}
	
	public ArrayList<Teacher> getTeachers() {
		File jsonInputFile = new File("School.json");
        InputStream is;
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);     
            JsonObject jsonObj = reader.readObject();
            reader.close();
            JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
            JsonObject teacherObj = schoolsObj.getJsonObject("teacher");
            JsonObject branchObj = teacherObj.getJsonObject("bracnh");
            
			for (final Entry<String, ?> entry : branchObj.entrySet()) {
				  
				final String branch = entry.getKey();
				JsonObject value = (JsonObject) entry.getValue();	
				teacherList.add(new Teacher(value.getString("surname"), 
						 value.getString("name"),branch, value.getInt("salary"))); 
					  
				  
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
        return teacherList;
    	
	}
	public ArrayList<Class> getClasses() {
		File jsonInputFile = new File("School.json");
        InputStream is;
		ArrayList<Class> classList = new ArrayList<Class>();
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);     
            JsonObject jsonObj = reader.readObject();
            reader.close();
            JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
            JsonObject classObj = schoolsObj.getJsonObject("class");
            JsonObject gradeObj = classObj.getJsonObject("grade");
            
			for (final Entry<String, ?> entry : gradeObj.entrySet()) {
				  
				final String gradeID = entry.getKey();
				JsonObject value = (JsonObject) entry.getValue();	
				classList.add(new Class(gradeID, 
						value.getString("monday"), 
						value.getString("tuesday "), 
						value.getString("wednesday"),
						value.getString("thursday"),
						value.getString("friday"))); 
					  
				  
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
        return classList;
    	
	}
	
	public ArrayList<SchoolBus> getSchoolBus() {
		File jsonInputFile = new File("School.json");
        InputStream is;
		ArrayList<SchoolBus> schoolBusList = new ArrayList<SchoolBus>();
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);     
            JsonObject jsonObj = reader.readObject();
            reader.close();
            JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
            JsonObject schoolBusObj = schoolsObj.getJsonObject("school bus");
                        
			for (final Entry<String, ?> entry : schoolBusObj.entrySet()) {
				  
				final String schoolBusID = entry.getKey();
				JsonObject value = (JsonObject) entry.getValue();	
				schoolBusList.add(new SchoolBus(schoolBusID, 
						value.getInt("capacity"), 
						value.getString("status"), 
						value.getString("arrived"),
						value.getJsonArray("students"))); 
					  
				  
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
        return schoolBusList;
    	
	}
	public JsonObject getStudentsObject() throws FileNotFoundException {
		File jsonInputFile = new File("School.json");
        InputStream is;
		JsonObject studentsObj;
       
        is = new FileInputStream(jsonInputFile);
        JsonReader reader = Json.createReader(is);     
        JsonObject jsonObj = reader.readObject();
        reader.close();
        JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
        studentsObj = schoolsObj.getJsonObject("student");
             		
        return studentsObj;
    	
	}
	public JSONObject getSchoolObject() throws IOException, ParseException {
		/*File jsonInputFile = new File("School.json");
        InputStream is;
		JsonObject studentsObj;
       
        is = new FileInputStream(jsonInputFile);
        JsonReader reader = Json.createReader(is);     
        JsonObject jsonObj = reader.readObject();
        reader.close();
             		
        return jsonObj;
    	*/
		JSONObject value;
		try (FileReader reader = new FileReader("School.json")) {
		     JSONParser parser = new JSONParser();
		     value =  (JSONObject) parser.parse(reader);
		}
		return value;
	}
	public void writeSchoolObject(JSONObject value) throws IOException, ParseException {
		
		 try (FileWriter file = new FileWriter("School.json")) {
	         file.write(value.toJSONString()); 
	         file.flush();

	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	}
	public JsonObject getTeachersObject() throws FileNotFoundException {
		File jsonInputFile = new File("School.json");
        InputStream is;
		JsonObject teachersObj;
		JsonObject branchObj;
       
        is = new FileInputStream(jsonInputFile);
        JsonReader reader = Json.createReader(is);     
        JsonObject jsonObj = reader.readObject();
        reader.close();
        JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
        teachersObj = schoolsObj.getJsonObject("teacher");
        branchObj = teachersObj.getJsonObject("bracnh");
             		
        return branchObj;
    	
	}
	public JsonObject getClassObject() throws FileNotFoundException {
		File jsonInputFile = new File("School.json");
        InputStream is;
		JsonObject classessObj;
		JsonObject gradeObj;
       
        is = new FileInputStream(jsonInputFile);
        JsonReader reader = Json.createReader(is);     
        JsonObject jsonObj = reader.readObject();
        reader.close();
        JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
        classessObj = schoolsObj.getJsonObject("class");
        gradeObj = classessObj.getJsonObject("grade");
             		
        return gradeObj;
    	
	}
	public JsonObject getSchoolBusObject() throws FileNotFoundException {
		File jsonInputFile = new File("School.json");
        InputStream is;
		JsonObject schoolBusObj;
       
        is = new FileInputStream(jsonInputFile);
        JsonReader reader = Json.createReader(is);     
        JsonObject jsonObj = reader.readObject();
        reader.close();
        JsonObject schoolsObj = jsonObj.getJsonObject("school of music");
        schoolBusObj = schoolsObj.getJsonObject("school bus");
             		
        return schoolBusObj;
    	
	}
	
}
