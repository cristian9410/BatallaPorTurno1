package com.cristianAlcantara.batallaPorTurno;

import java.util.Scanner;


/////////////////////////////////////////////////////////////////////////
//////////////////ESTA CLASE MENU ES PARA PROBAR/////////////////////////
////////////////////////////////////////////////////////////////////////
public class Menu {

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
					System.out.println("\n \n ....��Selecciona una opci�n valida 1!!....\n \n");		
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
					System.out.println("\n \n ....��Selecciona una opci�n valida 2!!....\n \n");						
					break;
			}				
		}while(exit != 0);			
	}

	public static void seleccionPl1 () {	//Menu del player 1
		
		
		int exit = 0;
		do {
			
			System.out.println("PLAYER 1 \n");
			
			
			System.out.println("Oprime el numero del personaje deseado");
			System.out.println("1. Bicho");		
			System.out.println("2. Boris");
			System.out.println("3. Luna");
			System.out.println("0. Atras");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			
			switch (response) {
				case 0:	//salir	
					seleccionDePersonaje();
					break;					
				case 1:	
					Personaje.player1.nombre = "Bicho";
					Personaje.player1.vida = 150;						
					seleccionDePersonaje();
					break;	
				case 2:
					Personaje.player1.nombre = "Boris";
					Personaje.player1.vida = 150;						
					seleccionDePersonaje();
					break;		
				case 3:
					Personaje.player1.nombre = "Luna";
					Personaje.player1.vida = 150;						
					seleccionDePersonaje();
					break;
				default:						
					System.out.println("\n \n ....��Selecciona una opci�n valida 3!!....\n \n");						
					break;
			}		
			
		}while(exit != 0);			
	}


	public static void seleccionPl2 () {	//Menu del player 2
}
}