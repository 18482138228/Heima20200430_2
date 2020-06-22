public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println("-----------");

        p.brand = "Iphone";
        p.color = "Black";
        p.price = 5799;
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println("-----------");
        System.out.println("-----------");

        p.call("Trump");
        p.sendMessage();
    }
}
