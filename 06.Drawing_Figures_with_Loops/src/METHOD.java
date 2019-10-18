public class METHOD {
    public static void main(String[] args) {
    }
    public static String repeatStr(String text, int countTimes) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < countTimes; i++) {
            result.append(text);
        }

        return result.toString();
    }
}
