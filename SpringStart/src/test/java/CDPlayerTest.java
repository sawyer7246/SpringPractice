import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.CDplayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;

	@Autowired
	private MediaPlayer player;
	// @Rule
	// public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
	}

}
