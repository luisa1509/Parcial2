package View;

import Model.Logica;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	
	Logica logica;
	
	public void setup() {
		
		logica= new Logica(this);
		
	}
	
	public void settings() {
		size(900,600);
	}
	
	public void draw() {
		background(255);
		
	}
	
	public void mousePressed() {
		
	}
	
	

}
