package sayingHello;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		String greeting = "Hello " + name + " nice to meet you.";
		System.out.println(greeting);
		scanner.close();
	}
}
