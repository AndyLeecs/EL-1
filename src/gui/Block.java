package gui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Block extends Button
{

	// private int[] position=new int[2];
	private int x;
	private int y;
	private String color = "0";
	private boolean isPressed = false;
	private boolean Descended = false;
	private String specialType = "null";
	private String pattern = "null";

	public Block(int x, int y)
	{
		super();
		this.setMinSize(50, 50);
		this.x = x;
		this.y = y;
		// this.setStyle("-fx-background-color: transparent;");
	}

	public void setBackgroundColor(String color)
	{
		this.color = color;
		// gui/img/star/1.png
		String path = "gui/img/star/" + this.color + ".png";
		this.setBackground(new Background(new BackgroundImage(new Image(path), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
	}

	public void setBombColor(String color)
	{
		this.color = color;
		// ͨ��ʹ��css���ñ���
		// gui/img/star/1.png
		String path = "gui/img/star/" + this.color + ".gif";
		// this.setStyle("-fx-background-color: red;");
		// this.setStyle("-fx-border-color: white;-fx-border-radius: 5px;");
		// this.setStyle("-fx-effect:
		// dropshadow(gaussian,rgba(255,255,255,1),8,0.2,0,0) ;");
		this.setBackground(new Background(new BackgroundImage(new Image(path), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
	}

	// ���鱻ѡ�к�������Ӿ�Ч��
	public void setSelected()
	{
		// this.setStyle("-fx-border-width: 2,0;-fx-border-color:
		// white;-fx-border-style: solid,hidden;");
		this.setStyle("-fx-effect: dropshadow(gaussian,rgba(255,255,255,1),8,0.8,0,0) ;");

	}

	public void setNotSelected()
	{
		this.setStyle("-fx-effect: null;");
		if (pattern.equals("vertical") || pattern.equals("horizon"))
		{
			setPattern(pattern);
		}
		// this.setStyle("-fx-effect:
		// dropshadow(gaussian,rgba(255,255,255,1),8,0.2,0,0) ;");
	}

	// color��get set
	public String getColor()
	{
		return this.color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getX()
	{
		return this.x;
	}

	// x get set
	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return this.y;
	}

	// y get set
	public void setY(int y)
	{
		this.y = y;
	}

	public void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public boolean getIsPressed()
	{
		return this.isPressed;
	}

	public void setIsPressed(boolean value)
	{
		this.isPressed = value;
	}

	public boolean getDescended()
	{
		return this.Descended;
	}

	public void setDescended(boolean value)
	{
		this.Descended = value;
	}

	public String getSpecialType()
	{
		return specialType;
	}

	public void setSpecialType(String specialType)
	{
		this.specialType = specialType;
	}

	public String getPattern()
	{
		return pattern;
	}

	public void setPattern(String pattern)
	{
		// setSpecialType(pattern);
		this.pattern = pattern;
		String path = "gui/img/star/" + this.color + this.pattern + ".png";

		this.setBackground(new Background(new BackgroundImage(new Image(path), BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		this.setStyle("-fx-effect: dropshadow(gaussian,rgba(0,0,255,0.8),8,0.8,0,0) ;");

		// this.setStyle("-fx-effect:
		// dropshadow(gaussian,rgba(255,255,0,0.8),8,0.8,0,0) ;");
	}
}
