public class RecordDeck extends Stereo implements IPlay, IPause, IStop {
    private String make;
    private String model;

    public RecordDeck(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "Playing";
    }

    public String pause() {
        return "Paused";
    }

    public String stop() {
        return "Stopped";
    }

}
