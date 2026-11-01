Task 2.java
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "[" + x + ":" + y + "]";
    }
}


class Walker {
    protected int x = 0;
    protected int y = 0;
    protected Set<Point> obstacles; // Association with obstacles

    public Walker(Set<Point> obstacles) {
        this.obstacles = obstacles;
    }

    public String getLocation() {
        return x + " : " + y;
    }
}


class DirectedWalker extends Walker {
    public DirectedWalker(Set<Point> obstacles) {
        super(obstacles);
    }

    public void move(char direction) {
        int nextX = x;
        int nextY = y;

        if (direction == '^') nextY++;
        else if (direction == 'v') nextY--;
        else if (direction == '<') nextX--;
        else if (direction == '>') nextX++;

        Point nextPoint = new Point(nextX, nextY);
        if (obstacles.contains(nextPoint)) {
            System.out.println("Ali encounters hurdle at " + nextPoint);
        } else {
            x = nextX;
            y = nextY;
        }
    }
}


class RandomWalker extends Walker {
    private Random random = new Random();
    private static final char[] DIRECTIONS = {'^', 'v', '<', '>'};

    public RandomWalker(Set<Point> obstacles) {
        super(obstacles);
    }

    public void moveRandomly() {
        char dir = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        int nextX = x;
        int nextY = y;

        if (dir == '^') nextY++;
        else if (dir == 'v') nextY--;
        else if (dir == '<') nextX--;
        else if (dir == '>') nextX++;

        Point nextPoint = new Point(nextX, nextY);
        if (obstacles.contains(nextPoint)) {
            System.out.println("Hasan encounters hurdle at " + nextPoint);
        } else {
            x = nextX;
            y = nextY;
        }
    }
}

public class WalkerSimulation {
    public static void main(String[] args) {

        obstacles.add(new Point(1, 2));

        DirectedWalker ali = new DirectedWalker(obstacles);
        RandomWalker hasan = new RandomWalker(obstacles);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting: Ali's Location is = " + ali.getLocation() + " Hassan's Location is = " + hasan.getLocation());
        System.out.println("Hasan has Random Movement, Ali follows order\n");

        while (true) {
            System.out.print("ALi: Where should i go now (^, v, <, >, or type 'exit' to quit): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;
            if (input.isEmpty()) continue;

            char direction = input.charAt(0);
            
            ali.move(direction);
            hasan.moveRandomly();

            System.out.println("Ali is at = " + ali.getLocation());
            System.out.println("Hasan is at = " + hasan.getLocation());
            System.out.println();
        }
        scanner.close();
    }
}