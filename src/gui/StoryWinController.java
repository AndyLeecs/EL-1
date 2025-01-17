package gui;

import java.util.ArrayList;

import Story.FileManager;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * @author julia98
 */
public class StoryWinController
{
	@FXML
	public AnchorPane root;
	@FXML
	public Button skipBtn;
	@FXML
	public Separator seperate;
	@FXML
	public ImageView picture1;
	@FXML
	public ImageView picture2;
	@FXML
	public ImageView picture3;
	@FXML
	public Label subline;
	int i = 0;

	@FXML
	public void onSkipBtnClicked()
	{
		Platform.runLater(() ->
		{
			// game
			new GameWin();
			root.getScene().getWindow().hide();
		});
	}

	@FXML
	public void onChartClicked()
	{
		FileManager filemanager = new FileManager(1);

		ArrayList<String> word = filemanager.word;

		if (i == word.size())
			Platform.runLater(() ->
			{
				new GameWin();
				// StorySelectBox ssb = new StorySelectBox(1);
				root.getScene().getWindow().hide();
			});
		else
		{
			subline.setText(word.get(i));
			i++;
		}
	}
}
