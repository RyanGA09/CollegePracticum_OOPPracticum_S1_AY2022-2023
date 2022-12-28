public class BangunDatar implements Formula {

    @Override
    public double luas(double sisi) {
        return sisi * sisi;
    }
    @Override
    public double keliling(double sisi) {
        return 4 * sisi;
    }

    @Override
    public double volume(double sisi) {
        return 0;
    }
}
