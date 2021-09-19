package oops;

//interfaces can have default and static methods from JDK 1.8 onwards
interface Player {
	public static void start(String player) {
		System.out.println("Player Started: " + player);
	}

	default void display() {
		System.out.println("Player interface called");
	}

	public void play();

	public void pause();

	public void stop();
}

class YoutubePlayer implements Player {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("YoutubePlayer's play method called");

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("YoutubePlayer's pause method called");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("YoutubePlayer's stop method called");
	}
}

class VLCPlayer implements Player {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("VLCPlayer's play method called");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("VLCPlayer's pause method called");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("VLCPlayer's stop method called");
	}
}

public class InterfaceRealExample {

	public static void main(String[] args) {

		YoutubePlayer youtubePlayer = new YoutubePlayer();
		youtubePlayer.display();
		Player.start(youtubePlayer.getClass().getCanonicalName());
		youtubePlayer.play();
		youtubePlayer.pause();
		youtubePlayer.stop();
		System.out.println("----------------------------------------");
		VLCPlayer vlcPlayer = new VLCPlayer();
		vlcPlayer.display();
		Player.start(vlcPlayer.getClass().getCanonicalName());
		vlcPlayer.play();
		vlcPlayer.pause();
		vlcPlayer.stop();
	}

}
