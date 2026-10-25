package problem3;

public class Novel extends Book{
    public double price;
    public Novel(String t, String a, int nbrPages, double price) {
        super(t, a, nbrPages);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return super.toString() + ", Price: " + price;
    }
}
