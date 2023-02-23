import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.Bindings;
import java.io.File;
import java.net.URL;

public class MediaViewController
{
   @FXML
   private AnchorPane anchorPane;
   
   @FXML
   private Pane pane;

   @FXML
   private MediaView mediaView;
   
   @FXML
   private Media media;
   
   @FXML
   private MediaPlayer mediaPlayer;
   
   @FXML
   private File file;
    
   @FXML
   private Label volumeLabel;
    
   @FXML
   private Slider volumeSlider;
    
   private int volume;
    
   @FXML
   private Button pauseButton;

   @FXML
   private Button playButton;

   @FXML
   private Button resetButton;
   
   @FXML
   private Button muteButton;

   @FXML
   void handlePauseButton(ActionEvent event) 
   {
      pauseMedia();
   }

   @FXML
    void handlePlayButton(ActionEvent event) 
   {
      playMedia();
   }

   @FXML
    void handleResetButton(ActionEvent event) 
   {
      resetMedia();
   }
   
   @FXML
    void handleMuteButton(ActionEvent event) 
   {
      mute();
   }
    
   public void initialize()
   {
      volume = (int) volumeSlider.getValue();
      volumeLabel.setText(Integer.toString(volume));
            
      volumeSlider.valueProperty().addListener
         (new ChangeListener<Number>()
         {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) 
            {
            
               volume = (int) volumeSlider.getValue();
               volumeLabel.setText(Integer.toString(volume));
                           
               mediaPlayer.setVolume( (double)volume / 100);
            }
         });
      
      mediaView.fitWidthProperty().bind(pane.widthProperty()); 
      mediaView.fitHeightProperty().bind(pane.heightProperty());
      
      file = new File("pokemon.mp4");
      media = new Media(file.toURI().toString());
      mediaPlayer = new MediaPlayer(media);
      mediaView.setMediaPlayer(mediaPlayer);
   }
    
   public void playMedia()
   {
      mediaPlayer.play();
   }
    
   public void pauseMedia()
   {
      mediaPlayer.pause();
   }
    
   public void resetMedia()
   {
      if(mediaPlayer.getStatus() != MediaPlayer.Status.READY)
         mediaPlayer.seek(Duration.seconds(0.0));
   }
   
   public void mute()
   {  
      if(!mediaPlayer.isMute())
         mediaPlayer.setMute(true);
      else
         mediaPlayer.setMute(false);
   }
}
