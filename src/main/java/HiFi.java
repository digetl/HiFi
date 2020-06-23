public class HiFi {

    private Radio radio;
    private RecordDeck recordDeck;
    private int volume;
    private String make;
    private String model;


    public HiFi(Radio radio, RecordDeck recordDeck, int volume, String make, String model) {
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.volume = volume;
        this.make = make;
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume( int volume) {
        this.volume = volume;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }


}
