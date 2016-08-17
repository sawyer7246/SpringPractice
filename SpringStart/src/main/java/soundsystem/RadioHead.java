package soundsystem;

public class RadioHead implements CompactDisc {

	private String title = "West Life's new song";
	private String artist = "four guys";
	
	
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);

	}

}
