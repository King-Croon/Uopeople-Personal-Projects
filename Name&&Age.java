import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome To Main\nYour Name\nYour Age.");
		String Name=UserName();
		String Age=UserAge();
		System.out.println(Name);
		System.out.println(Age);
	}
	public static String UserName() {
	    Scanner scanner = new Scanner(System.in);
	    String Name=scanner.nextLine();
	    return Name;
	}
	public static String UserAge(){
	    Scanner scanner = new Scanner(System.in);
        String Age = scanner.nextLine();
        return Age;
	}
}