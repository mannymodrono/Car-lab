import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Starting miles?");
        double startMiles = input.nextDouble();

        System.out.println("Ending miles?");
        double endMiles = input.nextDouble();

        System.out.println("Gallons used?");
        double gallons = input.nextDouble();

        input.close();

        Car miata = new Car(startMiles, endMiles, gallons);

        System.out.println("\n\n" + miata.toString());
        
    }
}