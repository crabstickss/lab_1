import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Введите первое число:");
        int a = num.nextInt();
        System.out.println("Введите второе число:");
        int b = num.nextInt();
        System.out.println("Введите третье число:");
        int c = num.nextInt();
        System.out.println("Введите четвертое число:");
        int d = num.nextInt();
        int smallest;
        String smallestString;
        switch (smallest) {
            case a < b && a< c && a < d: smallestString = a;
                break;
            case c < b && c< a && c < d: smallestString = c;
                break;
            case b < a && b< c && b < d: smallestString = b;
                break;
            case d < b && d< c && d < a: smallestString = d;
                break;
            default: smallestString = "Error";
            break;




        }

        }

}
