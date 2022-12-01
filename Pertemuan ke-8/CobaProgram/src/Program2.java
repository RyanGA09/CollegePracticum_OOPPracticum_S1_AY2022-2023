public class Program2 {
    private int data = 40;

    private void helloWorld(){
        System.out.println("private: hello world");
    }

    public void helloData(){
        helloWorld();
        System.out.println("private: data = "+data);
    }
}
