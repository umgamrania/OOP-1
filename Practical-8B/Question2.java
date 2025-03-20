import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Question2 extends Application {

    private static final int width = 500;
    private static final int height = 200;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        Text movingText = new Text("Programming is fun!");
        movingText.setFont(new Font(24));
        movingText.setY(height / 2);
        
        pane.getChildren().add(movingText);

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(30), e -> {
            double newX = movingText.getX() + 2;
            if (newX > width) {
                newX = -movingText.getLayoutBounds().getWidth(); // Reset position
            }
            movingText.setX(newX);
        }));

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        pane.setOnMousePressed((MouseEvent e) -> animation.pause());

        pane.setOnMouseReleased((MouseEvent e) -> animation.play());

        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Moving Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
