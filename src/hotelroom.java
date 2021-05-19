
public class hotelroom {
    private seize Seize;
    private bed Bed;
    private boolean Television;
    private String View;

    public hotelroom(seize seize, bed bed, boolean television, String view) {
        Seize = seize;
        Bed = bed;
        Television = television;
        View = view;
        
    }

    public seize getSeize() {
        return Seize;
    }

    public bed getBed() {
        return Bed;
    }
    
}

