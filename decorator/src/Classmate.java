public class Classmate extends TeacherDecorator{
    public Classmate(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void doJab() {
        teacher.doJab();
        System.out.println(" и отвественный за класс");
    }
}
