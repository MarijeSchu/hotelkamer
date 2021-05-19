public class bed {
    private double Lengte;
    private double Breedte;
    private int Kussen;
    private int Dekens;

    public bed(double lengte, double breedte, int kussen, int dekens) {
        Lengte = lengte;
        Breedte = breedte;
        Kussen = kussen;
        Dekens = dekens;
    }

    public double getLengte() {
        return Lengte;
    }

    public double getBreedte() {
        return Breedte;
    }

    public int getKussen() {
        return Kussen;
    }

    public int getDekens() {
        return Dekens;
    }
}
