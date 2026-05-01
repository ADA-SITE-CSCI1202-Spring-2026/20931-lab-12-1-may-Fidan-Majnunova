import java.util.HashMap;

public class ProductStock 
{
public static void main(String[] args) {
    HashMap<String, Integer> stock = new HashMap<>();

    // ===== TODO 1 =====
    // Add these products:
    // "Laptop" -> 5
    // "Mouse" -> 20
    // "Keyboard" -> 10
    // "Monitor" -> 3
    stock.put("Laptop",5);
    stock.put("Mouse",20);
    stock.put("Keyboard",10);
    stock.put("Monitor",3);

    System.out.println("All products:");
    //===== TODO 2 =====
    // Print all products using forEach lambda.
    stock.forEach((product, quantity) -> {System.out.println(product + ": " + quantity);});
    System.out.println("\nLow stock products:");

    // ===== TODO 3 =====
    // Print only products with quantity less than 6.
    stock.forEach((product, quantity) -> {
            if (quantity < 6) {
                System.out.println(product + ": " + quantity);
            }
        });
    }
}
