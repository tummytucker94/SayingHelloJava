import java.util.Scanner;

public class SayingHelloApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's Your Name?");
        String name = scan.nextLine();

        String greetings = "Hello " + name + ", nice to meet you!";
        System.out.println(greetings);


    }
}
