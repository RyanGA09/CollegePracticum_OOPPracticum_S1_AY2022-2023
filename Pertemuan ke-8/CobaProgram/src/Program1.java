public class Program1 {
    protected int data = 10;

    protected void helloWorld(){
        System.out.println("Protect: Hello World");
    }

    public void helloData(){
        helloWorld();
        System.out.println("protec: data = "+data);
    }
}
