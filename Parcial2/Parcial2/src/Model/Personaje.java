package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje {
	private int edad;
	private int numeroS;
	private int posx;
	private int posy;
	private int dirx;
	private PApplet app;
	private PImage imagen;
	
	
	public Personaje(int posx, int posy, int edad,int numeroS) {
		this.posx=posx;
		this.posy=posy;
		this.edad=edad;
		this.numeroS=numeroS;
		
		this.imagen=app.loadImage("lisa_simpson.png");
	}
	
	
	public void pintar() {
		app.image(imagen,posx,posy);
	}
	
	public void mover() {
		this.posx += 1*this.dirx;
        if (this.posx <=25 || this.posx >= 875){
            this.dirx *=-1;
        }
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getNumeroS() {
		return numeroS;
	}


	public void setNumeroS(int numeroS) {
		this.numeroS = numeroS;
	}


	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
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
