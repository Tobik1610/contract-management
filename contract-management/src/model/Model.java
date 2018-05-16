package model;

public class Model {
	private String title = "Vertragsverwaltung";
	private int width = 800;
	private int heigth = 600;
	private String message = "Button pressed";
	private String btn1 = "Press Me!";
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBtn1() {
		return btn1;
	}

	public void setBtn1(String btn1) {
		this.btn1 = btn1;
	}
}
