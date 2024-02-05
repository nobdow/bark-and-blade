package Base_Elements;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    Clip clip;
    URL soundURL[] = new URL[7];

    public Sound() {

        soundURL[0] = getClass().getResource("/audio/title music.wav");
        soundURL[1] = getClass().getResource("/audio/new_quest.wav");
        soundURL[2] = getClass().getResource("/audio/game over.wav");
        soundURL[3] = getClass().getResource("/audio/feeling woozy.wav");
        soundURL[4] = getClass().getResource("/audio/obtain.wav");
        soundURL[5] = getClass().getResource("/audio/click.wav");
        soundURL[6] = getClass().getResource("/audio/coin.wav");
    }

    public void setFile(int i){

        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch(Exception e) {
        }
    }

    public void play(){

        clip.start();
    }

    public void loop(){

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){

        clip.stop();
    }
}
