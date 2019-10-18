import java.util.Scanner;

public class p04_ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console. nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();
        System.out.printf("You are %s %s, a %d-years old from %s.", firstName, lastName, age, town);
        //System.out.println("You are" + " " + firstName + " " + lastName + ", a " + age + "-year-old person from " + town + '.');
        //Напишете Java програма, която прочита от конзолата име, фамилия, възраст и град, въведени от потребителя, и печата съобщение от следния вид: “You are <firstName> <lastName>, a <age>-years old person from <town>”.
    }
}
