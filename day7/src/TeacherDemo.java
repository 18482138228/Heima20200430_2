public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.test(s);
        //t.getStudent();
        System.out.println(t.getStudent());
        Student s2 = t.getStudent();
        System.out.println(s2);
    }
}
