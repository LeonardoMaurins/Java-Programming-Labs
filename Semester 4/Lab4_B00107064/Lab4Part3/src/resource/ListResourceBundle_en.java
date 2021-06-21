package resource;

public class ListResourceBundle_en extends ListResourceBundle{

 public Object handleGetObject(String key) {
	 
	 String returnString="";
	
	 if(key.equals("1")) {
		 returnString = "One";
	 }
	 else if(key.equals("2")) {
		 returnString = "Two";
	 }
	 else if(key.equals("3")) {
		 returnString = "Three";
	 }
	 else if(key.equals("4")) {
		 returnString = "Translate to French";
	 }
	 
	 	return returnString;
	 } 
}
