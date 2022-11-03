public class OperasiArray {
    int[] arrayAngka;

    public OperasiArray(int[] arrayAngka){
        this.arrayAngka = arrayAngka;
    }
    public int totalAngka(){
        int total = 0;
        for(int baris = 0; baris < arrayAngka.length; baris++){
            total = total + arrayAngka[baris];
        }
        return total;
    }

    public double rerataAngka(){
        return totalAngka()/ arrayAngka.length;
    }
}

class MainArray {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 0, 7, 4, 6, 7};

        OperasiArray oArray;
        oArray = new OperasiArray(array);

        System.out.println(oArray.totalAngka());
        System.out.println(oArray.rerataAngka());
    }
}