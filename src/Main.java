public class Main {

    public static void main (String[] args){
        bed hiltonBed = new bed(2.5,2.1,4,2);
        seize hiltonSeize= new seize(6,5,3);

        hotelroom hiltonRoom = new hotelroom(hiltonSeize,hiltonBed,true, "Zee");

        System.out.println(hiltonRoom.getBed().getKussen());

    }
}