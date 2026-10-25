package problem3;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> docs;
    public Library(int c) {
        this.capacity = c;
        this.docs = new ArrayList<>(c);
    }
    public void displayDocuments() {
        for (Document doc : docs) {
            System.out.println(doc.toString());
        }
    }
    public boolean add(Document doc) {
        if (doc == null || docs.size() >= capacity) {
            return false;
        }
        return docs.add(doc);
    }

    public boolean delete(Document doc) {
        return docs.remove(doc);
    }

    public Document document(int numEnrg) {
        for (Document doc : docs) {
            if (doc.getNumRec() == numEnrg) {
                return doc;
            }
        }
        return null;
    }
    public void displayAuthors() {
        for (Document doc : docs) {
            if (doc instanceof Book) {
                Book book = (Book) doc;
                System.out.println(book.getAuthor());
            }
        }
    }
    public String toString() {
        return docs.toString();
    }
}
