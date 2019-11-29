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
		 
		 seleccionados= new Personaje[3];
		 
	 }
	 
	 public void pintarPersonaje() {
		for (int i = 0; i < perso.size(); i++) {
			perso.get(i).pintar();
		}

	 }
	 
	 public void pintarresultado() {
		 System.out.println(seleccionados.length);
		}
	 
	 public void moverpersonaje() {
		 for (int i = 0; i < perso.size(); i++) {
				perso.get(i).mover();
				
			}
		}
	 
	public void agregar() {
	
		
		
		
			perso.add(new Personaje(app.random(50,500),app.random(50,500), 1, app.random(50,500),app));
				
	}
	
	
	//seleccionar personajes
	public void agregarSel() {
		
		
		 for (int i = 0; i < perso.size(); i++) {
			 if(perso.get(i).getPosx() >= app.mouseX  && perso.get(i).getPosx() <= app.mouseX + 70
					 && perso.get(i).getPosy() >= app.mouseY  && perso.get(i).getPosy() <= app.mouseY + 70 ) {
				 
				 seleccionados[0]= perso.get(i);
				
				 //seleccionados.add(perso.get(i));
				 
			 }
			 
			 for (int j = 0; j < perso.size(); j++) {
				 if(perso.get(j).getPosx() >= app.mouseX  && perso.get(j).getPosx() <= app.mouseX + 70
						 && perso.get(j).getPosy() >= app.mouseY  && perso.get(j).getPosy() <= app.mouseY + 70 ) {
					 seleccionados[1]= perso.get(j);
				 }
				 
				 
				 
				for (int j2 = 0; j2 < perso.size(); j2++) {
					if(perso.get(j2).getPosx() >= app.mouseX  && perso.get(j2).getPosx() <= app.mouseX + 70
							 && perso.get(j2).getPosy() >= app.mouseY  && perso.get(j2).getPosy() <= app.mouseY + 70 ) {
						 seleccionados[2]= perso.get(j2);
					 }
					
					
					for (int k = 0; k < perso.size(); k++) {
						if(perso.get(k).getPosx() >= app.mouseX  && perso.get(k).getPosx() <= app.mouseX + 70
								 && perso.get(k).getPosy() >= app.mouseY  && perso.get(k).getPosy() <= app.mouseY + 70 ) {
							 seleccionados[3]= perso.get(k);
						 }

					}
				}
			}
			 
			 
			
			 
			
					 
		 }
	}
	
	

}
