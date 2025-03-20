import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Question2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Rectangle project = new Rectangle();
        project.setWidth(100);
        project.setHeight(70);
        project.setFill(Color.color(1, 0, 0));
        project.setX(20);
        project.setY(180 - 70);
        pane.getChildren().add(project);

        Text projectLabel = new Text("Project -- 20%");
        projectLabel.setX(20);
        projectLabel.setY(180 - 70 - 10);
        pane.getChildren().add(projectLabel);

        Rectangle quiz = new Rectangle();
        quiz.setWidth(100);
        quiz.setHeight(35);
        quiz.setFill(Color.color(0, 0, 1));
        quiz.setX(140);
        quiz.setY(180 - 35);
        pane.getChildren().add(quiz);

        Text quizLabel = new Text("Quiz -- 10%");
        quizLabel.setX(140);
        quizLabel.setY(180 - 35 - 10);
        pane.getChildren().add(quizLabel);

        Rectangle midterm = new Rectangle();
        midterm.setWidth(100);
        midterm.setHeight(105);
        midterm.setFill(Color.color(0, 1, 0));
        midterm.setX(260);
        midterm.setY(180 - 105);
        pane.getChildren().add(midterm);

        Text midtermLabel = new Text("Midterm -- 30%");
        midtermLabel.setX(260);
        midtermLabel.setY(180 - 105 - 10);
        pane.getChildren().add(midtermLabel);

        Rectangle total = new Rectangle();
        total.setWidth(100);
        total.setHeight(140);
        total.setFill(Color.color(1, 0.5, 0));
        total.setX(380);
        total.setY(180 - 140);
        pane.getChildren().add(total);

        Text totalLabel = new Text("Final -- 40%");
        totalLabel.setX(380);
        totalLabel.setY(180 - 140 - 10);
        pane.getChildren().add(totalLabel);
        
        Scene scene = new Scene(pane, 500, 200);
        primaryStage.setTitle("Marks");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
