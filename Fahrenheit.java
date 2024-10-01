import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan suhu dalam Celcius :");
        Double celcius = input.nextDouble();
        Double fahrenheit = (celcius * 9/5) + 32;
        System.out.print("Suhu dalam Fahrenheit :" + fahrenheit);

        input.close();
    }
}