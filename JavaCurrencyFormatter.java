import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       double payment = scan.nextDouble();
       scan.close();
 
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String ind = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

       System.out.println("US: " + us);
       System.out.println("INDIA: " + ind);
       System.out.println("CHINA: " + ch);
       System.out.println("FRANCE: " + fr);
    }
}
