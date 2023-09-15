public class Main {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.load();
        database.remove();
        database.select();
        database.update();
    }
}