package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StoryWin extends Stage {
	AnchorPane root;

	public StoryWin() throws IOException {
		Music.playBgMusic(4);
		root= FXMLLoader.load(getClass().getResource("Story.fxml"));
//		root.setBackground(new Background(new BackgroundImage(new Image("gui/img/story1.jpeg"),
//	                BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
//		root.setBackground(new Background(new BackgroundImage(new Image("gui/img/storyChart.jpg"),
//	                BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));


		 Scene scene=new Scene(root,1200,800);
		 scene.setFill(Color.TRANSPARENT);
		 scene.getStylesheets().add(getClass().getResource("story.css").toExternalForm());
		 this.setScene(scene);
		 
	        this.initStyle(StageStyle.UNDECORATED);
	        this.show();

	}

//	public static void main(String[] args) {
//		launch(args);
//	}
}
