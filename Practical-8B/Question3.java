import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Question3 extends Application {
    Timeline anim;
    int imageIndex = 0;
    MediaPlayer mediaPlayer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();

        ImageView imageView = new ImageView();
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(100);

        GridPane form = new GridPane();
        VBox.setMargin(form, new Insets(0, 0, 0, 20));
        form.setVgap(10);

        form.addRow(0, imageView);

        Text label1 = new Text("Enter information for animation");
        form.addRow(1, label1);

        Text labelSpeed = new Text("Animation speed (ms)");
        TextField fieldSpeed = new TextField();
        form.addRow(2, labelSpeed, fieldSpeed);

        Text labelPrefix = new Text("Image file prefix");
        TextField fieldPrefix = new TextField();
        form.addRow(3, labelPrefix, fieldPrefix);

        Text labelNumber = new Text("Number of images");
        TextField fieldNumber = new TextField();
        form.addRow(4, labelNumber, fieldNumber);

        Text labelURL = new Text("Audio file URL");
        TextField fieldURL = new TextField();
        form.addRow(5, labelURL, fieldURL);

        Button btnStart = new Button("Start Animation");
        btnStart.setOnAction(e -> {
            if(anim != null) {
                anim.stop();
            }

            if(mediaPlayer != null) {
                mediaPlayer.stop();
            }

            anim = new Timeline(new KeyFrame(new Duration(Integer.parseInt(fieldSpeed.getText())), ee -> {
                try {
                    imageView.setImage(new Image("./images/" + fieldPrefix.getText() + (imageIndex + 1) + ".png"));
                } catch(Exception x) {
                    System.out.println("Exception while setting image");
                }
                imageIndex = (imageIndex + 1) % Integer.parseInt(fieldNumber.getText());
            }));

            Media audio = new Media(fieldURL.getText());
            mediaPlayer = new MediaPlayer(audio);
            mediaPlayer.play();

            anim.setCycleCount(Timeline.INDEFINITE);
            anim.play();
        });
        form.addRow(6, btnStart);

        vbox.getChildren().add(form);

        Scene scene = new Scene(vbox, 800, 350);
        primaryStage.setTitle("Question 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}