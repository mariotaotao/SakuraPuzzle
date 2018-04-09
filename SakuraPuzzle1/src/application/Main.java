package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;


public class Main extends Application {
	//private static final AudioClip gekitei = new AudioClip(Controller.class.getResource("audio/gekitei.wav").toString());
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			Region root = FXMLLoader.load(getClass().getResource("/application/puzzle2.fxml"));
			//Image sakura=new Image("images/sakura.jpg");
			//ImageView full= new ImageView();
	        //full.setImage(sakura);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image image = new Image("images/pen.png"); 
			root.setCursor(new ImageCursor(image));
			//root.setCursor(Cursor.HAND);
			primaryStage.setTitle("Sakura Puzzle");
			//primaryStage.setResizable(false);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			//scene.setFill(null);
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
