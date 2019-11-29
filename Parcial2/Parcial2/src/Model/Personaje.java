package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje implements Runnable{
	private int edad;
	private float numeroS;
	private float posx;
	private float posy;
	private int dirx;
	private PApplet app;
	private PImage imagen;
	
	
	public Personaje(float posx, float posy, int edad,float numeroS,PApplet app) {
		this.posx=posx;
		this.posy=posy;
		this.edad=edad;
		this.numeroS=numeroS;
		this.app=app;
		this.dirx=1;
		
		this.imagen=app.loadImage("lisa_simpson.png");
		
		
		new Thread(this).start();
	}
	
	
	public void pintar() {
		app.image(imagen,posx,posy,100,100);
	}
	
	public void mover() {
		posx += 1*dirx;
        if (posx <=25 || posx >= 875){
            dirx *=-1;
        }
	}
	
	public void run() {
		mover();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getNumeroS() {
		return numeroS;
	}


	public void setNumeroS(float numeroS) {
		this.numeroS = numeroS;
	}


	public float getPosx() {
		return posx;
	}


	public void setPosx(float posx) {
		this.posx = posx;
	}


	public float getPosy() {
		return posy;
	}


	public void setPosy(float posy) {
		this.posy = posy;
	}


	public int getDirx() {
		return dirx;
	}


	public void setDirx(int dirx) {
		this.dirx = dirx;
	}


	public PApplet getApp() {
		return app;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public PImage getImagen() {
		return imagen;
	}


	public void setImagen(PImage imagen) {
		this.imagen = imagen;
	}
	
	
	

}
