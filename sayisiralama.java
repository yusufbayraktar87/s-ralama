import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args){

        // Girilen 3 sayıyı küçükten büyüğe sıralama

        int a,b,c ;
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Birinci sayiyi giriniz : ");
        a = scan.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        b = scan.nextInt();
        System.out.print("Ucuncu sayiyi giriniz : ");
        c = scan.nextInt();

        if ((a > b) && (a >c)) {
            if (b > c) {
                System.out.println("c < b < a");
            }else {
                System.out.println("b < c < a ");
            }
        }else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("c < a < b");
            } else {
                System.out.println("a < c < b");
            }
        }else {
            if (b >a) {
                System.out.println("a < b < c");
            }else {
                System.out.println("b < a < c");
            }

        }
    }
    }

