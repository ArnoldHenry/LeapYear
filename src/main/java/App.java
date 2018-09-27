import java.io.Console;

public class App {
    public static void main(String[]args){
        Console console = System.console();
        System.out.println("Enter year to check if it's a leap year: ");
        String UserInput = console.readLine();
        Integer ConvertInput = Integer.parseInt(UserInput);
        LeapYear leapYear = new LeapYear();
        boolean BooleanaAnswer = leapYear.isLeapYear(ConvertInput);
        if (BooleanaAnswer){
            System.out.println(BooleanaAnswer+", " +ConvertInput+" is a leap Year ");
        }else{
            System.out.println(BooleanaAnswer+", " +ConvertInput+" is not a leap Year ");
        }
    }
}
