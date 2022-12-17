package View.ViewMainPage;

import Controller.Bank;
import Entity.Transfer;
import Entity.User;
import Controller.Authentication;
import Model.Modelling;
import Utils.Keuangan;

import java.util.Scanner;

public class TransferPage{

    Scanner input = new Scanner(System.in);

    public TransferPage(){
        transfer();
    }

    private void transfer() {
        System.out.println("------------- TRANSFER ------------");
        System.out.print("Masukan No Rekening Tujuan: ");
        String noRekeningTujuan = input.nextLine();
        User userTujuan = Authentication.cariRekening(noRekeningTujuan);
        if (userTujuan != null){
//            if (userTujuan.getUsername() != Modelling.getuserMasuk().getUsername()){
              if(!userTujuan.getUsername().equals(Modelling.getuserMasuk().getUsername())){
                System.out.print("Masukan Nominal Transfer  : ");
                int nominal = input.nextInt();
                input.nextLine();
                if (nominal < Modelling.getuserMasuk().getRekening().getSaldo()){
                    System.out.println("---------------------------------------");
                    System.out.println("Transfer Ke");
                    System.out.println("No Rekening : " + userTujuan.getRekening().getNoRekening());
                    System.out.println("Atas Nama   : " + userTujuan.getFullname());
                    System.out.println("Nominal Sebesar");
                    System.out.println("Rp. " + Keuangan.format(nominal));
                    System.out.println("---------------------------------------");
                    System.out.print("Transfer (Y/y atau N/n) : ");
                    char konfirmasi = input.nextLine().charAt(0);
                    if (konfirmasi == 'Y' || konfirmasi == 'y'){
                        if (Bank.verifikasiPin()){
                            boolean status = Bank.transfer(new Transfer(nominal, Modelling.getuserMasuk(), userTujuan));
                            if (status){
                                System.out.println("Berhasil ");
                            }
                        }
                        else{
                            System.out.println("Coba Lagi !");
                        }
                    }
                    else{
                        System.out.println("Dibatalkan !");
                    }
                }
                else{
                    System.out.println("Saldo Tidak Cukup !");
                }

            }
            else{
                System.out.println("Tidak dapat Transfer ke Rekening Sendiri !");
            }
        }
        else{
            System.out.println("No Rekening tidak Ditemukan !");
        }
        System.out.println("---------------------------------------");
    }
}