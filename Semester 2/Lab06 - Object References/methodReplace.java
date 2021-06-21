import java.util.*;
public class methodReplace{
	public static void a(String a){
		int count = 0;
		String[] tokens = a.split(" ");
		for(int k = 0; k < tokens.length; k++){
			if(tokens[k].equalsIgnoreCase("car")){
				count++;}
		}
		System.out.println(a);
		System.out.println("There are " + count + " amounts of word car in that sentence");
}

	public static void b(String b){
		String[]tokens = b.split(" ");
		for(int k = 0; k < tokens.length; k++){
			if(tokens[k].endsWith("ly")){
			System.out.println(tokens[k]);}
		}
	}

	public static void c(String c){
		String s3 = c;
		System.out.println(s3.replace(" ","_"));
	}

	public static ArrayList <Integer> indicesE(String d){
		ArrayList<Integer>indicesE = new ArrayList<>();
		for (int a = 0; a < d.length(); a++){
			if(d.charAt(a)=='e'){
				indicesE.add(a);}
		}
		return indicesE;
	}

	public static void e(String i,String o){
		if(i.compareTo(o) < 0){
			System.out.println(i);}
	 	else if(o.compareTo(i) < 0){
			System.out.println(o);}
		else{
			System.out.println("Either can be first");}
	}


	public static void main(String[]arg){
		a("There are many different types of car available in the car shop ");
		b("Have a lovely day"); //Words end in ly
		c("Hello World");
		System.out.println(indicesE("Hello hello hello. How are you?"));
		e("Bananas","beware");
		}
}
