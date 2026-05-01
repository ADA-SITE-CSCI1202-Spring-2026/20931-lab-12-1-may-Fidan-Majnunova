import java.util.HashSet;
public class UsernameChecker {
public static void main(String[] args) {
    HashSet<String> usernames = new HashSet<>();
    // ===== TODO 1 =====
    // Add these usernames:
    // "ali"
    // "leyla"
    // "murad"
    // "ali"
    // "nigar"
    // "leyla"
    usernames.add("Ali");
    usernames.add("Leyla");
    usernames.add("Murad");
    usernames.add("Ali");
    usernames.add("Nigar");
    usernames.add("Leyla");
    
    System.out.println("Unique usernames:");
    // ===== TODO 2 =====
    // Print all usernames using forEach lambda.

    usernames.forEach(name->System.out.println(name));
    System.out.println("\nChecking username:");
    String newUsername = "ali";

   // ===== TODO 3 =====
   // If username exists print:
   // Username already taken
   // Otherwise add it and print:
   // Username added
   
   if(usernames.contains(newUsername)){
    System.out.println(("Username already taken"));

   }
   else{
    usernames.add(newUsername);
    System.out.println("Username added");
   }
}
}
