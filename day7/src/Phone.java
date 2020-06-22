public class Phone {
    int price;
    String brand;
    String color;

    public void call(String name){
        System.out.println("跟"+name+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
