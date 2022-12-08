public class Main {
    public static void main(String[] args) {
        Program1 shield = new Program1();
        Program2 personal = new Program2();

//        personal.helloWorld();
        personal.helloData();
        System.out.println("================================");
        shield.helloWorld();
        System.out.println("--------------------------------");
        shield.helloData();
    }
}