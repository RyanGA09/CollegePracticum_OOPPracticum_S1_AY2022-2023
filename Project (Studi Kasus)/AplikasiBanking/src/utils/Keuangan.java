package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Keuangan{
    public static String format(int nilaiNominal) {
        DecimalFormat keuangan = new DecimalFormat();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setGroupingSeparator('.');
        keuangan.setDecimalFormatSymbols(formatRp);
        return keuangan.format(nilaiNominal);
    }
}