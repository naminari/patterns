public class Main {
    public static void main(String[] args) {
        Teacher teacher = new MathTeacher();
        Classmate mathClassmate = new Classmate(new MathTeacher());

        teacher.doJab();
        mathClassmate.doJab();
    }
}