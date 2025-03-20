import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Question1 extends Application {
    List<Integer> list;

    @Override
    public void start(Stage primaryStage) throws Exception {
        if(list == null) {
            list = new ArrayList<>();
        }

        VBox vbox = new VBox();

        HBox hbox = new HBox();
        Text label = new Text("Enter number");
        TextField fieldNumber = new TextField();

        hbox.getChildren().add(label);
        hbox.getChildren().add(fieldNumber);

        vbox.getChildren().add(hbox);

        TextArea textArea = new TextArea();
        vbox.getChildren().add(textArea);

        HBox btnContainer = new HBox();

        Button btnAdd = new Button("Add");
        btnAdd.setOnAction(e -> {
            list.add(Integer.parseInt(fieldNumber.getText()));

            StringBuilder sb = new StringBuilder();
            for(Integer i : list) 
                sb.append(i + " ");
            textArea.setText(sb.toString());
        });
        btnContainer.getChildren().add(btnAdd);

        Button btnSort = new Button("Sort");
        btnSort.setOnAction(e -> {
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(Integer i : list) 
                sb.append(i + " ");
            textArea.setText(sb.toString());
        });
        btnContainer.getChildren().add(btnSort);

        Button btnShuffle = new Button("Shuffle");
        btnShuffle.setOnAction(e -> {
            Collections.shuffle(list);
            StringBuilder sb = new StringBuilder();
            for(Integer i : list) 
                sb.append(i + " ");
            textArea.setText(sb.toString());
        });
        btnContainer.getChildren().add(btnShuffle);

        Button btnReverse = new Button("Reverse");
        btnReverse.setOnAction(e -> {
            Collections.reverse(list);
            StringBuilder sb = new StringBuilder();
            for(Integer i : list) 
                sb.append(i + " ");
            textArea.setText(sb.toString());
        });
        btnContainer.getChildren().add(btnReverse);

        vbox.getChildren().add(btnContainer);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Question 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}