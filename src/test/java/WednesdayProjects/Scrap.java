package WednesdayProjects;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Scrap {
    public static void main(String[] args) {

    String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM d yyy"));
        System.out.println(date);

        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm a"));
        System.out.println(time);
    }
}
