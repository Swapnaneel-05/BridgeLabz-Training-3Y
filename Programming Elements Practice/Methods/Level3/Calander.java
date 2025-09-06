package BridgeLabz.Method.Level3;

import java.util.Scanner;

public class Calander {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int century = year / 100;
        int yearInCentury = year % 100;
        
        int dayOfWeek = (1 + (13 * (month + 1)) / 5 + yearInCentury + yearInCentury / 4 + century / 4 - 2 * century) % 7;

        int adjustedDay = (dayOfWeek + 6) % 7;
        return adjustedDay;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\n        " + getMonthName(month) + " " + year);
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d  ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        } else {
            displayCalendar(month, year);
        }
        
        input.close();
    }
}
