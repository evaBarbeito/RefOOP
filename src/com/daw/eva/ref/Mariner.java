package com.daw.eva.ref;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Mariner extends Tripulant {
	private boolean serveiEnElPont;		// Si el tripulant serveix en el pont a llavors true.
	private String descripcioFeina;
	
	
	public Mariner(String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei, boolean serveiEnElPont, String descripcioFeina){
		super(ID, nom, actiu, dataAlta, departament, llocDeServei);
		this.serveiEnElPont = serveiEnElPont;
		this.descripcioFeina = descripcioFeina;
	}
	
//	Els getters i setters de les propietats/atributs.


	protected void imprimirDadesTripulant(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        System.out.println(  
        		"DADES TRIPULANT: " +
            	"\n        Bandol: " + bandol + 
    			"\n        ID: " + super.ID + 		
                "\n        Nom: " + nom + 
                "\n        Actiu: " + actiu + 
                "\n        Departament (de la classe Tripulant): " + departament + 
                "\n        Departament (de la classe IKSRotarranConstants): " + IKSRotarranConstants.DEPARTAMENTS[departament] +
                //"\n        LLoc de servei: " + llocDeServei +
                "\n        LLoc de servei (de la classe Tripulant): " + super.getLlocDeServei() +
                "\n        LLoc de servei (de la classe IKSRotarranConstants): " + IKSRotarranConstants.LLOCS_DE_SERVEI[super.getLlocDeServei()] +
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
}