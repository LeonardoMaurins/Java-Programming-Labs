package resource;

public class ListResourceBundle_fr extends ListResourceBundle{

 public Object handleGetObject(String key) {
	 
	 String returnString="";
	
	 if(key.equals("One")) {
		 returnString = "Un";
	 }
	 else if(key.equals("Two")) {
		 returnString = "Deux";
	 }
	 else if(key.equals("Three")) {
		 returnString = "Trois";
	 }
	 else if(key.equals("Translate to French")) {
		 returnString = "Traduire en français";
	 }
	 
	 	return returnString;
	 } 
}
