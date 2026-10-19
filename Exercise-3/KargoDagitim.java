public class KargoDagitim {

    public static void main(String[] args) {

 

        // Kumbarayı döngünün dışında oluşturdum, her turda sıfırlanmasın diye

        double toplam = 0;

 

        // For döngüsü yapıldı 1'den 10'a kadar

        for (int i = 1; i <= 10; i++) {

 

            // Her teslimat bir öncekinden 5 KM uzak

            int mesafe = i * 5;

            double ucret = 0;

 

            // Mesafeye göre temel ücret

            if (mesafe <= 10) {

                ucret = 50;

            } else if (mesafe <= 30) {

                ucret = 80;

            } else {

                ucret = 120;

            }

 

            // Teslimat numarası 3'ün katıysa +20 TL eklenir

            // % kalan veriyor, kalan 0 ise 3'ün katıdır

            if (i % 3 == 0) {

                ucret = ucret + 20;

            }

 

            // 40 KM ve üzerinde %10 indirim uygula

            // Kural 2'den sonra olmalı

            if (mesafe >= 40) {

                ucret = ucret * 0.9;

            }

 

            System.out.println(i + ". Teslimat - Mesafe: " + mesafe + " km - Ücret: " + ucret + " TL");

 

            // Teslimat ücretini al, kumbaraya at

            toplam = toplam + ucret;

        }

 

        // İşlem tamam, kumbarayı aç

        System.out.println();

        System.out.println("Toplam Gelir: " + toplam + " TL");

    }

}

 