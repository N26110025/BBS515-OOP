public class Main {
    public static void main(String[] args) {

        // TODO 1: Constructor ile arac1, arac2, arac3 oluşturunuz.
        Arac arac1 = new Arac("Toyota", "Corolla", 1500, false);
        Arac arac2 = new Arac("Renault", "Clio", 1200, false);
        Arac arac3 = new Arac("BMW", "320i", 3000, true);

        // TODO 2: Üç aracın başlangıç bilgilerini yazdırınız.
        System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();

        // TODO 3: arac1 nesnesini kiralayınız.
        arac1.kirala();

        // TODO 4: arac1 nesnesini tekrar kiralamayı deneyiniz.
        arac1.kirala();

        // TODO 5: arac2 için 5 günlük kira bedelini hesaplayınız.
        double bedel = arac2.kiraBedeliHesapla(5);
        System.out.println("5 günlük kiralama bedeli: " + bedel + " TL");

        // TODO 6: arac3 nesnesini teslim alınız.
        arac3.teslimEt();

        // TODO 7: Üç aracın güncel bilgilerini yazdırınız.
        System.out.println();
        System.out.println("=== GÜNCEL ARAÇ DURUMLARI ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();
    }
}