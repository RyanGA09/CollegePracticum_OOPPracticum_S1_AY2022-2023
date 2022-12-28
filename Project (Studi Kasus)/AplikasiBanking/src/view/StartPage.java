//package view;
//
//import view.cli.CliHomePage;
//import view.frame.GuiHomePage;
//
//import java.util.Scanner;
//
//public class StartPage{
//
//    Scanner input = new Scanner(System.in);
//
//    int pilih;
//
//    public StartPage(){
//        programStart();
//        systemStart();
//    }
//
//    private void programStart(){
//        System.out.println("Selamat Datang");
//    }
//
//    private void systemStart(){
//        do {
//            System.out.println("""
//                1. Program CLI
//                2. Program GUI""");
//            System.out.print("Pilih: ");
//            pilih = input.nextInt();
//            menuSwitch(pilih);
//        } while(pilih != 0);
//
//    }
//
//    private void menuSwitch(int pilih){
//        switch (pilih){
//            case 1:
//                System.out.println("Program CLI");
//                new CliHomePage();
//                break;
//            case 2:
//                System.out.println("Program GUI");
//                new GuiHomePage();
//                break;
//            case 0:
//                System.out.println("=========================");
//                System.out.println("-----Keluar Aplikasi-----");
//                System.out.println("Terima kasih Kunjungannya");
//                break;
//            default:
//                System.out.println("""
//                        ================================
//                        Menu tidak valid
//                        ================================""");
//                break;
//        }
//    }
//}
