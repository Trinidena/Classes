import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.FileChooser;
import javafx.stage.*;
import javafx.scene.*;
import java.io.*;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class PaintController {

   //private Color currentColor;
   private GraphicsContext graphicsContext;
   
   private PaintModel model;
   
   @FXML
   private Canvas canvas;

   @FXML
   private Button clear;

   @FXML
   private ColorPicker colorPicker;

   @FXML
   private Button load;

   @FXML
   private Button save;

   @FXML
   void handleClear(ActionEvent event) 
   {
      model.clearRectangles();
      graphicsContext.clearRect(0 , 0 , canvas.getWidth() , canvas.getHeight());
   }

   @FXML
   void handleColorPicker(ActionEvent event) 
   {
      model.setColor(colorPicker.getValue().toString());
   }

   @FXML
   void handleLoad(ActionEvent event) throws IOException
   {
      FileChooser fc = new FileChooser();
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      File selectedFile = fc.showOpenDialog(stage);
      BufferedImage img = ImageIO.read(selectedFile);
      int width = img.getWidth();
      int height = img.getHeight();
      
      Image image = new Image(selectedFile.toURI().toString());
      // used to drawing sun flower image
      graphicsContext.drawImage(image, 0, 0, (canvas.getWidth()), (canvas.getHeight()));

   }

   @FXML
   void handleMouseDragged(MouseEvent event) 
   {
      graphicsContext.setFill(Color.valueOf(model.getColor()));
      graphicsContext.fillRect(event.getX(), event.getY(), 4, 4);
      model.add(new Rectangle(event.getX() , event.getY() , model.getColor()));
   }

   @FXML
   void handleSave(ActionEvent event) throws IOException
   {
      FileChooser fc = new FileChooser();
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      File selectedFile = fc.showSaveDialog(stage);
      FileOutputStream fos = new FileOutputStream(selectedFile);
      BufferedImage img = ImageIO.read(selectedFile);
   }
   
   @FXML
   public void initialize()
   {
      model = new PaintModel(Color.WHITE.toString());
      graphicsContext = canvas.getGraphicsContext2D();
      graphicsContext.setFill(Color.WHITE);
   }

}
