package view.cli.viewmainmenupage;

import controller.Bank;
import entity.TarikTunai;
import model.Modelling;
import utils.Keuangan;
import view.cli.viewconfirmation.CliVerifikasiPin;

import java.util.Scanner;

public class CliTarikTunaiPage {

    Scanner input = new Scanner(System.in);

    public CliTarikTunaiPage(){
        tarikTunai();
    }

    private void tarikTunai(){
        System.out.println("------------ TARIK SALDO -----------");
        if (new CliVerifikasiPin().pinVerif()){
            System.out.println("""
                    Masukan Nominal Entity.Saldo:
                    1. Rp. 50.000
                    2. Rp. 100.000
                    3. Rp. 200.000
                    4. Rp. 500.000
                    5. Rp. 1.000.000
                    6. Rp. 2.000.000
                    0. Batal""");
            System.out.print("Pilih: ");
            int pilihNominal = input.nextInt();
            input.nextLine();
            int nominal = 0;
            switch (pilihNominal){
                case 1:
                    nominal = 50000;
                    break;
                case 2:
                    nominal = 100000;
                    break;
                case 3:
                    nominal = 200000;
                    break;
                case 4:
                    nominal = 500000;
                    break;
                case 5:
                    nominal = 1000000;
                    break;
                case 6:
                    nominal = 2000000;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid !");
                    break;
            }
            if (pilihNominal != 0){
                boolean status = Bank.tarikTunai(Modelling.getuserMasuk(), new TarikTunai(nominal));
                if (status){
                    System.out.println("Berhasil Tarik Tunai sebesar Rp."+Keuangan.format(nominal));
                }
                else{
                    System.out.println("Saldo Rekening Anda Tidak Mencukupi!");
                }
            }
        }
        System.out.println("---------------------------------------");
    }
}