package Model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {
	
	private LinkedList <Personaje> perso;
	private PApplet app;
	private Personaje [] seleccionados;
	
	 public Logica(PApplet app) {
		 perso= new LinkedList <Personaje>();
		 this.app=app;
		 
	 }
	 
	 public void pintarPersonaje() {
		for (int i = 0; i < perso.size(); i++) {
			perso.get(i).pintar();
		}

	 }
	 
	 public void pintarresultado() {
		 System.out.println(perso.size());
		}
	 
	 public void moverpersonaje() {
		 for (int i = 0; i < perso.size(); i++) {
				perso.get(i).mover();
			}
		}
	 
	public void agregar() {
		System.out.println(perso.size());
		
		
			perso.add(new Personaje(app.random(50,500),app.random(50,500), 1, app.random(50,500),app));
			
		
			
	}
	
	

}
