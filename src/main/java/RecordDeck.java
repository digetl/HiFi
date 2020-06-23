public class RecordDeck extends Stereo implements IPlay, IPause, IStop {
    private String make;
    private String model;
    private int speed;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.speed = speed;
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

    public void setPlaySpeed(int speed) {
        this.speed = speed;
    }

    public int getPlaySpeed() {
        return speed;
    }

}
