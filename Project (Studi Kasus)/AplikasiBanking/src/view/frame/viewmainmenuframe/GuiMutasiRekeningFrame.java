package view.frame.viewmainmenuframe;

import entity.*;
import entity.abstraction.Transaksi;
import model.Modelling;
import utils.Keuangan;
import view.frame.GuiMainMenuFrame;
import view.frame.GuiMainUnitFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class GuiMutasiRekeningFrame extends GuiMainUnitFrame {


    private JButton backButton;

    public GuiMutasiRekeningFrame(){
        super("MUTASI");
        setSize(750, 700);
    }

    @Override
    protected void component() {
        JLabel titleLabel = new JLabel("MUTASI TRANSAKSI");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 240, 35, 246, 100);

        ImageIcon mutasi = loadImage("src/Assets/Mutasi.jpg", 65, 65);
        JLabel iconMutasi = new JLabel(mutasi);
        boundedAdd(iconMutasi, 150, 45, 65, 65);

        ImageIcon image = loadImage("src/Assets/Logo.png", 65, 65);
        JLabel icon = new JLabel(image);
        boundedAdd(icon, 530, 45, 65, 65);
        /*=======================================================*/
        JTable mutasiTable = new JTable();
        TableModel tableModel = createMutasiTable();
        mutasiTable.setModel(tableModel);

        JScrollPane scrollPane = new JScrollPane(mutasiTable);
        boundedAdd(scrollPane, 31, 136, 450, 450);
        /*=======================================================*/
        backButton = new JButton("BACK");
        boundedAdd(backButton, 465, 600, 50, 30);
        /*=======================================================*/

    }

    @Override
    protected void event() {
        createMutasiTable();

        backButton.addActionListener((e) -> {
            new GuiMainMenuFrame().setVisible(true);
            dispose();
        });
    }

    private TableModel createMutasiTable (){
        DefaultTableModel dataTable = new DefaultTableModel();
        Object[] column;
        column = new Object[]{
                "Transaksi",
                "Tanggal Transaksi",
                "Nominal",
                "RekAsal",
                "AsalNama",
                "RekTujuan",
                "TujuanNama"
        };
        dataTable.setColumnIdentifiers(column);

        User userMasuk = Modelling.getuserMasuk();
        ArrayList<Transaksi> mutasi = userMasuk.getRekening().getMutasi();
        for (Transaksi transaksi: mutasi){
            if(transaksi instanceof SetorTunai){
                SetorTunai setor = (SetorTunai) transaksi;
                Object[] dataTransaksi = new String[]{
                        "Setor Tunai",
                        transaksi.getTanggalTransaksi(),
                        Keuangan.format(transaksi.getNilaiNominal()),
                        setor.getUserAsal().getRekening().getNoRekening(),
                        setor.getUserAsal().getRekening().getNoRekening(),
                        setor.getUserTujuan().getRekening().getNoRekening(),
                        setor.getUserTujuan().getFullname()

                };
                dataTable.addRow(dataTransaksi);
            } else if (transaksi instanceof TarikTunai) {
                TarikTunai tarik = (TarikTunai) transaksi;
                Object[] dataTransaksi = new String[]{
                        "Tarik Tunai",
                        transaksi.getTanggalTransaksi(),
                        Keuangan.format(transaksi.getNilaiNominal()),
                        tarik.getUserAsal().getRekening().getNoRekening(),
                        tarik.getUserAsal().getFullname(),
                        tarik.getUserTujuan().getRekening().getNoRekening(),
                        tarik.getUserTujuan().getFullname()

                };
                dataTable.addRow(dataTransaksi);
            } else if (transaksi instanceof Transfer) {
                Transfer transfer = (Transfer) transaksi;
                Object[] dataTransaksi = new String[]{
                        "Transfer",
                        transaksi.getTanggalTransaksi(),
                        Keuangan.format(transaksi.getNilaiNominal()),
                        transfer.getUserAsal().getRekening().getNoRekening(),
                        transfer.getUserAsal().getFullname(),
                        transfer.getUserTujuan().getRekening().getNoRekening(),
                        transfer.getUserTujuan().getFullname()
                };
                dataTable.addRow(dataTransaksi);
            }
        }
        return dataTable;
    }
}
