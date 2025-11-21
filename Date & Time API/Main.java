import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        
        // print todays date
        LocalDate date = LocalDate.now();
        System.out.println("Today's date is: " + date);

        // print current time
        LocalTime time = LocalTime.now();
        System.out.println("Current time is: " + time);

        // create date of your birthday using LocalDate.of()
        LocalDate birthday = LocalDate.of(2004, 01, 31);
        System.out.println("My birthdate is: " + birthday);

        // calculate how many days are left until your next birthday
        LocalDate nextBirthday = birthday.withYear(date.getYear());
        if (nextBirthday.isBefore(date) || nextBirthday.isEqual(date)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(date, nextBirthday);
        System.out.println("Days until my next birthday: " + daysUntilBirthday);

        // format your birthdate as 31 Jan 2004
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedBirthday = birthday.format(formatter);
        System.out.println("My birthdate formatted is: " + formattedBirthday);


    }
}
