import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
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
import java.awt.image.RenderedImage;
import javafx.embed.swing.SwingFXUtils;

public class PaintController{

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
   private TextField brushSizeTF;

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

      graphicsContext.drawImage(image, 0, 0, (canvas.getWidth()), (canvas.getHeight()));

   }

   @FXML
   void handleMouseDragged(MouseEvent event) 
   {
      double size = Double.parseDouble(brushSizeTF.getText());
      double x = event.getX() - size / 2;
      double y = event.getY() - size / 2;
      graphicsContext.setFill(Color.valueOf(model.getColor()));
      graphicsContext.fillRect(x, y, size, size);
      model.add(new Rectangle(x, y, model.getColor()));
   }

   @FXML
   void handleSave(ActionEvent event) throws IOException
   {
      FileChooser savefile = new FileChooser();
      savefile.setTitle("Save File");
      Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      
            File file = savefile.showSaveDialog(stage);
            System.out.println("is file null ? "+ file);
            if (file != null) {
                try {
                    WritableImage writableImage = new WritableImage((int)canvas.getWidth(), (int)canvas.getHeight());
                    canvas.snapshot(null, writableImage);
                    RenderedImage renderedImage = SwingFXUtils.fromFXImage(writableImage, null);
                    ImageIO.write(renderedImage, "png", file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error!");
                }
            }
   }
   
   @FXML
   public void initialize()
   {
      model = new PaintModel(Color.WHITE.toString());
      graphicsContext = canvas.getGraphicsContext2D();
      graphicsContext.setFill(Color.WHITE);
   }

}
