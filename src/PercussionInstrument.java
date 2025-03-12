public class PercussionInstrument extends Instrument {

    static {
        System.out.println("Initializing PercussionInstrument class ");
    }

    public PercussionInstrument(String name , int price) {
        super(name , price);
    }


    //mètodes generals
    public String play() {
        return "Playing a percussion instrument";
    }

    //mètodes propis
    public String toString() {
        return super.getName() + " instrument's price is " + super.getPrice() + " €";
    }

}
