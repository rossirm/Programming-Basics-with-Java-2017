import java.util.Scanner;

public class p04_2_Fruit_or_Vegetable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();

        switch (input) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
/*
Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или
зеленчук.
 Плодовете &quot;fruit&quot; са banana, apple, kiwi, cherry, lemon и grapes
 Зеленчуците &quot;vegetable&quot; са tomato, cucumber, pepper и carrot
 Всички останали са &quot;unknown&quot;
Да се изведе „fruit“, „vegetable“ или „unknown“ според въведения продукт.
 */