public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.HelloWorldFromPublic();
        helloWorld.callHelloInPrivate();
        System.out.println("Toplam"  + helloWorld.sum(3,5));
    }
}