import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int km, yas, yolculukTipi;
        double perKm = 0.10;
        double tutar, yolindirimi, onikindirim, ydindirimi, abindirimi;


        System.out.print("Kilometreyi Giriniz: ");
        km = girdi.nextInt();
        System.out.print("Yasinizi Giriniz: ");
        yas = girdi.nextInt();
        System.out.println("1-Tek Yon\n2-Gidis-Donus");
        System.out.print("Yolculuk Tipini Seciniz: ");
        yolculukTipi = girdi.nextInt();

        tutar = km * perKm;
        yolindirimi = tutar * 0.20;
        onikindirim = tutar * 0.50;
        ydindirimi = tutar * 0.10;
        abindirimi = tutar * 0.30;

        if ((km <= 1) || (yas < 1) || (yolculukTipi > 2)) {
            System.out.println("Hatali Veri Girdiniz.");
            return;
        }
        if (yolculukTipi == 2) {
            if ((yas > 0) && (yas < 12)) {
                System.out.println("Toplam Ucret : " + (tutar - (yolindirimi + onikindirim)));
            } else if ((yas >= 12) && (yas <= 24)) {
                System.out.println("Toplam Ucret : " + (tutar - (yolindirimi + ydindirimi)));
            } else if (yas > 65) {
                System.out.println("Toplam Ucret : " + (tutar - (yolindirimi + abindirimi)));
            } else if (((yas>25) && (yas<=65))) {
                System.out.println("Toplam Ucret : " + (tutar -yolindirimi));
            }


        } else if (yolculukTipi == 1) {
            if ((yas > 0) && (yas < 12)) {
                System.out.println("Toplam Ucret : " + (tutar - onikindirim));
            } else if ((yas >= 12) && (yas <= 24)) {
                System.out.println("Toplam Ucret : " + (tutar - ydindirimi));
            } else if (yas > 65) {
                System.out.println("Toplam Ucret : " + (tutar - abindirimi));
            } else if ((yas>25) && (yas<=65)) {
                System.out.println("Toplam Ucret : " + (tutar));
            }

        }

    }
}