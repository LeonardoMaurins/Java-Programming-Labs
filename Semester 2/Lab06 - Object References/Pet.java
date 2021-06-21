import java.util.*;
public class Pet{
	public static void main(String[]args){
		ArrayList<PetVersion2> pets = new ArrayList<>();
		PetVersion2 pet1= new PetVersion2("German Shepard","Large","Long",1,300.00);
		PetVersion2 pet2= new PetVersion2("Labrador","Large","Short",2,150.00);
		PetVersion2 pet3= new PetVersion2("Boxer","Large","Short",4,100.00);
		PetVersion2 pet4= new PetVersion2("Yorkshire Terrier","Small","long",1,350.00);
		PetVersion2 pet5= new PetVersion2("Maltese Terrier","Small","Short",2,200.00);

		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);
		pets.add(pet5);

		System.out.println("List of dogs for sale: ");
		for(int i=0; i < pets.size(); i++){
			pets.get(i).printPetDetails();
			System.out.println("");
		}

		changeMethod(pets);
		pets.remove(4);
		pets.remove(3);
		pets.remove(1);

		System.out.println("Dogs for sale after 3 have been bought: ");
		for(int i=0;i<pets.size();i++){
			pets.get(i).printPetDetails();
			System.out.println("");
		}
	}
		public static void changeMethod (ArrayList <PetVersion2> pets) {
   			pets.get(1).setBreed("Bulldog");
   			pets.get(1).setSize("Small");
		    pets.get(1).setAge(2);

			System.out.println();
			System.out.println("************Updated List************");
			for(int i=0;i<pets.size();i++){
				pets.get(i).printPetDetails();
				System.out.println("");
	}
}
}