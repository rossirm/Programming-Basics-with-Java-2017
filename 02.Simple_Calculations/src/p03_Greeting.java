import java.util.Scanner;
//Enter your name:

public class p03_Greeting {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
//Да се напише програма, която чете от конзолата име на човек, въведено от потребителя, и отпечатва “Hello, <name>!”, където <name> е въведеното преди това име.