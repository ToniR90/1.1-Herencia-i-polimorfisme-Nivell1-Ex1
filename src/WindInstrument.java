public class WindInstrument extends Instrument {

    static {
        System.out.println("Initializing WindInstrument class");
    }

    public WindInstrument(String name , int price) {
        super(name , price);
    }

    public String play() {

        return "Playing a wind instrument";
    }

    //mètodes propis
    public String toString() {

        return super.getName() + " instrument's price is " + super.getPrice() + " €";
    }

}