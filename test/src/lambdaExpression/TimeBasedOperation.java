package lambdaExpression;


import java.util.Calendar;

public class TimeBasedOperation {
    public static void main(String[] args) {
        // Get the current system time
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.SECOND); // 24-hour format
        System.out.println(hour);

        // Perform operation based on the current hour
        if (hour >= 0 && hour < 12) {
            // Perform the morning operation
            System.out.println("Good morning! Performing morning operation.");
        } else if (hour >= 12 && hour < 18) {
            // Perform the afternoon operation
            System.out.println("Good afternoon! Performing afternoon operation.");
        } else {
            // Perform the evening operation
            System.out.println("Good evening! Performing evening operation.");
        }
    }
}
