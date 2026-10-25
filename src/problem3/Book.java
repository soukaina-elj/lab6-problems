package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    public Book(String t, String a, int nbrPages) {
        super(t);
        this.author = a;
        this.nbrPages = nbrPages;
    }
    public String getAuthor() {
        return author;
    }
    public int getNbrPages(){
        return this.nbrPages;
    }
    public String toString() {
        return super.toString() + ", Author: " + author + ", Number of pages: " + nbrPages;
    }
}
