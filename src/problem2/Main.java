package problem2;



public class Main {
    public static void main(String[] args){
        Bank b = new Bank("BMCE");
        b.addCustomer("soukaina");
        b.addCustomer("Aymane");
        b.addCustomer("Bouchra");
        b.addTransaction("Soukaina", 12000);
        b.addTransaction("Soukaina", 1235);
        b.addTransaction("Soukaina", -123);
        b.addTransaction("Aymane" , -1234);
        b.addTransaction("Bouchra", 100000);
        b.print("Soukaina");
        b.print("Aymane");
        b.print("Bouchra");
    }
}
