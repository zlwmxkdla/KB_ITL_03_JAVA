package hw20250416.심화.exam01;

public class DatabaseExample {
    public static void main(String[] args) {
        Database mydatabasae = Database.getInstance();
        mydatabasae.connect();
        mydatabasae.close();
    }
}
