public class Transfer {
    int nominal;
    User userAsal, userTujuan;

    public Transfer(int nominal, User userAsal, User userTujuan){
        this.nominal = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }
}