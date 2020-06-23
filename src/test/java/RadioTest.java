import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "RADMAN2000");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("RADMAN2000", radio.getModel());
    }

    @Test
    public void canPlay() {
        radio.play();
        assertEquals("Playing", radio.play());
    }

    @Test
    public void canPause() {
        radio.pause();
        assertEquals("Paused", radio.pause());
    }

    @Test
    public void canStop() {
        radio.stop();
        assertEquals("Stopped", radio.stop());
    }

    @Test
    public void canTune() {
        radio.tune();
        assertEquals("Radio X", radio.tune());
    }
}
