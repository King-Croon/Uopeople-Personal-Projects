import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private Map<String, Integer> bookInventory;

    public Library() {
        this.bookInventory = new HashMap<>();
    }

    public void addBook(String bookName, int quantity) {
        // Check if the book already exists in the inventory
        if (bookInventory.containsKey(bookName)) {
            // If yes, update the quantity
            int currentQuantity = bookInventory.get(bookName);
            bookInventory.put(bookName, currentQuantity + quantity);
            System.out.println("Books have been added to our list. Thank You!");
        } else {
            // If not, add the book to the inventory
            bookInventory.put(bookName, quantity);
            System.out.println("Book has been added to Library. Thank You!");
        }
    }

    public void borrowBook(String bookName, int quantity) {
        if (bookInventory.containsKey(bookName)) {
            // If yes, update the quantity
            int currentQuantity = bookInventory.get(bookName);
            if (currentQuantity >= quantity) {
                bookInventory.put(bookName, currentQuantity - quantity);
                System.out.println(quantity + " copies of '" + bookName + "' borrowed from the library.");
            } else {
                System.out.println("Not enough copies available for '" + bookName + "'.");
            }
        } else {
            System.out.println("Book '" + bookName + "' not found in the library.");
        }
    }
    public void returnBook(String bookName, int quantity) {
        if (bookInventory.containsKey(bookName)) {
            // If yes, update the quantity
            int currentQuantity = bookInventory.get(bookName);
            bookInventory.put(bookName,currentQuantity+quantity);
            System.out.println(quantity + " copies of '" + bookName + "' returned to the library.");
        }
    }

    // Additional methods for your library class can be added here

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to the Library.\nWhat would you like to do?\nPress the number for the activity.\n1. Add a book\n2. Borrow a book\n3. Return a book\n4. Exit");

        Scanner scanner = new Scanner(System.in);
        String activity = scanner.nextLine();

        if (activity.equals("1")) {
            System.out.println("Title of Book:");
            String title = scanner.next();
            System.out.println("Quantity of book:");
            int qty = scanner.nextInt();
            library.addBook(title, qty);
        } else if (activity.equals("2")) {
            System.out.println("Input Title of book");
            String title = scanner.next();
            System.out.println("Input quantity");
            int qty = scanner.nextInt();
            library.borrowBook(title, qty);
        } else if (activity.equals("3")) {
            // Handle returning a book
            System.out.println("Input Title of book");
            String title = scanner.next();
            System.out.println("Input quantity");
            int qty = scanner.nextInt();
            library.returnBook(title, qty);
            System.out.println(qty + " copies of " + title + " returned to the library.");
        } else {
            // Handle exiting the program
            // No need for 'Break;'
        }

    }
}