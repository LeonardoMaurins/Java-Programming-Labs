import java.util.Date;

public class DebitCardTester
{
    public static void main(String args[])
    {
        Date firstDate = new Date();
        firstDate.setTime(300);

        Date secondDate = new Date();
        secondDate.setTime(125);
        
        System.out.println(new DebitCard());
        System.out.println(new DebitCard("Leo", firstDate, "218"));
        System.out.println(new DebitCard("Leo", firstDate, secondDate, "946"));
    }
}
