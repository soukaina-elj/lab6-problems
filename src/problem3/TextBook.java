package problem3;

public class TextBook extends Book{
    public String level;
    public TextBook(String t, String a, int nbrPages, String level) {
        super(t, a, nbrPages);
        this.level = level;
    }
    public String getLevel() {
        return level;
    }
    public String toString() {
        return super.toString() + ", Level: " + level;
    }
}
