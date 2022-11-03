public class Mobil {
    String warna, merek;

    public Mobil(String pewarnaan, String merek){
        warna = pewarnaan;
        this.merek = merek;
    }

    void maju(){
        System.out.println(
                "Mobilku berwarna "+warna+" bermerek "+merek+" bergerak maju"
        );
    }

    void mundur(){
        System.out.println(
                "Mobilku berwarna "+warna+" bermerek "+merek+" bergerak mundur"
        );
    }
}
