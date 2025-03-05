import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartExample extends Application {
    @Override
    public void start(Stage stage) {
        // Define X and Y axes
        CategoryAxis xAxis = new CategoryAxis(); // X-Axis (Categories)
        NumberAxis yAxis = new NumberAxis();     // Y-Axis (Values)
        xAxis.setLabel("Category");
        yAxis.setLabel("Value");

        // Create BarChart
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Sample Bar Chart");

        // Create Data Series
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Data Set 1");
        series1.getData().add(new XYChart.Data<>("A", 10));
        series1.getData().add(new XYChart.Data<>("B", 25));
        series1.getData().add(new XYChart.Data<>("C", 15));

        // Add Data to Chart
        barChart.getData().add(series1);

        // Show Scene
        Scene scene = new Scene(barChart, 600, 400);
        stage.setTitle("JavaFX BarChart Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
