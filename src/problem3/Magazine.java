package problem3;

public class Magazine extends Document{
    private String month;
    private int year;
    public Magazine(String t, String m, int y) {
        super(t);
        this.month = m;
        this.year = y;
    }
    public String getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return super.toString() + ", Month: " + month + ", Year: " + year;
    }

}
