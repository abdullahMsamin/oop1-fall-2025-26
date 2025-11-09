
package project;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalcWithCondition {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
   
    //checking of any criminal record 

    System.out.print("Criminal record (true/false): ");
    boolean CriminalRecord = sc.nextBoolean() ;
    
    if (CriminalRecord){
        System.out.println("You're not eligible for the loan");
        return ; 
    }

    //if this is number or alphabet 

    System.out.print("Enter your Salary: ");
    if(!sc.hasNextDouble()){
        System.out.println("Wrong attempt , Type number !");
        return ;
    }
     double salary = sc.nextDouble();
    
    System.out.print("Credit Score: ");
    double CreditScore = sc.nextDouble();

    System.out.print("Enter loan amount (Principal in BDT): ");
    double principal  = sc.nextDouble();

    //checking condition for taking the loan 

     if(!CriminalRecord && CreditScore >=300 && principal <= salary*2  ){
       
     }
     else{
          System.out.println("You're not eligible for the loan ");
          return ;
     }

        // if elegible , then proceed ...

       System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int years = sc.nextInt();

        // Convert annual interest rate to monthly and years to months
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

        // Calculate monthly mortgage payment
        double mortgagePayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Calculate total payment and interest
        double totalPayment = mortgagePayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        // Format results for Bangladeshi currency
        Locale bdLocale = Locale.of("en", "BD");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdLocale);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + currencyFormatter.format(principal));
        System.out.println("Monthly Payment: " + currencyFormatter.format(mortgagePayment));
        System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
        System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));

        sc.close();
    }
}



    

        

