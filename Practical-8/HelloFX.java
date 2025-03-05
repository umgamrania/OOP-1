import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10); // Vertical layout with spacing of 10 pixels

        String[] messages = {"JavaFX", "Random Colors", "Text Styling", "Opacity Test", "Hello World"};
        Random random = new Random();

        for (String msg : messages) {
            Text text = new Text(msg);
            
            // Set font to Times New Roman, Bold, Italic, 22px
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            
            // Set random color
            text.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));

            // Set random opacity (between 0.5 and 1.0 for better visibility)
            text.setOpacity(0.5 + random.nextDouble() * 0.5);

            text.setRotate(90);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Random Text Colors & Opacity");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
