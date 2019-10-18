import java.util.Scanner;

public class p10_Animal_Type {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
            default:
                System.out.println("unknown");
                break;
        }
    }
}
/*
Напишете програма която принтира класа на животното според името му, въведено от потребителя:
 dog -&gt; mammal
 crocodile, tortoise, snake -&gt; reptile
 others -&gt; unknown
 */