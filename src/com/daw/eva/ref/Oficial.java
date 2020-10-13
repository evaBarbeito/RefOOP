package com.daw.eva.ref;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Oficial extends Tripulant {
	private boolean serveiEnElPont;		// Si el tripulant serveix en el pont a llavors true.
	private String descripcioFeina;
	

	// GETTERS i SETTERS dels atributs/propietats:
	public boolean isServeiEnElPont() {
		return serveiEnElPont;
	}

	public void setServeiEnElPont(boolean serveiEnElPont) {
		this.serveiEnElPont = serveiEnElPont;
	}

	public String getDescripcioFeina() {
		return descripcioFeina;
	}

	public void setDescripcioFeina(String descripcioFeina) {
		this.descripcioFeina = descripcioFeina;
	}
	


	// CONSTRUCTORS:
	public Oficial(String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei, boolean serveiEnElPont, String descripcioFeina){
		super(ID, nom, actiu, dataAlta, departament, llocDeServei);
		this.serveiEnElPont = serveiEnElPont;
		this.descripcioFeina = descripcioFeina;
	}
	


	// METODES:
	protected void imprimirDadesTripulant(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        System.out.println(  
        		"DADES TRIPULANT: " +
            	"\n        Bandol: " + bandol + 		// ¿No fa falta posar el super?.
    			"\n        ID: " + super.ID + 		// ¿No fa falta posar el super?.
                "\n        Nom: " + nom + 
                "\n        Actiu: " + actiu +
                "\n        Departament: " + departament + 
                //"\n        LLoc de servei: " + llocDeServei +
                "\n        LLoc de servei: " + super.getLlocDeServei() +
                "\n        Descripció de la feina que fa: " + descripcioFeina + 
                "\n        Serveix en el pont?: " + serveixEnElPont() +  
                "\n        Data d'alta: " + dataAlta.format(formatter)
		);
	}		
	
	private String serveixEnElPont() {
		if (serveiEnElPont) {
			return "SI";
		} else {
			return "NO";
		}
	} 
	
	
	protected void saludar() {
		System.out.println("Hola des de la subclasse Oficial");
	}

	
	@Override
	public String toString() {
		return "Oficial [serveiEnElPont=" + serveiEnElPont + ", descripcioFeina=" + descripcioFeina + ", ID=" + ID
				+ ", nom=" + nom + ", actiu=" + actiu + ", dataAlta=" + dataAlta + ", departament=" + departament + "]";
	}
	
}