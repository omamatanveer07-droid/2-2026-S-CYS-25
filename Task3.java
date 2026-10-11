//TASK 3
//
//import java.util.Scanner;
//import java.util.Random;
//
//class Walker {
//    int x;
//    int y;
//
//    Walker(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    void move(char direction) {
//        switch (direction) {
//            case '^': y++; break;  // Up
//            case 'v': y--; break;  // Down
//            case '>': x++; break;  // Right
//            case '<': x--; break;  // Left
//        }
//    }
//
//    boolean isHurdle(int newX, int newY) {
//        // Same obstacles for both walkers
//        return (newX == 1 && newY == 2)
//                || (newX == 2 && newY == 1)
//                || (newX == -1 && newY == 1);
//    }
//
//    void moveSafely(char direction, String name) {
//        int newX = x;
//        int newY = y;
//
//        switch (direction) {
//            case '^': newY++; break;
//            case 'v': newY--; break;
//            case '>': newX++; break;
//            case '<': newX--; break;
//        }
//
//        if (isHurdle(newX, newY)) {
//            System.out.println(name + " encounters hurdle at ("
//                    + newX + " : " + newY + ")");
//        } else {
//            x = newX;
//            y = newY;
//        }
//    }
//
//    void display(String name) {
//        System.out.println(name + " is at = ("
//                + x + " : " + y + ")");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//
//        Walker ali = new Walker(0, 0);
//        Walker hasan = new Walker(0, 0);
//
//        char[] directions = {'^', 'v', '<', '>'};
//
//        System.out.println("Starting: Ali's Location is = (0 : 0)"
//                + " Hasan's Location is = (0 : 0)");
//        System.out.println("Hasan has Random Movement, Ali follows order.");
//
//        while (true) {
//            System.out.print("Ali: Where should I go now (^, v, <, >, q to quit): ");
//            String command = input.next();
//
//            if (command.equalsIgnoreCase("q")) {
//                break;
//            }
//
//            if (command.length() != 1 ||
//                    "^v<>".indexOf(command.charAt(0)) == -1) {
//                System.out.println("Invalid direction! Use ^, v, <, or >.");
//                continue;
//            }
//
//            char aliDirection = command.charAt(0);
//
//            // Ali follows the user's direction
//            ali.moveSafely(aliDirection, "Ali");
//
//            // Hasan randomly chooses a direction
//            char hasanDirection =
//                    directions[random.nextInt(directions.length)];
//
//            hasan.moveSafely(hasanDirection, "Hasan");
//
//            // Display both locations after the moves
//            ali.display("Ali");
//            hasan.display("Hasan");
//        }
//
//        System.out.println("Walking ended.");
//        input.close();
//    }
//}