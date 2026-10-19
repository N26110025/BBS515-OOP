import java.util.Scanner;

public class OgrenciNotAnalizSistemi {

    // 1. Kullanicidan notlari al
    public static void notlariAl(int[] notlar) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i + 1) + ". ogrencinin notu: ");
            notlar[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // 2. Sinif ortalamasini hesapla
    public static double ortalamaHesapla(int[] notlar) {
        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];
        }
        return (double) toplam / notlar.length;
    }

    // 3. En yuksek notu bul
    public static int enYuksekNot(int[] notlar) {
        int enYuksek = notlar[0];
        for (int i = 1; i < notlar.length; i++) {
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
        }
        return enYuksek;
    }

    // 4. Basarili ogrenci sayisini hesapla
    public static int basariliSayisi(int[] notlar) {
        int sayac = 0;
        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] >= 50) {
                sayac++;
            }
        }
        return sayac;
    }

    // 5. Sonuclari ekrana yazdir
    public static void sonuclariYazdir(double ortalama, int enYuksek, int basarili) {
        System.out.println("===== ANALIZ SONUCLARI =====");
        System.out.println("Sinif ortalamasi: " + ortalama);
        System.out.println("En yuksek not: " + enYuksek);
        System.out.println("Basarili ogrenci sayisi: " + basarili);
    }

    public static void main(String[] args) {
        int[] notlar = new int[5];
        System.out.println("===== OGRENCI NOT ANALIZ SISTEMI =====");
        notlariAl(notlar);
        double ortalama = ortalamaHesapla(notlar);
        int enYuksek = enYuksekNot(notlar);
        int basarili = basariliSayisi(notlar);
        sonuclariYazdir(ortalama, enYuksek, basarili);
    }
}
