
import java.util.*;
	public class PetVersion2{
	private String breed;
	private String size;
	private String fur;
	private int age;
	private double price;


	public PetVersion2(){
		breed = "Labrador";
		size = "Large";
		fur = "Short";
		age = 1;
		price = 350.00;
	}

	public PetVersion2(String aBreed,String aSize, String aFur, int aAge, double aPrice){
		breed = aBreed;
		size = aSize;
		fur = aFur;
		age = aAge;
		price = aPrice;
		}

		public void setBreed(String aBreed){breed=aBreed;}
		public void setSize(String aSize){size=aSize;}
		public void setFur(String aFur){fur=aFur;}
		public void setAge(int aAge){age=aAge;}
		public void setPrice(double aPrice){price=aPrice;}

		public String getBreed(){return breed;}
		public String getSize(){return size;}
		public String getFur(){return fur;}
		public int getAge(){return age;}
		public double getPrice(){return price;}

		public static void changeMethod(ArrayList<PetVersion2> pets) {
   			pets.get(1).setSize("Small");
		    pets.get(1).setFur("Short");
		    pets.get(1).setAge(2);

			System.out.println();
			System.out.println("********************************\n* List with updated parameters * \n********************************");
			for(int i=0;i<pets.size();i++){
				pets.get(i).printPetDetails();
				System.out.println("");
			}
	}

		public void printPetDetails(){
			System.out.println(breed);
			System.out.println(size);
			System.out.println(fur);
			System.out.println(age);
			System.out.println(price);
		}

}

