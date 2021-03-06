package biz.ui.features;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

@SuppressWarnings("restriction")
public abstract class DeleteButton extends Button{
	
    private final String STYLE_NORMAL = "-fx-background-color: transparent; -fx-padding: 2, 2, 2, 2;";
    
    public DeleteButton() {
    	ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/resources/delete.png")));
    	image.setFitHeight(15);
    	image.setFitWidth(15);
        setGraphic(image);
        setStyle(STYLE_NORMAL);
        
                
        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               setStyle(STYLE_NORMAL);
               executeLogic(event);
            }            
        });
    }
    
    public abstract void executeLogic(MouseEvent event);
}
