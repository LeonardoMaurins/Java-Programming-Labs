import java.util.ArrayList;
public class carshow{
   public static void main(String[] args){
	   ArrayList <String> CarShow = new ArrayList<>();

	   CarShow.add("Toyota 2.4 181-D-6289"); //Make, size and reg
	   CarShow.add("Ford 1.2 04-KK-77");
	   CarShow.add("Kia 2.6 141-WX-283");

	   System.out.println("Cars currently in stock" + CarShow);
	   CarShow.remove(2);
	   CarShow.add("Kia 1.2 141-WX-283");

	   System.out.println("Cars with fixed engine size" + CarShow);
       CarShow.remove(2);
       CarShow.add("The Kia is no longer available it has been sold");
       System.out.println("Cars we now have in stock" + CarShow );
   }
}