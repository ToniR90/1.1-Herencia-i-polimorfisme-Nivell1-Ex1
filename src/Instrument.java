public abstract class Instrument {

    static {
        System.out.println("Initializing Instrument class");
    }

    private String name;
    private int price;


    public Instrument(String name , int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    abstract public String play();


    public String toString() {
        return "There's an instrument";
    }
}