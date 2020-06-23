public class Radio extends Stereo implements IPlay, IPause, IStop, ITune{

        private String make;
        private String model;

        public Radio (String make, String model) {
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

    public String tune() {
        return "Radio X";
    }
}
