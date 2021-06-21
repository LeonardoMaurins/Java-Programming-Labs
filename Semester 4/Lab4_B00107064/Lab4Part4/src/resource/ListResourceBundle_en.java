//package resource;
//
//import java.util.ListResourceBundle;
//
//public class ListResourceBundle_en extends ListResourceBundle {
//
// public Object handleGetObject(String key) {
//		 
//	 String returnString="";
//	
//	 if(key.equals("ButtonString")) {
//		 returnString = "List All Locales";
//	 }
//	 else if(key.equals("French")) {
//		 returnString = "French";
//	 }
//	 else if(key.equals("English")) {
//		 returnString = "English";
//	 }
//	 	return returnString;
//	 } 
//}

package resource;

import java.util.ListResourceBundle;

public class ListResourceBundle_en extends ListResourceBundle { 
	
	private static final Object Contents[][] = {
				{ "ButtonString", "List All Locales" },
				{ "ButtonEnglish", "English" },
				{ "ButtonFrench", "French" }
		};
	
	public Object[][] getContents() { 
		return Contents; 
		} 
}
