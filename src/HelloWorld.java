public class HelloWorld {
    public int sum(int a, int b){
        return a + b;
    }

    public void HelloWorldFromPublic()
    {
        System.out.println("Hello World from Public");
    }

    private void HelloWorldFromPrivate()
    {
        System.out.println("Hello World from Private");
    }

    public void callHelloInPrivate()
    {
        this.HelloWorldFromPrivate();
    }
}
