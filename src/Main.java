import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        task4_1(in);
        task4_2(in);
        task4_3(in);
        task4_4(in);
        in.close();
    }

    private static void task4_1(Scanner in) {
        System.out.println("Введите строку");
        String inputString = in.nextLine();

        System.out.println("Введите подстроку");
        String substring = in.nextLine();

        String[] parts = inputString.split(substring, -1);

        int count = parts.length - 1;

        System.out.println("Подстрока '" + substring + "' встречается " + count + " раза");
        System.out.println();
    }

    private static void task4_2(Scanner in) {
        System.out.println("Введите строку");
        String inputString = in.nextLine();

        String result = inputString.replaceAll("(?i)кака|бяка", "вырезано цензурой");

        System.out.println(result);
        System.out.println();
    }

    private static void task4_3(Scanner in) {
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String date = in.nextLine();

        String[] parts = date.split("\\.");

        if (parts.length == 3) {
            System.out.println(parts[2] + "-" + parts[1] + "-" + parts[0]);
        } else {
            System.out.println("Некорректный формат даты.");
        }
        System.out.println();
    }

    private static void task4_4(Scanner in) {
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String inputDate = in.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(inputDate);
            String formattedDate = outputFormat.format(date);

            System.out.println(formattedDate);
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
        }
        System.out.println();
    }
}