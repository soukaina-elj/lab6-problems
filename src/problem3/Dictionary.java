package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String t, String l) {
        super(t);
        this.language = l;
    }
    public String getLanguage() {
        return language;
    }
    public String toString() {
        return super.toString() + ", Language: " + language;
    }
}
