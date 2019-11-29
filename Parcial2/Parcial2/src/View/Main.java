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
		rect(400,400,200,100);
		logica.pintarPersonaje();
		logica.moverpersonaje();
		//logica.pintarresultado();
	}
	
	public void mousePressed() {
		
		
		if(mouseX>400 && mouseX<600 && mouseY>400 && mouseY<500) {
			System.out.println("se pinto");
		
		}
		
		
		logica.agregar();
		
	}
	
	

}
