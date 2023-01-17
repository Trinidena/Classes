import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;

public class PaintController {

    private Color currentColor;
    private GraphicsContext graphicsContext;
    
    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    void handleColorPicker(ActionEvent event) {
        currentColor = colorPicker.getValue();
        //System.out.println(currentColor);  
    }
    
    @FXML
    void handleMouseDragged(MouseEvent event) {
        //System.out.println("mouise dragged");
        graphicsContext.setFill(currentColor);
        graphicsContext.fillRect(event.getX(), event.getY(), 4, 4);
    }
    
    @FXML
    public void initialize()
    {
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.WHITE);
    }

}
