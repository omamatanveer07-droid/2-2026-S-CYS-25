//// Task 1
public class Main {

    class JTime {
        private int hour;
        private int minute;
        private int second;

        // here is the formation of constructor
        public JTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;

        }

        int toseconds() {
            return hour * 3600 + minute * 60 + second;
        }

            JTime elapsedTime(JTime other){
                int difference = Math.abs(this.toseconds()-other.toseconds());
                return new JTime(
                        difference / 3600,
                        (difference % 3600) / 60,
                        difference % 60
                );
        }

        public JTime(int totalSeconds) {
            totalSeconds = totalSeconds % 86400;

            this.hour = totalSeconds / 3600;
            this.minute = (totalSeconds % 3600) / 60;
            this.second = totalSeconds % 60;
        }

    }
public static void main(String[] args)
 {
    JTime t1 = new JTime(2, 30, 15);
    JTime t2 = new JTime(1, 20, 10);

    JTime elapsed = t1.elapsedTime(t2);

    System.out.println("Elapsed time in seconds: " + elapsed.toseconds());
}

}
}

