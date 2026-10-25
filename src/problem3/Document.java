package problem3;

public class Document {
    protected int numRec;
    protected String title ;
    private static int nextNum = 1 ;
    public Document(String t){
        this.numRec = nextNum ++;
        this.title = t;
    }
    public String getTitle(){
        return this.title;
    }
    public int getNumRec() {
        return numRec;
    }
    public String toString(){
        return "Document number: " + numRec + ", Title: " + title;
    }

}
