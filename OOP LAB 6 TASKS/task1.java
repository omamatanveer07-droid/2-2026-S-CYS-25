/ Part 1:
public class Counter {
    private int value;
    private int limit;

    public Counter(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public Counter(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public void set(int value) {
        if (value >= 0 && value < limit) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value out of bounds for limit " + limit);
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return (value < 10 ? "0" : "") + value;
    }
}

// Part 2:
public class DigitalTimer {
    private Counter hoursCounter;
    private Counter minutesCounter;

   
    public DigitalTimer() {
        hoursCounter = new Counter(24);
        minutesCounter = new Counter(60);
    }


    public DigitalTimer(int hours, int minutes) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Precondition violated: 0 <= hours <= 23 and 0 <= minutes <= 59");
        }
        hoursCounter = new Counter(hours, 24);
        minutesCounter = new Counter(minutes, 60);
    }


    public void tick() {
        int prevMin = minutesCounter.getValue();
        minutesCounter.increment();
        // If minutes wrapped around from 59 to 0, increment hours
        if (minutesCounter.getValue() == 0 && prevMin == 59) {
            hoursCounter.increment();
        }
    }

    public void set(int hours, int minutes) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Precondition violated: 0 <= hours <= 23 and 0 <= minutes <= 59");
        }
        hoursCounter.set(hours);
        minutesCounter.set(minutes);
    }

    @Override
    public String toString() {
        return hoursCounter.toString() + ":" + minutesCounter.toString();
    }
}

// Part 3:

public class TimerDriver {
    public static void main(String[] args) {
        DigitalTimer timer = new DigitalTimer();
        System.out.println("Initial Timer: " + timer); // Expected: 00:00

        timer.set(23, 58);
        System.out.println("After set(23, 58): " + timer);

        timer.tick();
        System.out.println("After 1 tick: " + timer); // Expected: 23:59

        timer.tick();
        System.out.println("After 2nd tick (Rollover): " + timer); // Expected: 00:00
    }
}




