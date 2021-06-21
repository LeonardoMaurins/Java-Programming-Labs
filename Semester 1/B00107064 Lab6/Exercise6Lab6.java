import java.util.Scanner;

public class Exercise6Lab6{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int temp = 0;
		System.out.println("_______________________________________________________");
		System.out.println("Please input a letter:");
		System.out.println("A. The sum of all even numbers between 2 and 100");
		System.out.println("B. The sum of all squares between 1 and 100");
		System.out.println("C. The sum of all odd numbers between two given numbers");
		System.out.println("_______________________________________________________");
		String input = scr.next();
		
		switch(input){
			case "A": case "a": case "1":
				do{
					num += 2;
					sum += num;
				}while(num < 100);
				System.out.println(sum);
				break;
				
			case "B": case "b": case "2":
				do{
					num++;
					temp = (int)Math.pow(num, 2);
					sum += temp;
					
				}while(temp < 100);
				System.out.println(sum);
				break;
				
			case "C": case "c": case "3":
				System.out.println("Please insert your two numbers:");
				num = scr.nextInt();
				int max = scr.nextInt();
				do{
					if(num % 2 == 0){
						num++;	
						continue;
					}
					sum += num;
					num += 2;
					System.out.println(num + " " + sum);
				}while(num < max - 1);
				System.out.println(sum);
				break;
		}
	}
}