public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        /*System.out.println(s.age);
        System.out.println(s.name);
        System.out.println("---------");
*/
        /*s.age = 18;
        s.name = "he";
        System.out.println(s.age);
        System.out.println(s.name);*/
        s.setAge(13);
        s.show();
        s.study();
        s.eat();
    }
}
