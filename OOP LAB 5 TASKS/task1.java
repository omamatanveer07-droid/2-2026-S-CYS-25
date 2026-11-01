
import java.util.Scanner;

class dayType {
    private String[] days = {
        "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    };

    private int dayIndex;

    // Constructor
    public dayType(String day) {
        setDay(day);
    }

    // Set the day
    public void setDay(String day) {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase(day)) {
                dayIndex = i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid day!");
    }

    // Print the day
    public void printDay() {
        System.out.println(days[dayIndex]);
    }

    // Return the current day
    public String getDay() {
        return days[dayIndex];
    }

    // Return the next day
    public String nextDay() {
        return days[(dayIndex + 1) % 7];
    }

    // Return the previous day
    public String previousDay() {
        return days[(dayIndex + 6) % 7];
    }

    // Add days to the current day
    public String addDays(int numberOfDays) {
        int newIndex = (dayIndex + numberOfDays) % 7;
        return days[newIndex];
    }
}

public class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = sc.nextLine();

        dayType d = new dayType(day);

        System.out.print("Current day: ");
        d.printDay();

        System.out.println("Next day: " + d.nextDay());
        System.out.println("Previous day: " + d.previousDay());

        System.out.print("Enter number of days to add: ");
        int n = sc.nextInt();

        System.out.println("Day after adding " + n + " days: "
                + d.addDays(n));

        sc.close();
    }
}
