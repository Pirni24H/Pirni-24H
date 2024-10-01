import java.util.Scanner;

public class Volumekubus {

    public static void main (String[]args){

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Volume Kubus :");
    Double sisi = input.nextDouble();
    Double volume = sisi * sisi * sisi;
    System.out.print("Volume Kubus : " + volume);

    input.close();
    }   
}
