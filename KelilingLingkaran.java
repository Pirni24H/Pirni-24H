import java.util.Scanner;

public class KelilingLingkaran {

    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan jari jari lingkaran :");
    Double jarijari = input.nextDouble();
    Double keliling = 2 * Math.PI * jarijari;
    System.out.print(" Keliling Lingkaran :" + keliling);

    input.close();
    }

}
