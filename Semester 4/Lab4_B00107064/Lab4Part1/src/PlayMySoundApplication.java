import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class PlayMySoundApplication {

	public static void main(String[] args) {
		
		try {
			InputStream inputSound = new FileInputStream("musicMelody.au");
			
			AudioStream audioStream = new AudioStream(inputSound);
			
			AudioPlayer.player.start(audioStream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
