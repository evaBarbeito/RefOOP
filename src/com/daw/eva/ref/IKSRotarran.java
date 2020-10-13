package com.daw.eva.ref;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class IKSRotarran {

	public static void main(String[] args) {
		System.out.println("------------ EXERCICI 2 ------------");
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		Oficial capita = new Oficial("001-A", "Martok", true, LocalDateTime.parse("15-08-1954 00:01", formatter), 1, 1, true, "Capitanejar la nau.");

		Mariner	mariner_02_03 = new Mariner("758-J", "Kurak", true, LocalDateTime.parse("26-12-1981 13:42", formatter), 3, 1, true, "Mariner encarregat del timó i la navegació durant el 2n torn.");
		
		System.out.println("capita.departament = " + capita.departament);
		//System.out.println("capita.descripcioFeina = " + capita.descripcioFeina);		// No tenim accés perquè és un atribut private i només des de el fitxer de la classe Oficial.java tenim accés.
		System.out.println("capita.getDescripcioFeina() = " + capita.getDescripcioFeina());
		System.out.println();
		
		System.out.println("capita.imprimirDadesTripulant():");
		capita.imprimirDadesTripulant();
		
		System.out.println();
		capita.departament = 10;		// Tenim accés perquè és un atribut protected i per tant tenim accés des de qualsevol fitxer de classe del packet.
		System.out.println("capita.departament = " + capita.departament);
		System.out.println();
		
		System.out.println();
		System.out.println("------------ EXERCICI 3 ------------");
		System.out.println();
		
		Oficial capitaTmp1 = new Oficial("001-A", "Martok", true, LocalDateTime.parse("15-08-1954 00:01", formatter), 1, 1, true, "Capitanejar la nau.");
		System.out.println("capitaTmp1 ha estat declarat del tipus Oficial, capitaTmp1.patata():");
		capitaTmp1.saludar();
		
		System.out.println();
		Tripulant capitaTmp2 = new Oficial("001-A", "Martok", true, LocalDateTime.parse("15-08-1954 00:01", formatter), 1, 1, true, "Capitanejar la nau.");
		System.out.println("capitaTmp2 ha estat declarat del tipus Tripulant, capitaTmp2.patata():");
		capitaTmp2.saludar();
		
		System.out.println();
		System.out.println("------------ EXERCICI 4 ------------");
		System.out.println();
		
		Oficial capitaTmp3 = new Oficial("240-K", "Kurn", true, LocalDateTime.parse("11-07-1978 01:47", formatter), 1, 1, true, "Capitanejar la nau.");
		Oficial capitaTmp4 = new Oficial("321-K", "Karl", true, LocalDateTime.parse("11-07-1978 01:47", formatter), 1, 1, true, "Capitanejar la nau.");
		
		System.out.println(
				"capita.ID = " + capita.ID + ", capita.getClass = "  + capita.getClass() + "\n" + 
				"capitaTmp1.ID = " + capitaTmp1.ID + ", capitaTmp1.getClass = "  + capitaTmp1.getClass() + "\n" +  
				"capitaTmp2.ID = " + capitaTmp2.ID + ", capitaTmp2.getClass = "  + capitaTmp2.getClass() + "\n" + 
				"capitaTmp3.ID = " + capitaTmp3.ID + ", capitaTmp3.getClass = "  + capitaTmp3.getClass());
		System.out.println("capita.equals(capitaTmp1): " + capita.equals(capitaTmp1));
		System.out.println("capita.equals(capitaTmp2): " + capita.equals(capitaTmp2));
		System.out.println("capita.equals(capitaTmp3): " + capita.equals(capitaTmp3));
		
		System.out.println();
		System.out.println("------------ EXERCICI 6 ------------");
		System.out.println();
		
		System.out.println("L'objecte capita (té implementat el toString()): " + capita);
		System.out.println();
		System.out.println("L'objecte mariner_02_03 (NO té implementat el toString()): " + mariner_02_03);
		
		System.out.println();
		System.out.println("------------ EXERCICI 7 ------------");
		System.out.println();
		
		System.out.println(mariner_02_03);

	}

}
