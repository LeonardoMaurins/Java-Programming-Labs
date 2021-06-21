package com.raeside.family;


import java.util.Vector;

import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

public class Family {

		private Vector familyMembers = new Vector();
		private String familyName;
		
		public Family(String familyName) {
			this.familyName = familyName;
		}
		
		public void addFamilyMember(Person member) throws FirstNameExistsException,SurnameMismatchException {
			
			if(correctFamilyName(member.getFamilyName())) {
				if(newFirstName(member.getFirstName())) {
					familyMembers.addElement(member);
			}
				else {	
					throw new FirstNameExistsException("This family already has a " + member.getFirstName());
				}
			}
			else {
				throw new SurnameMismatchException("The surname " + member.getFamilyName() + " isn't Robinson!");
			}
		}
		
		public String[] getFamilyMembers() {
			
			String[] names=new String[familyMembers.size()];
			
			for(int i=0; i < familyMembers.size(); i++) {
				names[i]=((Person)familyMembers.elementAt(i)).getFirstName() + " " + ((Person)familyMembers.elementAt(i)).getFamilyName();
			}
			return names;
		}
		
		public boolean newFirstName(String firstName) {
			
			for(int i=0; i < familyMembers.size(); i++) {
				if(((Person)familyMembers.elementAt(i)).getFirstName().equals(firstName)) {
					return false; //name is not new to the family
				}
			}
			return true; //the name was not found
		}
		
		// Returns true if it does equal current family name and vice versa	
		public boolean correctFamilyName(String familyName) {
			return familyName.equals(this.familyName); 
		}
}
