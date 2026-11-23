public class ProductManager {

    public void urunBilgileriniGoster(Product product) {
        System.out.println("Ürün: " + product.getName());
        System.out.println("Fiyat: " + product.getPrice());
        System.out.println("Stok: " + product.getStock());
        System.out.println("------------------------");
    }

    public void satisYap(Product product, int adet) {
        if (adet <= 0) {
            System.out.println("Hata: Satış adedi pozitif olmalıdır!");
        } else if (adet > product.getStock()) {
            System.out.println("Yetersiz stok!");
        } else {
            product.setStock(product.getStock() - adet);
            System.out.println(adet + " adet " + product.getName() + " satıldı.");
        }
    }

    public void stokEkle(Product product, int adet) {
        if (adet > 0) {
            product.setStock(product.getStock() + adet);
            System.out.println(adet + " adet " + product.getName() + " stoka eklendi.");
        } else {
            System.out.println("Hata: Eklenecek adet pozitif olmalıdır!");
        }
    }
}