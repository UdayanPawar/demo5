package test.JSONProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException
    
    {
    	String file = "C:\\Users\\CHETANA SADARE\\Desktop\\sample.json";
        //step 1
    	FileReader fileReader = new FileReader(file);
    	//step 2
    	JSONParser jsonParser = new JSONParser();
    	//step 3
    	JSONObject jsonObject =(JSONObject)jsonParser.parse(fileReader);
    	String firstName=(String) jsonObject.get("fname");
    	String lastName=(String) jsonObject.get("lname");
    	
    	System.out.println("firstName>>"+firstName);
    	System.out.println("lastName>>"+lastName);
    	
    	Long empAge=(Long) jsonObject.get("age");
    	System.out.println("empAge>>"+empAge);
    	
    	JSONArray jsonArray=(JSONArray) jsonObject.get("address");
    	
    	for(int i=0 ; i < jsonArray.size() ; i++) {
    		JSONObject address=(JSONObject) jsonArray.get(i);
    		Long streetNo =(Long) address.get("streetNo");
    		String city =(String) address.get("city");
    		Long pincode=(Long) address.get("pincode");
    		
    		System.out.println("streetNo>>"+streetNo);
    		System.out.println("city>>"+city);
    		System.out.println("pincode>>"+pincode);
    	}
    	
    	
    }
}
