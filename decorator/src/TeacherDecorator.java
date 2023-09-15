public abstract class TeacherDecorator implements Teacher {
    Teacher teacher;
    public TeacherDecorator(Teacher teacher){
        this.teacher= teacher;
    }

    @Override
    public void doJab() {
        teacher.doJab();
    }
}
