package hw20250416.심화.exam01;

public class Database {
    private static Database instance = new Database();
    private Database() {}

    public static Database getInstance(){
        return instance;
    }

    private static String connection = "MySQL";

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

}
