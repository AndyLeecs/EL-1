package gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author julia98
 */
public class Story6Win extends Stage
{
	AnchorPane root;

	public Story6Win() throws IOException
	{
		Music.playBgMusic(9);
		root = FXMLLoader.load(getClass().getResource("Story6.fxml"));

		Scene scene = new Scene(root, 1200, 800);
		scene.setFill(Color.TRANSPARENT);
		scene.getStylesheets().add(getClass().getResource("story.css").toExternalForm());
		this.setScene(scene);

		this.initStyle(StageStyle.UNDECORATED);
		this.show();

	}
}
