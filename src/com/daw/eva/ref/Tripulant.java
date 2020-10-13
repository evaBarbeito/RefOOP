package com.daw.eva.ref;


import java.time.LocalDateTime;



public abstract class Tripulant {
	protected static final String bandol = "Imperi Klingon";
	protected String ID;
	protected String nom;
	protected boolean actiu;				// Si el metge el dona de baixa a llavors valdrà false.
	protected LocalDateTime dataAlta;
	protected int departament;				// Departament al qual pertany: comandament (1), 
											// armes (2), timó i navegació (3), enginyeria (4) i ciència (5).
	private int llocDeServei;			// LLoc en el qual serveix: pont (1), enginyeria (2), 							
										// cuina (3), infermeria (4) o sala d'armes (5).
	

	// GETTERS i SETTERS dels atributs/propietats:	
	protected int getLlocDeServei() {
		return llocDeServei;
	}

	protected void setLlocDeServei(int llocDeServei) {
		this.llocDeServei = llocDeServei;
	}

	
	
	// CONSTRUCTORS:								
	// Aquest constructor només podrà ser cridat per un objecte de la classe Tripulant o d'alguna que la hereti.				
	protected Tripulant(String ID, String nom, boolean actiu, LocalDateTime dataAlta, int departament, int llocDeServei){
		this.ID = ID;
		this.nom = nom;
		this.actiu = actiu;
		this.dataAlta = dataAlta;
		this.departament = departament;
		this.llocDeServei = llocDeServei;
	}
									
								

	// METODES:
	abstract protected void imprimirDadesTripulant();	// L'han d'implementar les classes que heretin aquesta classe.
	
	
	protected void saludar() {
		System.out.println("Hola des de la superclasse Tripulant");
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tripulant other = (Tripulant) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
}