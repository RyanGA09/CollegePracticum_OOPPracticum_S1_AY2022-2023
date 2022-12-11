package View.ViewMainPage;

import Entity.*;
import Model.Authentication;
import Utils.Uang;

import java.util.ArrayList;

public class MutasiRekeningPage {

    public MutasiRekeningPage(){
        mutasiRekening();
    }

    private void mutasiRekening() {
        System.out.println("----------- MUTASI  REKENING ----------");

        User userLogged = Authentication.getUserLogged();

        ArrayList<Transaksi> mutasi = userLogged.getRekening().getMutasi();

        for (Transaksi transaksi : mutasi) {

            if (transaksi instanceof SetorTunai) {
                System.out.println("Transaksi           : Setor Tunai");
                System.out.println("Tanggal Setor Tunai : " + transaksi.getTanggalTransaksi());
                System.out.println("Nominal Setor Tunai : Rp. " + Uang.format(transaksi.getNilaiNominal()));
            } else if (transaksi instanceof TarikTunai) {
                System.out.println("Transaksi           : Tarik Tunai");
                System.out.println("Tanggal Tarik Tunai : " + transaksi.getTanggalTransaksi());
                System.out.println("Nominal Tarik Tunai : Rp. " + Uang.format(transaksi.getNilaiNominal()));
            } else if (transaksi instanceof Transfer) {
                Transfer transfer = (Transfer) transaksi;
                System.out.println("Transaksi           : Transfer");
                System.out.println("Tanggal Transfer    : " + transaksi.getTanggalTransaksi());
                System.out.println("Rekening Asal       : " + transfer.getUserAsal().getRekening().getNoRekening());
                System.out.println("Asal Atas Nama      : " + transfer.getUserAsal().getFullname());
                System.out.println("Rekening Tujuan     : " + transfer.getUserTujuan().getRekening().getNoRekening());
                System.out.println("Tujuan Atas Nama    : " + transfer.getUserTujuan().getFullname());
                System.out.println("Nominal Transfer    : Rp." + Uang.format(transaksi.getNilaiNominal()));

            }
            System.out.println("---------------------------------------");
        }
        System.out.println("---------------------------------------");
    }
}