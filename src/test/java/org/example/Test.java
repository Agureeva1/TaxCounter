package org.example;
import java.time.*;


public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1); // задать 1-й день месяца
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = -5; i < value; i++)
            System.out.print(" ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());// 3 - устанавливает количество пробелом между числами
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}


 //      System.out.println(date);
 //      System.out.println(month);
   //     System.out.println(today);

