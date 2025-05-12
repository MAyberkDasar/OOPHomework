package odev;

public class Kutuphane {
    private Kitap[] kitaplar;
    private int index = 0;
    
    public Kutuphane(int diziBoyutu) {
        kitaplar = new Kitap[diziBoyutu];
    }
    
    public void adBook(Kitap kitap) {
        kitaplar[index] = kitap;
        index++;
    }
    
    public void displayBooks() {
        System.out.println("Kutuphanedeki Butun Kitaplar: ");
        for(int i = 0; i < kitaplar.length; i++) {
            System.out.println("Kitap: "+ kitaplar[i].getTitle()+ " Yazar: "+ kitaplar[i].getAuthor()+ " Durum: "+ kitaplar[i].getStatus());
        }
    }
    
    public void findAvailableBooks() {
        System.out.println("Kutuphanedeki Mevcut Kitaplar: ");
        for(int i = 0; i < kitaplar.length; i++) {
            if(kitaplar[i].getStatus() == KitapDurumu.MEVCUT) {
                System.out.println("Kitap: "+ kitaplar[i].getTitle()+ " Yazar: "+ kitaplar[i].getAuthor());
            }
        }
    }
}
