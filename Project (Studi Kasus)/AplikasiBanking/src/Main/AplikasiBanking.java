package Main;
import Model.Authentication;
import View.HomePage;

public class AplikasiBanking {
    public static void main(String[] args) {
        Authentication.initialUser();
        new HomePage();
    }
}