package abstraction;

public class BangunRuang implements Formula {

    @Override
    public double luas(double sisi) {
        return 6 * sisi * sisi;
    }

    @Override
    public double keliling(double sisi) {
        return 12 * sisi;
    }

    public double volume(double sisi) {
        return sisi * sisi * sisi;
    }
}
