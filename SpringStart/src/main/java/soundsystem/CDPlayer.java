package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	private CompactDisc cd2;

	@Autowired(required=false)
	public CDPlayer(WestLifeAlbum cd,RadioHead cd2) {
		this.cd = cd;
		this.cd2 = cd2;
	}

	public void play() {
		if(cd==null)System.out.println("no cd!");
		cd.play();
		cd2.play();
	}
}