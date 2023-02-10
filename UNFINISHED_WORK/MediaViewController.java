import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.net.URL;

public class MediaViewController
{

    @FXML
    private MediaView mediaView;
    
    private Media media;
    
    private MediaPlayer mediaPlayer;
    
    private File file;
    
    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;

    @FXML
    private Button resetButton;

    @FXML
    void handlePauseButton(ActionEvent event) 
    {

    }

    @FXML
    void handlePlayButton(ActionEvent event) 
    {
      mediaView.setMediaPlayer(mediaPlayer);
      playMedia();
    }

    @FXML
    void handleResetButton(ActionEvent event) 
    {

    }
    
    public void initialize()
    {
      file = new File("pokemon.mp4");
      media = new Media(file.toURI().toString());
      mediaPlayer = new MediaPlayer(media);
      //mediaView = new MediaView(mediaPlayer);
      mediaView.setMediaPlayer(mediaPlayer);
    }
    
    public void playMedia()
    {
      mediaPlayer.play();
    }
    
    public void pauseMedia()
    {
      
    }
    
    public void resetMedia()
    {
      
    }
}
