import java.util.Scanner;
public class Ryan_LeapYear {

    public static boolean isLeapYear(int year){
       int theResult = year % 4;
       if(theResult > 0){
           return false;
       } else {
           return true;
       }

    }


    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a year.");
        int testYear = sc.nextInt();
        if(Ryan_LeapYear.isLeapYear(testYear) == true){
            System.out.println("The year " + testYear + " is a leap year");
        }else{
            System.out.println("The year " + testYear + " is not a leap year");
        }
    }
}