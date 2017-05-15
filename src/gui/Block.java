package gui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Block extends Button{



	//private int[] position=new int[2];
	private int x;
	private  int y;//�洢������Ϣ
	private String color="0";
	private boolean isPressed=false;//��¼�����Ƿ񱻰���
	private boolean Descended=false;
	private String specialType = "null";


	public Block(int x,int y) {
		super();
		this.setMinSize(50, 50);
		this.x=x;
		this.y=y;
	}
	
	public void setBackgroundColor(String color){
		this.color=color;
		//ͨ��ʹ��css���ñ���
		//gui/img/star/1.png
		String path="gui/img/star/"+this.color+".png";
		//this.setStyle("-fx-background-color: red;");
		//this.setStyle("-fx-border-color: white;-fx-border-radius: 5px;");
		//this.setStyle("-fx-effect: dropshadow(gaussian,rgba(255,255,255,1),8,0.2,0,0) ;");
		this.setBackground(new Background(new BackgroundImage(new Image(path),
				BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
	}
	
	public void setBombColor(String color){
		this.color=color;
		//ͨ��ʹ��css���ñ���
		//gui/img/star/1.png
		String path="gui/img/star/"+this.color+".gif";
		//this.setStyle("-fx-background-color: red;");
		//this.setStyle("-fx-border-color: white;-fx-border-radius: 5px;");
		//this.setStyle("-fx-effect: dropshadow(gaussian,rgba(255,255,255,1),8,0.2,0,0) ;");
		this.setBackground(new Background(new BackgroundImage(new Image(path),
				BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
	}
	
	//���鱻ѡ�к�������Ӿ�Ч��
	public void setSelected() {
		this.setStyle("-fx-effect: dropshadow(gaussian,rgba(255,255,255,1),8,0.8,0,0) ;");
	}
	public void setNotSelected(){
		this.setStyle("-fx-effect: null;");
		//this.setStyle("-fx-effect: dropshadow(gaussian,rgba(255,255,255,1),8,0.2,0,0) ;");
	}
	
	
	//color��get set
	public String getColor() {return this.color;}
	public void setColor(String color){this.color=color;}
	
	//x get set
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return  this.x;
	}

	//y get set
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return  this.y;
	}

	public void setPosition(int x,int y){
		this.x=x;
		this.y=y;
	}

	public void setIsPressed(boolean value){
		this.isPressed=value;
	}
	public boolean getIsPressed(){
		return  this.isPressed;
	}


	public void setDescended(boolean value){
		this.Descended = value;
	}

	public boolean getDescended(){
		return this.Descended;
	}

	public String getSpecialType() {
		return specialType;
	}

	public void setSpecialType(String specialType) {
		this.specialType = specialType;
	}
}