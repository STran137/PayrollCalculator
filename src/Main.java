import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        String userAnswer;

        do {
            // Name Entry
            System.out.println(" Hello, welcome to the Company Payroll Calculator. Please enter your name.");
            String name = input.nextLine();

            // Age Entry
            System.out.println("What is your age, " + name + "?");
            int age = input.nextInt();
            while (age <= 0 || age > 150){
                System.out.println("Please enter a valid age.");
                age = input.nextInt();
            }
            System.out.println(name + " you are " + age + " years old.");

            //Full-time or Part-time
            System.out.println("Enter [true] for full-time or [false] for part-time. ");
            boolean isFulltime;
            isFulltime = input.nextBoolean();
            if(isFulltime)
            {
                System.out.println(name +" you work full-time.");
            }
            else
            {
                System.out.println(name + " you work part-time.");
            }

            // Hours Worked | 168 total hours in a 7-day week
            System.out.println("How many hours did you work this week? ");
            double hours = input.nextDouble();
            while (hours <= 0 || hours > 168 ){
                System.out.println("Please enter a valid value for hours worked. ");
                hours = input.nextDouble();
            }
            System.out.println(name + " you worked " + hours + " hours this week.");

            DecimalFormat deciF = new DecimalFormat(".00");

            // Hourly Pay Rate
            System.out.println("What is your hourly pay rate? ");
            double payrate = input.nextDouble();
            while (payrate <=0){
                System.out.println("Please enter a valid value for payrate. ");
                payrate = input.nextDouble();
            }
            System.out.println(name + " your hourly pay rate is $" + deciF.format(payrate) + ".");

            // User input to calculate
            System.out.println("Enter any integer to calculate gross pay and net pay. ");
            int typeIn = input.nextInt();

            // Gross Pay and Net Pay Output
            double grosspayFormula = payrate * hours;
            final double TAX = 0.10;
            double netpayFormula = grosspayFormula - (grosspayFormula * TAX);
            System.out.println("Your gross pay is $" + deciF.format(grosspayFormula) + ".");
            System.out.println("Your net pay is $" + deciF.format(netpayFormula) + ".");
            System.out.println("Do you want to calculate another payroll? Please type either Yes or No.");
            userAnswer = input.next();
            input.nextLine();
        }

        while (userAnswer.equalsIgnoreCase("Yes"));
        //Do-While Loop to repeat or terminate the program
    }
}
