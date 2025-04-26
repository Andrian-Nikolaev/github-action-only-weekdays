import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCheck {
    public static void main(String[] args) {

        DayOfWeek today = LocalDate.now().getDayOfWeek();
        
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("Today is " + today + ". Failing as it is a weekend.");
            System.exit(1); // Fail
        } else {
            System.out.println("Today is " + today + ". Passing as it is a weekday.");
            System.exit(0); // Success
        }
    }
}