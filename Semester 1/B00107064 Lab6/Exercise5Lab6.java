import java.util.Scanner;

public class Exercise5Lab6{
	public static void main(String[] args){
		int real = 0;
		double numin = 0;
		int count = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("____________________________________");
		System.out.println("Please input a letter:");
		System.out.println("A. Squared numbers of x");
		System.out.println("B. All numbers divisible by 10 of x");
		System.out.println("C. All powers of 2 less than x");
		System.out.println("____________________________________");
		String input = scr.next();
		switch(input){
			case "A": case "a": case "1":
				numin = scr.nextDouble();
				real = (int)numin;
				int realsqrt = (int)Math.sqrt(real);
				while(count < realsqrt){
					int sqrt = count * count;
					System.out.print(sqrt + " ");
					count++;
				}
				break;
				
			case "B": case "b": case "2":
				numin = scr.nextDouble();
				real = (int)numin;
				int max = real % 10;
				int total = real - max;
				int x = 0;
				while(x <= total){
					System.out.print(x + " ");
					x += 10;
				}
				break;
			
			case "C": case "c": case "3":
				numin = scr.nextDouble();
				real = (int)numin;
				int bi = 0;
				while(bi < real){
					bi = (int)Math.pow(2, count);
					if(bi < real) System.out.print(bi + " ");
					count++;
				}
				break;
		}
	}
}