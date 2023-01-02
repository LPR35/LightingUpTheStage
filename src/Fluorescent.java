public class Fluorescent extends Light {

    public Fluorescent(int lumens) {
        super(lumens);
    }

    @Override
    public double heatOutput() {
        return 0;
    }

    @Override
    public boolean isFluorescent() {
        return true;
    }
}
