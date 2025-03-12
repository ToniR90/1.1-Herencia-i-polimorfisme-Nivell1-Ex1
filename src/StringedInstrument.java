public class StringedInstrument extends Instrument {

    static {
        System.out.println("Initializing StringedInstrument class");
    }

    public StringedInstrument(String name , int price) {
        super(name , price);
    }

    public String play() {
        return "A stringed instrument is playing";
    }

    public String toString() {
        return super.getName() + " cost " + super.getPrice() + " €\n";
    }
}
