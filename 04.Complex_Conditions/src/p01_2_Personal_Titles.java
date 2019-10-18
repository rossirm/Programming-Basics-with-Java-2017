import java.util.Scanner;

public class p01_2_Personal_Titles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        //char gender = scan.findInLine(".").charAt(0);
        //char gender = scan.nextLine().charAt(0);


        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else if (gender.equals("f")) {
                System.out.println("Miss");
            }
        } else {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }
    }
}
        /*if (gender == 'm' && age >= 16) {
            System.out.println("Mr.");
        } else if (gender == 'm' && age < 16){
            System.out.println("Master");
        } else if (gender == 'f' && age >= 16) {
            System.out.println("Ms.");
        } else if ( gender == 'f' && age < 16) {
            System.out.println("Miss");
        } else {
            System.out.println("Error!");
        }
    }
}

Първата задача от тази тема е да се напише конзолна програма, която прочита възраст (десетично число) и
пол (“m” или “f”), въведени от потребителя, и отпечатва обръщение измежду следните:
 „Mr.“ – мъж (пол „m“) на 16 или повече години
 „Master“ – момче (пол „m“) под 16 години
 „Ms.“ – жена (пол „f“) на 16 или повече години
 „Miss“ – момиче (пол „f“) под 16 години
*/