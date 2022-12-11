package View.ViewMainPage;

import Controller.Bank;
import Entity.Transfer;
import Utils.Uang;
import Entity.User;
import Model.Authentication;

import java.util.Scanner;

public class TransferPage {

    Scanner input = new Scanner(System.in);

    public TransferPage(){
        transfer();
    }

    private void transfer() {
        System.out.println("--------------- TRANSFER --------------");

        System.out.print("Masukan No Rekening Tujuan: ");
        String noRekeningTujuan = input.nextLine();

        User userTujuan = Authentication.cariRekening(noRekeningTujuan);

        if (userTujuan != null) {
            if (userTujuan.getIdUser() != Authentication.getUserLogged().getIdUser()) {
                System.out.print("Masukan Nominal Entity.Transfer  : ");
                int nominal = input.nextInt();
                input.nextLine();

                if (nominal < Authentication.getUserLogged().getRekening().getSaldo()) {
                    System.out.println("---------------------------------------");
                    System.out.println("Transfer Ke");
                    System.out.println("No Rekening : " + userTujuan.getRekening().getNoRekening());
                    System.out.println("Atas Nama   : " + userTujuan.getFullname());
                    System.out.println("Nominal Sebesar");
                    System.out.println("Rp. " + Uang.format(nominal));
                    System.out.println("---------------------------------------");
                    System.out.print("Transfer (y/n) : ");
                    char konf = input.nextLine().charAt(0);

                    if (konf == 'y') {
                        if (Bank.verifPin()) {
                            boolean status = Bank.transfer(new Transfer(nominal, Authentication.getUserLogged(), userTujuan));

                            if (status) {
                                System.out.println("Berhasil ");
                            }
                        } else {
                            System.out.println("Coba Lagi !");
                        }
                    } else {
                        System.out.println("Dibatalkan !");
                    }
                } else {
                    System.out.println("Entity.Saldo Tidak Cukup !");
                }

            } else {
                System.out.println("Tidak dapat Entity.Transfer ke Entity.Rekening Sendiri !");
            }

        } else {
            System.out.println("No Entity.Rekening tidak Ditemukan !");
        }

        System.out.println("---------------------------------------");
    }
}