import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Start");
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");
        stage.setWidth(500);
        stage.setHeight(400);

        VBox parent = new VBox();
        Label label1 = new Label("This is a label");

        parent.getChildren().add(label1);

        Scene scene1 =  new Scene(parent);
        stage.setScene(scene1);
        


        stage.show();




    }


    @Override
    public void stop() throws Exception {
        System.out.println("Ende");
        super.stop();
    }

    public static void main  (String[] args) {

        launch();

    }
}
