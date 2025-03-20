import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Question1 extends Application {

    public void start(Stage primaryStage) {
        VBox vbox = new VBox();

        HBox controls = new HBox();
        Text fontNameText = new Text("Font Name");
        controls.getChildren().add(fontNameText);
        HBox.setMargin(fontNameText, new Insets(0, 0, 0, 10));

        ObservableList<String> fonts = FXCollections.observableArrayList(Font.getFamilies());
        ComboBox<String> fontComboBox = new ComboBox<>(fonts);
        controls.getChildren().add(fontComboBox);

        Text fontSizeText = new Text("Font Size");
        controls.getChildren().add(fontSizeText);

        ObservableList<Integer> fontSizes = FXCollections.observableArrayList(12, 16, 18, 20, 22, 24, 28, 32, 36, 40, 44, 48);
        ComboBox<Integer> fontSizeComboBox = new ComboBox<>(fontSizes);
        controls.getChildren().add(fontSizeComboBox);

        controls.setSpacing(10);
        controls.setAlignment(Pos.CENTER);
        vbox.getChildren().add(controls);

        Text mainText = new Text("Programming is fun");
        HBox textContainer = new HBox();
        textContainer.getChildren().add(mainText);
        textContainer.setAlignment(Pos.CENTER);
        VBox.setMargin(textContainer, new Insets(20, 0, 0, 0));

        fontComboBox.setValue(mainText.getFont().getFamily());
        fontSizeComboBox.setValue((int) mainText.getFont().getSize());

        vbox.getChildren().add(textContainer);

        HBox checkboxContainer = new HBox();
        checkboxContainer.setAlignment(Pos.CENTER);
        VBox.setMargin(checkboxContainer, new Insets(20, 0, 0, 0));

        CheckBox boldCb = new CheckBox();
        checkboxContainer.getChildren().add(boldCb);
        Text labelBold = new Text("Bold");
        checkboxContainer.getChildren().add(labelBold);

        CheckBox italicCb = new CheckBox();
        checkboxContainer.getChildren().add(italicCb);
        HBox.setMargin(italicCb, new Insets(0, 0, 0, 10));
        Text labelItalic = new Text("Italic");
        checkboxContainer.getChildren().add(labelItalic);

        vbox.getChildren().add(checkboxContainer);

        Runnable updateFont = () -> {
            String selectedFont = fontComboBox.getValue() != null ? fontComboBox.getValue() : mainText.getFont().getFamily();
            int selectedSize = fontSizeComboBox.getValue() != null ? fontSizeComboBox.getValue() : (int) mainText.getFont().getSize();
            FontWeight weight = boldCb.isSelected() ? FontWeight.BOLD : FontWeight.NORMAL;
            FontPosture posture = italicCb.isSelected() ? FontPosture.ITALIC : FontPosture.REGULAR;
            mainText.setFont(Font.font(selectedFont, weight, posture, selectedSize));
        };

        fontComboBox.setOnAction(e -> updateFont.run());
        fontSizeComboBox.setOnAction(e -> updateFont.run());
        boldCb.setOnAction(e -> updateFont.run());
        italicCb.setOnAction(e -> updateFont.run());

        Scene scene = new Scene(vbox, 600, 200);
        primaryStage.setTitle("Question 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
