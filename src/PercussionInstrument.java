public class PercussionInstrument extends Instrument {

    static {
        System.out.println("Initializing PercussionInstrument class ");
    }

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }


    public String play() {
        return "A percussion instrument is playing";
    }

    public String toString(){
        return super.getName() + " drums cost " + super.getPrice() + " €\n";
    }
}

