package resource;

public class ListResourceBundle_en extends ListResourceBundle{

 public Object handleGetObject(String key) {
	 
	 String returnString="";
	
	 if(key.equals("Hello")) {
		 returnString = "Hello";
	 }
	 else if(key.equals("Bonjour")) {
		 returnString = "Hello";
	 }
	 else if(key.equals("Hallo")) {
		 returnString = "Hello";
	 }
	 
	 	return returnString;
	 } 
}
