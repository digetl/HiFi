import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

 RecordDeck recordDeck;
 private int playSpeed1;
 private int playSpeed2;

 @Before
    public void before(){
     recordDeck = new RecordDeck("Samsung", "XFA432164");
     playSpeed1 = 45;
     playSpeed2 = 33;
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

    @Test
    public void canGetSpeed(){
     recordDeck.setPlaySpeed(playSpeed1);
     assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void canSetSpeed(){
        recordDeck.setPlaySpeed(playSpeed1);
        recordDeck.setPlaySpeed(playSpeed2);
        assertEquals(33, recordDeck.getPlaySpeed());
    }
}
