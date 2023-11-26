import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game!!");
        System.out.println("Would you like to continue?");
        Scanner scanner = new Scanner(System.in);
        String option1 = scanner.nextLine();
        if (option1.equals("y")) {
            // Question function
            int score = pointScore(scanner);
            System.out.println("Your score: " + score);
        }
    }

    static int pointScore(Scanner scanner) {
        // General Information
        System.out.println("All questions carry 1 mark");

        // Score record
        int point = 0;

        System.out.println("Which is the meaning of OOP?");
        System.out.println("a) Ohio Oklahoma Otif\nb) Object Oriented Programming\nc) Oriented Olive Product\nd) Ohlin Operated Product");

        String option2 = scanner.nextLine();
        if (option2.equals("b")) {
            point++;
        }

        System.out.println("What is 20*10?\na) 200 \nb) 100 \nc) 50 \nd) I know not");
        String option3 = scanner.nextLine();
        if (option3.equals("a")) {
            point++;
        }

        System.out.println("What is the full meaning of UoPeople?\na) University of the People \nb) Union of People \nc) UoP \nd) I care not");
        String option4 = scanner.nextLine();
        if (option4.equals("a")) {
            point++;
        }
        
        System.out.println("What is the full meaning of A in ASCII?\na) American \nb) Anglophone \nc) Angola \nd) Albania");
        String option5 = scanner.nextLine();
        if (option5.equals("a")) {
            point++;
        }
        
        System.out.println("What is the full meaning of C in ASCII?\na) Character \nb) Cartage \nc) Carnivore \nd) Chimeric");
        String option6 = scanner.nextLine();
        if (option6.equals("a")) {
            point++;
        }

        return point; // Return the total points
    }
}