public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringedInstrument bass = new StringedInstrument("Fender Bass" , 1500);
        System.out.println(bass.play());
        System.out.println(bass.toString());

        WindInstrument flute = new WindInstrument("Yamaha" , 20);
        System.out.println(flute.play());
        System.out.println(flute.toString());

        PercussionInstrument drums = new PercussionInstrument("Beringer" , 3000);
        System.out.println(drums.play());
        System.out.println(drums.toString());
    }

}