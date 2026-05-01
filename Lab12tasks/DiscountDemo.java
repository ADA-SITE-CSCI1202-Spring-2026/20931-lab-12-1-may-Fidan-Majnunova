@FunctionalInterface
interface DiscountCalculator {
// ===== TODO 1
// Create a method named calculate.
// It should take double price and return double.
    double calculate(double price);
}
public class DiscountDemo {
    public static void main(String[] args) {
// ===== TODO 2 =====
// Create a lambda that gives 10% discount.
        DiscountCalculator tenpercent = price->price*0.9;




//  ===== TODO 3 =====
// Create a lambda that gives 25% discount.
    DiscountCalculator twentyFivePercent = price->price*0.75;
    double price = 100;
    

//===== TODO 4 =====
// Print final price after 10% discount.
    System.out.println("The final price after 10%discount is: " + tenpercent.calculate(price));

// ===== TODO 5
// Print final price after 25% discount.
    System.out.println("The final price after 25% discount is: " + twentyFivePercent.calculate(price));

}
}