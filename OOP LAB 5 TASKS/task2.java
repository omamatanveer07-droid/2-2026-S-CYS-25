
import java.util.Scanner;

class Walls {
    private String flavor;
    private int scoops;
    private String coneType;
    private int price;

    // Default constructor
    public Walls() {
        this("Vanilla", 1, "Sugar");
    }

    // Parameterized constructor
    public Walls(String flavor, int scoops, String coneType) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.coneType = coneType;
        calculatePrice();
    }

    // Calculate price
    private void calculatePrice() {
        price = scoops * 75;

        if (coneType.equalsIgnoreCase("Waffle")) {
            price += 40;
        }
    }

    // Display order
    public void displayOrder() {
        System.out.println("\n--- Ice Cream Order ---");
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Cone: " + coneType);
        System.out.println("Price: Rs. " + price);
    }
}

public class WallsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flavor;
        int scoops;
        String coneType;

        System.out.println("Available flavors:");
        System.out.println("Chocolate, Vanilla, Strawberry, Mango,");
        System.out.println("Tutti Fruit, Almond Crunch, Coffee");

        System.out.print("Enter flavor: ");
        flavor = sc.nextLine();

        System.out.print("Enter number of scoops: ");
        scoops = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter cone type (Sugar/Waffle): ");
        coneType = sc.nextLine();

        Walls order = new Walls(flavor, scoops, coneType);
        order.displayOrder();

        sc.close();
    }
}
