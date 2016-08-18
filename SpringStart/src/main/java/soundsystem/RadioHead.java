package soundsystem;

public class RadioHead implements CompactDisc {

	private String title = "RadioHead's new song";
	private String artist = "Engish Rock Band";
	
	
	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+artist);

	}

}
