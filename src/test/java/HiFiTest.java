import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HiFiTest {

    private HiFi hiFi;
    private Radio radio1;
    private RecordDeck recordDeck1;
    private int volume1;

    @Before
    public void before(){
        radio1 = new Radio("Sony", "RADMAN2000");
        recordDeck1 = new RecordDeck("Samsung", "XFA432164");
        hiFi = new HiFi(radio1, recordDeck1, 10, "Denon", "3125x");
        volume1 = 9;
    }

    @Test
    public void hasMake(){
        assertEquals("Denon", hiFi.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("3125x", hiFi.getModel() );
    }
    
    @Test
    public void canGetVolume() {
        hiFi.setVolume(volume1);
        assertEquals(9, hiFi.getVolume());
    }

    @Test 
    public void canSetVolume(){
        hiFi.setVolume(10);
        hiFi.setVolume(12);
        assertEquals(12, hiFi.getVolume());
    }
}
