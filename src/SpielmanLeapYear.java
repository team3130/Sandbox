import java.util.Scanner;

public class SpielmanLeapYear {


    public static boolean isLeapYear(int year) {
        //TODO: put your code here, your method should take a integer year and return whether or not it is a leap year. True if it is, false if it isn't

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a year.");
        int testYear = sc.nextInt();
        if(SpielmanLeapYear.isLeapYear(testYear) == true){
            System.out.println("The year " + testYear + " is a leap year");
        }else{
            System.out.println("The year " + testYear + " is not a leap year");
        }
    }
}