package myprojectmh;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyProjectMH extends Application {

    private Button btnRed, btnBlue, btnBlack, btnPink, btnExit;
    private Rectangle rectangle;
    private VBox vbox, svbox;
    private HBox shbox;
    private GridPane root;
    private Separator Hseperator, Vseperator;

    @Override
    public void init() {
        btnBlack = new Button("BLACK");
        btnBlack.setPrefSize(80, 10);
        btnBlack.setTextFill(Color.BLACK);
        btnBlack.setOnAction(e -> OnBlack());

        btnBlue = new Button("BLUE");
        btnBlue.setPrefSize(80, 10);
        btnBlue.setTextFill(Color.BLUE);
        btnBlue.setOnAction(e -> OnBlue());

        btnPink = new Button("MAGENTA");
        btnPink.setPrefSize(80, 10);
        btnPink.setTextFill(Color.MAGENTA);
        btnPink.setOnAction(e -> OnPink());

        btnRed = new Button("RED");
        btnRed.setPrefSize(80, 10);
        btnRed.setTextFill(Color.RED);
        btnRed.setOnAction(e -> OnRed());

        btnExit = new Button("Exit");
        btnExit.setPrefSize(80, 10);
        btnExit.setOnAction(e -> OnExit());
        //////////////////////////////////////////////////////

        rectangle = new Rectangle(127, 127, Color.BLUE);

        vbox = new VBox(10, btnRed, btnBlue, btnBlack, btnPink);
        Hseperator = new Separator(Orientation.HORIZONTAL);

        Vseperator = new Separator(Orientation.VERTICAL);

        root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        root.add(Hseperator, 1, 0, 5, 1);
        root.add(Vseperator, 1, 1, 5, 1);
        root.add(vbox, 2, 1);
        root.add(rectangle, 5, 1);
        root.add(btnExit, 0, 3, 5, 1);

    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Colors");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void OnBlack() {
        rectangle.setFill(Color.BLACK);
    }

    private void OnBlue() {
        rectangle.setFill(Color.BLUE);
    }

    private void OnPink() {
        rectangle.setFill(Color.MAGENTA);
    }

    private void OnRed() {
        rectangle.setFill(Color.RED);
    }

    private void OnExit() {
        Platform.exit();
    }

}
