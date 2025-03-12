public class WindInstrument extends Instrument {

    static {
        System.out.println("Initializing WindInstrument class");
    }

    public WindInstrument(String name , int price) {
        super(name , price);
    }

    public String play() {
        return "A wind instrument is playing";
    }

    public String toString(){
        return super.getName() + " flute cost " + super.getPrice() + " €\n";
    }

}