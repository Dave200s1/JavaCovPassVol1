import java.util.Scanner;

public class CovidTest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //int geimpft = 1;
        int vollständigGeimpft= 2;

        System.out.println("Wie viele Dosen haben Sie bereits eine Impfung gegen Covid erhalten?(Zahl eingb) :");

        int scanned = sc.nextInt();

        if(scanned < vollständigGeimpft){
            System.out.println("Sie sind nicht vollständig geimpft !");
        }else{
            System.out.println("Sie sind vollständig geimpft:");
        }
    }
}