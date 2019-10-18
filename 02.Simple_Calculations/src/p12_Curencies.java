import java.util.*;

public class p12_Curencies
{
    public static void main(String[] args)
    {
        HashMap<String, Double> m = new HashMap<>();
        Scanner in = new Scanner(System.in);
        double entrance = in.nextDouble();
        String currency1 = in.next();
        String currency2 = in.next();
        m.put("BGN", 1.0);
        m.put("USD", 1.79549);
        m.put("GBP", 2.53405);
        m.put("EUR", 1.95583);
        double result;
        result = m.get(currency1) / m.get(currency2) * entrance * 100;
        result = ((double)Math.round(result)) / 100;
        System.out.println(result + " " + currency2);
        //Напишете програма за конвертиране на парична сума от една валута в друга. Трябва да се поддържат следните валути: BGN, USD, EUR, GBP. Използвайте следните фиксирани валутни курсове:
    }
}