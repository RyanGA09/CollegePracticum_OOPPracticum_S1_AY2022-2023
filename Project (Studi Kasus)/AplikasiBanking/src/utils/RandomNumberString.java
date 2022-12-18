package utils;

public class RandomNumberString {
    public static String getNumeric(int nilai){
        String numericString = "0123456789";
        StringBuilder sb = new StringBuilder(nilai);
        for (int baris = 0; baris < nilai; baris++){
            int indeks = (int) (numericString.length() * Math.random());
            sb.append(numericString.charAt(indeks));
        }
        return sb.toString();
    }
}