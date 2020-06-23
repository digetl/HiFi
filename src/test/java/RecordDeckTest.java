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
    public void hasModel(){
        assertEquals("Samsung", recordDeck.getMake());
    }

}
