import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    private Mp3Player mp3Player;
    private HiFi hiFi;
    private Radio radio1;
    private RecordDeck recordDeck1;
    private int volume1;

    @Before
    public void before() {

        radio1 = new Radio("Sony", "RADMAN2000");
        recordDeck1 = new RecordDeck("Samsung", "XFA432164");
        hiFi = new HiFi(radio1, recordDeck1, 10, "Denon", "3125x");
        volume1 = 9;


        mp3Player = new Mp3Player();
    }

    @Test
    public void canConnectToHiFi() {
        mp3Player.connectToHiFi(hiFi);
        assertEquals("Denon", mp3Player.connectToHiFi(hiFi));
    }
}

