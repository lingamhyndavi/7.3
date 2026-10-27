import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class LabelImageDemo extends Application {

    @Override
    public void start(Stage stage) {

        // Create a Label
        Label label = new Label("Welcome to JavaFX!");

        // Load an image
        Image image = new Image("file:flower.jpg");

        // Create an ImageView
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);

        // Arrange components using VBox
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, imageView);

        // Create Scene
        Scene scene = new Scene(root, 400, 350);

        // Set Stage
        stage.setTitle("Label and ImageView Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
