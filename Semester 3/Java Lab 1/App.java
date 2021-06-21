import java.util.Scanner;

public class App {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        x = addFive(x);
        System.out.println(x);
    }

   public static int addFive(int x) {
        x /= 5;
        return x;
    }
}