package odev;

public class Kitap {
    private String title;
    private String author;
    private KitapDurumu status;
    
    public Kitap(String title, String author, KitapDurumu status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }
    
    public String getTitle() {
        return  this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public KitapDurumu getStatus() {
        return this.status;
    }
    
    public void setStatus(KitapDurumu status) {
        this.status = status;
    }
}
