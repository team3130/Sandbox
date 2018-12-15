import java.util.Scanner;

/**
 * TThis file will check if a year is a leap year.
 * @author Eastan
 * @version 10/11/18
 */
public class LoweLeapYear {

    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            return true;
        }else if (year %4 != 0) {
            return false;
        }
        return false;
    }


    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a year.");
        int testYear = sc.nextInt();
        if(LoweLeapYear.isLeapYear(testYear) == true){
            System.out.println("The year " + testYear + " is a leap year");
        }else{
            System.out.println("The year " + testYear + " is not a leap year");
        }
    }
}