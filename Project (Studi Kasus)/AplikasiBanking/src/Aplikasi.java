import model.Modelling;
import view.cli.CliHomePage;
//import view.StartPage;

public class Aplikasi{
    public static void main(String[] args){
        Modelling.initialUser();
        new CliHomePage();
//        new StartPage();
    }
}