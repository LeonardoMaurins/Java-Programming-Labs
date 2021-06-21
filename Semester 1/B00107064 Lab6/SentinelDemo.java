import java.util.Scanner;

public class SentinelDemo{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		System.out.println("to exit the loop, input -1");
		System.out.println("please input the salary values");
		double a = 0;
		double total = 0;
		int count = 0;
		while(a != -1){
			if(scr.hasNextDouble()){
				a = scr.nextDouble();
				count++;
				total += a;
			}else{
				System.out.println("Inputed value isn't valid");
				return;
			}
		}
		System.out.printf("%.2f", total / count);
	}
}