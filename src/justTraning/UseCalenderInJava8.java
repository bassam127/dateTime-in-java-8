package justTraning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UseCalenderInJava8 {

    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        System.out.println(dateNow);
        System.out.println(timeNow);
        LocalDate myBirthday = LocalDate.of(2019, Month.JUNE, 11);

        System.out.println("my birthdat on " + myBirthday);

        // date time is immutable this means that we need to assign
        // the result of these methods to a reference variable so they are not
        // lost

        LocalDate summer = LocalDate.of(2018, Month.AUGUST, 11);
        System.out.println(summer);
        // here we add month to summer date
        LocalDate september = summer.plusMonths(1);
        System.out.println(september);

        // nice and easy way to go backward

        LocalDate WorldCupDate = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(WorldCupDate, time);

        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        // immutable ex
        LocalDate dateOfWorldCup = LocalDate.of(2022, Month.JANUARY, 11);
        dateOfWorldCup.plusDays(10);

        System.out.println("notice the date not changed " + dateOfWorldCup);

        dateOfWorldCup = dateOfWorldCup.plusDays(10);

        System.out.println("now the date change" + dateOfWorldCup);

    }

}
