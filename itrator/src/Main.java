public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"231", "1124", "41432"};
        Sportsman sportsman = new Sportsman("John", strings);

        Iterator iterator = sportsman.getIterator();
        while (iterator.hadNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}