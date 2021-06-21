package resource;

public class ListResourceBundle_fr extends ListResourceBundle{

 public Object handleGetObject(String key) {
	 
	 String returnString="";
	
	 if(key.equals("Bonjour")) {
		 returnString = "Bonjour";
	 }
	 else if(key.equals("Hello")) {
		 returnString = "Bonjour";
	 }
	 else if(key.equals("Hallo")) {
		 returnString = "Bonjour";
	 }
	 
	 	return returnString;
	 } 
}
