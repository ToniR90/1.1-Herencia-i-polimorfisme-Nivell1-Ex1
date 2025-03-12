public abstract class Instrument {

    static {
        System.out.println("Initializing Instrument class");
    }

    private String name;
    private int price;


    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

    abstract public String play();

    abstract public String toString();

}


