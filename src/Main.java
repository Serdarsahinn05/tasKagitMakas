import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userPoint = 0;
        int computerPoint = 0;

        System.out.println("Taş kağıt makas oyununa hoşgeldiniz.");
        System.out.println("1-Taş \n2-Kağıt \n3-Makas");
        while (true) {
            System.out.println("Seçiminiz: ");
            int secim = scanner.nextInt();
            int bilsecim = (int) (Math.random() * 3);

            switch (secim) {
                case 1:
                    if (bilsecim == 1) {
                        System.out.println("Berabere");
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else if (bilsecim == 2) {
                        System.out.println("Kaybettin. Bilgisayar 1 puan kazandı");
                        computerPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else {
                        System.out.println("Tebrikler 1 puan kazandınız");
                        userPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    }
                    break;
                case 2:
                    if (bilsecim == 1) {
                        System.out.println("Tebrikler 1 puan kazandınız");
                        userPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else if (bilsecim == 2) {
                        System.out.println("Berabere");
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else {
                        System.out.println("Kaybettin. Bilgisayar 1 puan kazandı");
                        computerPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    }
                    break;
                case 3:
                    if (bilsecim == 1) {
                        System.out.println("Kaybettin. Bilgisayar 1 puan kazandı");
                        computerPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else if (bilsecim == 2) {
                        System.out.println("Tebrikler 1 puan kazandınız");
                        userPoint += 1;
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    } else {
                        System.out.println("Berabere");
                        System.out.println("***Şu anki skor*** \nSen:" + userPoint );
                        System.out.println("Bilgisayar: " + computerPoint );
                    }
                    break;
            }

            if ( computerPoint ==3){
                System.out.println("oyun bitti.KAYBETTİN");
                break;
            } else if (userPoint == 3) {
                System.out.println("Oyun bitti.KAZANDIN");
                break;
            }


        }


    }
}