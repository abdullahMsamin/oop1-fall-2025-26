package Java;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner usrinput = new Scanner(System.in);

        System.out.print("amount of money : ");
        double p = usrinput.nextDouble();

          System.out.print("Interest rate (annual %): ");
        double rate = usrinput.nextDouble();

         System.out.print("Year: ");
        int years = usrinput.nextInt();

          double monthlyRate = rate / 100 / 12;
        int n = years * 12;

        double mortgage = p * (monthlyRate * Math.pow(1 + monthlyRate, n))/ (Math.pow(1 + monthlyRate, n) - 1);

        System.out.println("----Mortgage summery-----");
        

         System.out.printf("Total mortgage : ", mortgage);


















    }

    
}
