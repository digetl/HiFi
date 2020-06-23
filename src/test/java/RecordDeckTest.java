import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

 RecordDeck recordDeck;

 @Before
    public void before(){
     recordDeck = new RecordDeck("Samsung", "XFA432164");
 }

    @Test
    public void hasMake(){
     assertEquals("Samsung", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("XFA432164", recordDeck.getModel());
    }

    @Test
    public void canPlay() {
        recordDeck.play();
        assertEquals("Playing", recordDeck.play());
    }

    @Test
    public void canPause() {
        recordDeck.pause();
        assertEquals("Paused", recordDeck.pause());
    }

    @Test
    public void canStop() {
        recordDeck.stop();
        assertEquals("Stopped", recordDeck.stop());
    }
}
