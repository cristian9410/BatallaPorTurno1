package com.cristianAlcantara.batallaPorTurno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
	 
	public static String nombreP2;	
	public static String nombreP1;    
        
	public static void menu () {
		
		int exit = 0;
		do {			
			System.out.println("BIENVENIDO A BATALLA DE MASCOTAS \n");			
			System.out.println("Precione la opcion deseada");
			System.out.println("1. Selecion de personajes");	
			System.out.println("2. Empezar Batalla");
			System.out.println("0. Salir");			
			
			Scanner sc1 = new Scanner(System.in);
			int response = Integer.valueOf(sc1.nextLine());		

			switch (response) {
				case 0:	//salir	
					exit = 0;
					break;					
				case 1:
					seleccionDePersonaje();	//menu para seleccionar los personajes
					break;				
				case 2:Batalla.batalla();	//Empieza la pelea
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 1!!....\n \n");		
					menu();
					break;
			}				
		}while(exit != 0);		
	}

	//Seleccion de personaje
	public static void seleccionDePersonaje() {			
		int exit = 0;
		do {			
			System.out.println("1. Player 1 \n");				
			System.out.println("2. Player 2 \n");
			System.out.println("3. Atras \n");						
			System.out.println("0. Salir");
			
			Scanner sc2 = new Scanner(System.in);
			int response = Integer.valueOf(sc2.nextLine());

			switch (response) {
				case 0:	//salir						
					break;					
				case 1:
					seleccionPl1();	//Menu para establecer el personaje del player 1
					break;	
				case 2:
					seleccionPl2(); //Menu para establecer el personaje del player 2
				case 3:
					menu();	//Regresa atras
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 2!!....\n \n");						
					break;
			}				
		}while(exit != 0);			
	}
	public static void seleccionPl1 () {	//Menu del player 1
		
		nombreP1 = JOptionPane.showInputDialog("NOMBRE DEL PLAYER 1");			
		Personaje.player1.setNombre (nombreP1);		
		Personaje.player1.setVida(150);						
		seleccionDePersonaje();		
	}

	public static void seleccionPl2 () {	//Menu del player 2
		
		nombreP2 = JOptionPane.showInputDialog("NOMBRE DEL PLAYER 2");	
		Personaje.player2.setNombre(nombreP2);	
		Personaje.player2.setVida(150);
		seleccionDePersonaje();	
}
}

