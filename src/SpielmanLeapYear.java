import java.util.Scanner;

/**
 * TThis file will check if a year is a leap year.
 * @author Caleb Spielman
 * @version 11/15/2019
 */

public class LeapYearTemplate {

    public static boolean isLeapYear(int year){
        if(isLeapYear(int year % 4) == 0){
            return true; }
        return true;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a year.");
        int testYear = sc.nextInt();
        if(LeapYearTemplate.isLeapYear(testYear) == true){
            System.out.println("The year " + testYear + " is a leap year");
        }else{
            System.out.println("The year " + testYear + " is not a leap year");
        }
    }
}