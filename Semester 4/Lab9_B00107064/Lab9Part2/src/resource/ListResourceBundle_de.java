package resource;

public class ListResourceBundle_de extends ListResourceBundle{

 public Object handleGetObject(String key) {
	 
	 String returnString="";
	
	 if(key.equals("Hallo")) {
		 returnString = "Hallo";
	 }
	 else if(key.equals("Bonjour")) {
		 returnString = "Hallo";
	 }
	 else if(key.equals("Hello")) {
		 returnString = "Hallo";
	 }
	 
	 	return returnString;
	 } 
}
