import java.util.Random;

public class veriables {
    static Random random = new Random();

    public static void main(String[] args) {

        int a = random.nextInt(1000);
        float b = random.nextFloat(2);
        double c = random.nextDouble(32);
        long d = random.nextLong(100000);
        boolean e = random.nextBoolean();

        System.out.println("Случайное число int: " + a + " (в диапозоне 1000)");
        System.out.println("Случайное число float: " + b + " (в диапозоне 2)");
        System.out.println("Случайное число double: " + c + " (в диапозоне 32)");
        System.out.println("Случайное число long: " + d + " (в диапозоне 100000)");
        System.out.println("Случайное число boolean: " + e);

        String str = "No pain, ";
        String str1 = "No pain";
        System.out.println(str + str1);     // concat(): объединяет строки

        String value = "123";
        int num = Integer.valueOf(value);
        System.out.println(value);         // valueOf(): преобразует объект в строковый вид

        String lng = "Enjoy the inexorable pain.";
        System.out.println(lng.length());  // length(): читает длинну строки

        String emp = "";
        if (emp.isEmpty());
        System.out.println("No pain, no gain.");

        String low = "If you don’t walk today, you’ll have to run tomorrow.";
        System.out.println(low.toLowerCase());                                  // toLowerCase(): переводит все символы строки в нижний регистр

        String up = "If you don’t walk today, you’ll have to run tomorrow.";    // toUpperCase(): переводит все символы строки в верхний регистр
        System.out.println(up.toUpperCase());

        String tr = "  Enjoy the inexorable pain.     ";                        // trim(): удаляет начальные и конечные пробелы
        System.out.println(tr.trim());
        
    }
}
