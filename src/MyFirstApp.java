import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApp extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("Start");
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
            stage.setTitle("Hello World!");
            stage.show();
    }


    @Override
    public void stop() throws Exception {
        System.out.println("Ende");
        super.stop();
    }
}
