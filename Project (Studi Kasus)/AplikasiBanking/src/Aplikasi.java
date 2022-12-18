import model.Modelling;
import view.HomePage;

public class Aplikasi{
    public static void main(String[] args){
        Modelling.initialUser();
        new HomePage();
    }
}