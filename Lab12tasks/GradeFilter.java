import java.util.HashMap;
@FunctionalInterface
interface GradeRule {
    boolean test(int grade);
}
public class GradeFilter {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Ali", 85);
        grades.put("Leyla", 92);
        grades.put("Murad", 55);
        grades.put("Nigar", 70);
        
        grades.put("Kamran", 40);
// ===== TODO 1 =====
// Create passedRule lambda.
        GradeRule passedRule = grade->grade>=50;

// ===== TODO 2 =====
// Create excellentRule lambda.
        GradeRule excellentRule=grade->grade>=90;
        System.out.println("Passed students:");

// ===== TODO 3 =====
// Print passed students.
         System.out.println("Passed students:");
        grades.forEach((name, grade) -> {
            if (passedRule.test(grade)) {
                System.out.println(name + " - " + grade);
            }
        });
// ===== TODO 4 =====
//Print excellent students
        System.out.println("\nExcellent students:");
        grades.forEach((name, grade) -> {
            if (excellentRule.test(grade)) {
                System.out.println(name + " - " + grade);
            }
        });
    }
}