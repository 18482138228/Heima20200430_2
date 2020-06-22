public class StudentDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName()+s.getAge());

        s.setName("he");
        s.setAge(34);
        System.out.println(s.getName()+s.getAge());
    }
}
