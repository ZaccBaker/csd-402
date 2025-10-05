import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Layout for GUI, VBox set to 15px
        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        
        for(int i = 1; i <= 30; i++){ // Dynamically create button widgets, content for VBox
            // layout.getChildren().add(new Button("Test Button " + i));
            Button button = new Button("Test Button " + i);
            button.setMaxWidth(Double.MAX_VALUE);
            layout.getChildren().add(button);
        }

        // ScrollPlane, VBox is layout with content
        ScrollPane scroll = new ScrollPane();
        scroll.setContent(layout);
        scroll.setFitToWidth(true); // Makes content fit width of scroll plane

        // Scene
        Scene scene = new Scene(scroll, 450, 250);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Module 11 - JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}