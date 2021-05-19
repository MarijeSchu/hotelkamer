public class seize {
    private double Breedte;
    private double Lengte;
    private double Hoogte;

    public seize(double Breedte, double Lengte, double Hoogte) {
        this.Breedte = Breedte;
        this.Lengte = Lengte;
        this.Hoogte = Hoogte;
    }

    public double getBreedte() {
        return Breedte;
    }

    public double getLengte() {
        return Lengte;
    }

    public double getHoogte() {
        return Hoogte;
    }

    public double getOppervlak() {
        double oppervlak = (this.Breedte * this.Lengte);
        return oppervlak;
    }

    public double getInhoud() {
        double inhoud = getOppervlak() * this.Hoogte;
        return inhoud;

    }
}
