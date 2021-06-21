import java.util.Scanner;

public class CounterDemo{
	public static void main(String[] args){
		int count = 1;
		double total = 0.0;
		Scanner scr = new Scanner(System.in);
		while(count <= 5){
			System.out.print("Please input the amount you spend on day " + count + ": ");
			if(scr.hasNextDouble()){
				double amount = scr.nextDouble();
				total += amount;
				count++;
				System.out.println(total);
			}else{
				System.out.println("Please insert a valid number!");
				return;
			}
		}
	}
}