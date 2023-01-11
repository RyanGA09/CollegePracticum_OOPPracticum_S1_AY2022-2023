package view.cli.viewmainmenupage;

import controller.Bank;
import entity.Transfer;
import entity.User;
import controller.Authentication;
import model.Modelling;
import utils.Keuangan;
import view.cli.viewconfirmation.CliVerifikasiPin;

import java.util.Scanner;

public class CliTransferPage {

    Scanner input = new Scanner(System.in);

    public CliTransferPage(){
        transfer();
    }

    private void transfer() {
        System.out.println("------------- TRANSFER ------------");
        System.out.print("Masukan No Rekening Tujuan: ");
        String noRekeningTujuan = input.nextLine();
        User userTujuan = new Authentication().cariRekening(noRekeningTujuan);
        if (userTujuan != null){
              if(!userTujuan.getUsername().equals(Modelling.getuserMasuk().getUsername())){
                System.out.print("Masukan Nominal Transfer  : ");
                int nominal = input.nextInt();
                input.nextLine();
                if (nominal < Modelling.getuserMasuk().getRekening().getSaldo()){
                    System.out.println("---------------------------------------");
                    System.out.println("Transfer Ke");
                    System.out.println("No Rekening : "+userTujuan.getRekening().getNoRekening());
                    System.out.println("Atas Nama   : "+userTujuan.getFullname());
                    System.out.println("Nominal Sebesar");
                    System.out.println("Rp. " +Keuangan.format(nominal));
                    System.out.println("---------------------------------------");
                    System.out.print("Transfer (Y/y atau N/n) : ");
                    char konfirmasi = input.nextLine().charAt(0);
                    if (konfirmasi == 'Y' || konfirmasi == 'y'){
                        if (new CliVerifikasiPin().pinVerif()){
                            boolean status = new Bank().transfer(new Transfer(nominal, Modelling.getuserMasuk(), userTujuan));
                            if (status){
                                System.out.println("Berhasil transfer sebesar Rp."+Keuangan.format(nominal));
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