import java.util.Scanner;

public class Luaspersegi{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Luas PErsegi Panjang");
        Double panjang = input.nextDouble();
        System.out.print("Masukan Luas Persegi Panjang :");
        Double lebar = input.nextDouble();
        Double luas = (panjang * lebar);
        System.out.print("Keliling Persegi Panjang :" + luas);

        input.close();

    }
}