import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int diamondTopHeight = n /2 + n % 2;
        int diamondBottomHeight = (n % 2) == 0 ? (n - diamondTopHeight - 1) : (n - diamondTopHeight);

        for (int i = 1; i <= diamondTopHeight; i++) {
            diamondLineOutput(n, i);
        }
         for (int i = diamondBottomHeight; i > 0; i--) {
            diamondLineOutput(n, i);
        }
    }

    static void diamondLineOutput(int diamondWidth, int i) {
        int sideDashesCount = (diamondWidth/2 + diamondWidth % 2) - i;
        String sideDashes = repeatStr("-", sideDashesCount);
        int diamondBodyWidth = diamondWidth - sideDashesCount * 2;
        String diamondBody = "";
        if (diamondBodyWidth > 1){
            diamondBody = "*" + repeatStr("-", diamondBodyWidth-2) + "*";
        }
        else {
            diamondBody = "*";
        }

        System.out.println(sideDashes + diamondBody + sideDashes);
    }
    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
