import java.util.Scanner;

public class odev13 {
    public static void main(String[] args) {
        int gun;
        String ay;

        Scanner input = new Scanner(System.in);

        System.out.println("\nBurc Bilgi Sistemine Hosgeldiniz. \nBurcunuzu Ogrenmek Icin Istenilen Bilgileri Giriniz !");

        System.out.print("\nDogdugunuz ay : ");
        ay = input.nextLine();

        System.out.print("\nDogdunuz Gun : ");
        gun = input.nextInt();
        if (gun > 0 && gun <= 31) {
        } else {
            System.out.println("Gun Degeri Yanlis");
            return;
        }
        if (ay.equals("mart")) {
            if (gun >= 0 && gun <= 20) {
                System.out.println("Burcunuz Balik");
            } else if (gun >= 21 && gun <= 31) {
                System.out.println("Burcunuz Koc");
            }
        } else if (ay.equals("nisan")) {
            if (gun > 0 && gun <= 30) {
                if (gun > 0 && gun <= 20) {
                    System.out.println("Burcunuz Koc");
                } else {
                    System.out.println("Burcunuz Boga");
                }
            } else {
                System.out.println("Nisan Ayı 30 Cekiyor");
                return;
            }
        } else if (ay.equals("mayıs")) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Burcunuz Boga ");
            } else {
                System.out.println("Burcunuz Ikizler");
            }
        } else if (ay.equals("haziran")) {
            if (gun > 0 && gun <= 30) {
                if (gun > 0 && gun <= 22) {
                    System.out.println("Burcunuz Ikizler");
                } else {
                    System.out.println("Burcunuz Yengec");
                }
            } else {
                System.out.println("Haziran Ayı 30 Cekiyor");
                return;
            }

        } else if (ay.equals("temmuz")) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Burcunuz Yengec");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        } else if (ay.equals("ağustos")) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        } else if (ay.equals("eylül")) {
            if (gun > 0 && gun <= 30) {
                if (gun > 0 && gun <= 22) {
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            } else {
                System.out.println("Eylül Ayı 30 Cekiyor");
                return;
            }
        } else if (ay.equals("ekim")) {
            if (gun > 0 && gun <= 22) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        } else if (ay.equals("kasım")) {
            if (gun > 0 && gun <= 30) {
                if (gun > 0 && gun <= 21) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            } else {
                System.out.println("Eylül Ayı 30 Cekiyor");
                return;
            }

        } else if (ay.equals("aralık")) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }
        } else if (ay.equals("ocak")) {
            if (gun > 0 && gun <= 21) {
                System.out.println("Burcunuz Oğlak");
            } else {
                System.out.println("Burcunuz Kova");
            }
        } else if (ay.equals("şubat")) {
            if (gun > 0 && gun <= 28) {
                if (gun > 0 && gun <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            } else {
                System.out.println("Subat Ayi 28 Cekiyor");
                return;
            }
        } else {
            System.out.println("\nLutfen Ay Bilgisini Dogru Giriniz !!!");
        }
    }
}