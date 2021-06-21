//package resource;
//
//public class ListResourceBundle_fr extends ListResourceBundle {
//
// public Object handleGetObject(String key) {
//		 
//	 String returnString="";
//	
//	 if(key.equals("ButtonString")) {
//		 returnString = "Lister tous les lieux";
//	 }
//	 else if(key.equals("French")) {
//		 returnString = "Français";
//	 }
//	 else if(key.equals("English")) {
//		 returnString = "Anglais";
//	 }
//	 	return returnString;
//	 } 
//}

package resource;

import java.util.ListResourceBundle;

public class ListResourceBundle_fr extends ListResourceBundle 
{
    private static Object Contents[][] = {
    			{ "ButtonString", "Lister tous les lieux" },
    			{ "ButtonEnglish", "Anglais" },
    			{ "ButtonFrench", "Francais" }
    	};
    
	protected Object[][] getContents() {
		return Contents;
	}

}