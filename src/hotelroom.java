
public class hotelroom {
    private seize Seize;
    private bed Bed;
    private boolean Television;

    public hotelroom(seize seize, bed bed, boolean television) {
        Seize = seize;
        Bed = bed;
        Television = television;
    }

    public seize getSeize() {
        return Seize;
    }

    public bed getBed() {
        return Bed;
    }
}

