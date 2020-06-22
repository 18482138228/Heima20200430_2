public class Student {
    private String name;
    private int age;
    public Student(){
        //System.out.println("这个是构造方法");
    }
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println("好好学习天天向上");
    }
    public void setAge(int a){
        if(a<0 && a>200){
            System.out.println("年龄有误");
        }
        else{
            age = a;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name + age);
    }
    public void eat(){
        System.out.println("要吃饭");
    }
}
