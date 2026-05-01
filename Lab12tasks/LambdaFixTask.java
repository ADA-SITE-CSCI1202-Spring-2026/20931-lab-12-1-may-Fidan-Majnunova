interface NumberChecker {
    boolean check(int number);
    //void printResult();<-this is wrong, we can't have 2 abstract methods when using lambdas
    default void printResult(int number){
        System.out.println("The checked number is: ");

    }
}
public class LambdaFixTask {
    public static void main(String[] args) {
        NumberChecker isEven = number -> number % 2 == 0;
        System.out.println(isEven.check(10));
    }
}