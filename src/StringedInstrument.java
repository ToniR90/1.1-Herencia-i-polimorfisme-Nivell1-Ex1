public class StringedInstrument extends Instrument {

    static {
        System.out.println("Initializing StringedInstrument class");
    }

    public StringedInstrument(String name , int price) {
        super(name , price);
    }

    public String play() {
        return "Playing a stringed instrument";
    }

    public String toString() {
        return super.getName() + " instrument's price is " + super.getPrice() + " €";
    }
}
