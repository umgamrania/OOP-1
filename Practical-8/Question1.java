import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Question1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Random random = new Random();

        Text[] texts = new Text[5];
        for(int i = 0; i < 5; i++) {
            texts[i] = new Text("JavaFX");
            texts[i].setX(20 + (40 * i));
            texts[i].setY(25);

            texts[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            texts[i].setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));

            Rotate rotate = new Rotate(90, 20 + (40 * i), 25);
            texts[i].getTransforms().add(rotate);

            pane.getChildren().add(texts[i]);
        }


        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Random Text Colors & Opacity");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
