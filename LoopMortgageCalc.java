package project;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LoopMortgageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criminal record
        System.out.print("Criminal record (true/false): ");
        boolean CriminalRecord = sc.nextBoolean();

        if (CriminalRecord) {
            System.out.println("You're not eligible for the loan");
            return;
        }

        
        //   Salary Validation Loop
        
        double salary = 0;
        while (true) {
            System.out.print("Enter your Salary: ");
            if (sc.hasNextDouble()) {
                salary = sc.nextDouble();
                break;
            } else {
                System.out.println("Wrong attempt, Type number!");
                sc.next(); 
            }
        }


        //   Credit Score Validation
        
        double CreditScore = 0;
        while (true) {
            System.out.print("Credit Score: ");
            if (sc.hasNextDouble()) {
                CreditScore = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input . Type numerical number !");
                sc.next();
            }
        }

        //   Loan Amount Validation
      
        double principal = 0;
        while (true) {
            System.out.print("Enter loan amount (Principal in BDT): ");
            if (sc.hasNextDouble()) {
                principal = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input . Type numerical number !");
                sc.next();
            }
        }

        // eligibility check
        if (CreditScore < 650 || principal > salary * 2) {
            System.out.println("You're not eligible for the loan");
            return;
        }

        // eligible
        System.out.println("\n You are eligible for the loan.");

        
        // Interest Rate Validation
      
        double annualInterestRate = 0;
        while (true) {
            System.out.print("Enter annual interest rate (e.g., 8.5): ");
            if (sc.hasNextDouble()) {
                annualInterestRate = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid number! Type numerical number . ");
                sc.next();
            }
        }

        // Years Validation
      
        int years = 0;
        while (true) {
            System.out.print("Enter loan period (in years): ");
            if (sc.hasNextInt()) {
                years = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid number! Type numerical number . ");
                sc.next();
            }
        }

        // monthly values
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

        // mortgage calculation
        double mortgagePayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        double totalPayment = mortgagePayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        // BDT format
        Locale bdLocale = Locale.of("en", "BD");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(bdLocale);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + formatter.format(principal));
        System.out.println("Monthly Payment: " + formatter.format(mortgagePayment));
        System.out.println("Total Payment: " + formatter.format(totalPayment));
        System.out.println("Total Interest: " + formatter.format(totalInterest));

        sc.close();
    }
}

