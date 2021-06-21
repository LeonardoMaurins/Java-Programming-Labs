import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class PrintInternationalData {

	public static void main(String[] args) {

		Locale frenchLocale = new Locale("fr", "FR");
		Locale englishLocale = new Locale("en", "EN");
		Locale germanLocale = new Locale("de", "DE");
		
		Date today = new Date();
		
		DateFormat frenchDf = DateFormat.getDateInstance(DateFormat.LONG, frenchLocale);
		DateFormat englishDf = DateFormat.getDateInstance(DateFormat.LONG, englishLocale);
		DateFormat germanDf = DateFormat.getDateInstance(DateFormat.LONG, germanLocale);
		
		System.out.printf("The date in French format today is: " + frenchDf.format(today) + "%n");
		System.out.printf("The date in English format today is: " + englishDf.format(today) + "%n");
		System.out.printf("The date in German format today is: " + germanDf.format(today) + "%n%n");
		
		System.out.println("The French days of the week:" );
		DateFormatSymbols frenchDfs = new DateFormatSymbols(frenchLocale);
		String frenchDayNames[] = frenchDfs.getWeekdays();
		
		for(int i = 0;i < 7;i++) {
			System.out.println(frenchDayNames[i+1]);
		}
		
		System.out.printf("%n");
		
		System.out.println("The English days of the week:" );
		DateFormatSymbols englishDfs = new DateFormatSymbols(englishLocale);
		String englishDayNames[] = englishDfs.getWeekdays();
		
		for(int i = 0;i < 7;i++) {
			System.out.println(englishDayNames[i+1]);
		}
		
		System.out.printf("%n");
		
		System.out.println("The German days of the week:" );
		DateFormatSymbols germanDfs = new DateFormatSymbols(germanLocale);
		String germanDayNames[] = germanDfs.getWeekdays();
		
		for(int i = 0;i < 7;i++) {
			System.out.println(germanDayNames[i+1]);
		}
		
		System.out.printf("%n");
		
		Double milkCost = 2.50;
		
		NumberFormat frenchCurrencyForm = NumberFormat.getCurrencyInstance(frenchLocale);
		System.out.println("The French currency of 2.50 is: " + frenchCurrencyForm.format(milkCost));
		
		NumberFormat englishCurrencyForm = NumberFormat.getCurrencyInstance(englishLocale);
		System.out.println("The English currency of 2.50 is: " + englishCurrencyForm.format(milkCost));
		
		NumberFormat germanCurrencyForm = NumberFormat.getCurrencyInstance(germanLocale);
		System.out.println("The German currency of 2.50 is: " + germanCurrencyForm.format(milkCost));
	}

}
