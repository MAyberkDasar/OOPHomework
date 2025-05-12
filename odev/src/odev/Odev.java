package odev;


public class Odev {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane(6);
        
        kutuphane.adBook(new Kitap("Başlangıç", "Dan Brown", KitapDurumu.MEVCUT));
        kutuphane.adBook(new Kitap("Cerrah", "Tess Gerritsen", KitapDurumu.REZERVE));
        kutuphane.adBook(new Kitap("Aklından Bir Sayı Tut", "John Verdon", KitapDurumu.ÖDÜNÇVERİLMİŞ));
        kutuphane.adBook(new Kitap("Christine", "Stephen King", KitapDurumu.MEVCUT));
        kutuphane.adBook(new Kitap("Susuzluk", "Jo Nesbo", KitapDurumu.REZERVE));
        kutuphane.adBook(new Kitap("Doğu Ekspresinde Cinayet", "Agatha Christie", KitapDurumu.ÖDÜNÇVERİLMİŞ));
        
        kutuphane.displayBooks();
        
        kutuphane.findAvailableBooks();
    }
}

