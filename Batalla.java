package com.cristianAlcantara.batallaPorTurno;

import java.util.Scanner;

public class Batalla extends Personaje{
	
	public Batalla(String nombre, int vida, int rVida, int atq1, int atq2, int atq3) {
		super(nombre, vida, rVida, atq1, atq2, atq3);
		// TODO Auto-generated constructor stub
		
	}
	public static int turno = (int)Math.floor(Math.random()*(1 - 0 + 1) + 0 );;

	public static void batalla() {	 
		
		System.out.println("PLAYER 1: ["+Personaje.player1.nombre+"] VIDA: ["+Personaje.player1.vida+"] ___________PLAYER 2: ["+Personaje.player2.nombre+"] VIDA: ["+Personaje.player2.vida+"]" );

		if (turno == 0) {
			System.out.println("Empieza Player 2: " + Personaje.player2.nombre);
		}else {
			System.out.println("Empieza Player 1 " + Personaje.player1.nombre);
		}
		
		while (Personaje.player1.vida > 0 && Personaje.player2.vida > 0) {			
		
		if (turno == 0) {
			
			turno0();			
			
		}else {
			
			turno1();			
			
		}		
					
		} 			
		
		if (Personaje.player1.vida <= 0) {
			
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ ":::::::::::::::EL GANADOR ES[" + Personaje.player2.nombre + "]:::CON UNA VIDA DE :["+ Personaje.player2.vida + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
			
		} else {
			
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::EL GANADOR ES[" + Personaje.player1.nombre + "]:::CON UNA VIDA DE :["+ Personaje.player1.vida + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
					}
	}
	
	public static void turno0() {
		
		//Es el turno del player 2
		
		int exit = 0;
		do {
			
			
			System.out.println(Personaje.player2.nombre + " Elije entre: \n");		
			
			System.out.println("1. Atacar");		
			System.out.println("2. Recuperar Vida");			
			System.out.println("0. Rendirse");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			
			switch (response) {
				case 0:	//salir	
					exit = 0;
					break;					
				case 1:	
					Atacar0();
					break;	
				case 2:
					recVida();
					break;						
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");						
					break;
		
			}
		}while(exit != 0);	
	
		
	}
	
	public static void turno1() {
		
		//Es el turno del player 1
		
		int exit = 0;
		do {
			
			System.out.println(Personaje.player1.nombre + " Elije entre: \n");		
			
			System.out.println("1. Atacar");		
			System.out.println("2. Recuperar Vida");		
			System.out.println("0. Rendirse");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			
			switch (response) {
				case 0:	//salir	
					exit = 0;
					break;					
				case 1:	
					Atacar1();
					break;	
				case 2:
					recVida();
					break;						
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");						
					break;		
			}
		}while(exit != 0);	
		
	}
	
	public static void Atacar0() {
		int exit = 0;
		do {
			//Ataca el player 2
			//System.out.println(":: " + player2.nombre + ":: \n");
			
			
			System.out.println("Selecciona el tipo de ataque: ");
			System.out.println("1. Ataque basico 1");		
			System.out.println("2. Ataque basico 2");
			System.out.println("3. Ataque Super ");
			System.out.println("0. Atras");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			
			switch (response) {
				case 0:	//salir	
					exit = 0;
					break;					
				case 1:	
					Personaje.player2.atq1 = (int)Math.floor(Math.random()*(45 - 40 + 1) + 40 );  //Ataque entre 40 y 45 puntos
					Personaje.player1.vida = Personaje.player1.vida - Personaje.player2.atq1;
					System.out.println( Personaje.player2.nombre + " :: ATAQUE BASICO 1 :: " + Personaje.player2.atq1 + " ptos. A " + Personaje.player1.nombre + " LE QUEDAN [" + Personaje.player1.vida + "] PUNTOS DE VIDA \n");
					turno=1;
					break;	
				case 2:
					Personaje.player2.atq2 = (int)Math.floor(Math.random()*(55 - 46 + 1) + 46 ); //Ataque entre 46 y 55 puntos
					Personaje.player1.vida = Personaje.player1.vida - Personaje.player2.atq2;
					System.out.println( Personaje.player2.nombre + " :: ATAQUE BASICO 2 :: " + Personaje.player2.atq2 + " ptos. A " + Personaje.player1.nombre + " LE QUEDAN [" + Personaje.player1.vida + "] PUNTOS DE VIDA \n");
					turno=1;
					break;		
				case 3:
					Personaje.player2.atq3 = (int)Math.floor(Math.random()*(80 - 65 + 1) + 65 ); //Ataque Super entre 65 y 80 puntos
					Personaje.player1.vida = Personaje.player1.vida - Personaje.player2.atq3;
					System.out.println( Personaje.player2.nombre + " :: ATAQUE BASICO 3 :: " + Personaje.player2.atq3 + " ptos. A " + Personaje.player1.nombre + " LE QUEDAN [" + Personaje.player1.vida + "] PUNTOS DE VIDA \n");
					turno=1;
					break;
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");						
					break;
				}

		}while(exit != 0);			
	}
	public static void Atacar1() {
		
		//Ataca el player 1
		
		int exit = 0;
		do {		
			
			System.out.println("Selecciona el tipo de ataque: ");
			System.out.println("1. Ataque basico 1");		
			System.out.println("2. Ataque basico 2");
			System.out.println("3. Ataque Super ");
			System.out.println("0. Atras");						
			
			Scanner sc3 = new Scanner(System.in);
			int response = Integer.valueOf(sc3.nextLine());	
			
			switch (response) {
				case 0:	//salir	
					exit = 0;
					break;					
				case 1:	
					Personaje.player1.atq1 = (int)Math.floor(Math.random()*(45 - 40 + 1) + 40 );  //Ataque entre 40 y 45 puntos
					Personaje.player2.vida = Personaje.player2.vida - Personaje.player1.atq1;
					System.out.println( Personaje.player1.nombre + " :: ATAQUE BASICO 1 :: " + Personaje.player1.atq1 + " ptos. A " + Personaje.player2.nombre + " LE QUEDAN [" + Personaje.player2.vida + "] PUNTOS DE VIDA \n");

					turno=0;
					break;	
				case 2:
					Personaje.player1.atq2 = (int)Math.floor(Math.random()*(55 - 46 + 1) + 46 ); //Ataque entre 46 y 55 puntos
					Personaje.player2.vida = Personaje.player2.vida - Personaje.player1.atq2;
					System.out.println( Personaje.player1.nombre + " :: ATAQUE BASICO 2 :: " + Personaje.player1.atq2 + " ptos. A " + Personaje.player2.nombre + " LE QUEDAN [" + Personaje.player2.vida + "] PUNTOS DE VIDA \n");

					turno=0;
					break;		
				case 3:
					Personaje.player1.atq3 = (int)Math.floor(Math.random()*(80 - 65 + 1) + 65 ); //Ataque Super entre 65 y 80 puntos
					Personaje.player2.vida = Personaje.player2.vida - player1.atq3;
					System.out.println( Personaje.player1.nombre + " :: ATAQUE BASICO 3 :: " + Personaje.player1.atq3 + " ptos. A " + Personaje.player2.nombre + " LE QUEDAN [" + Personaje.player2.vida + "] PUNTOS DE VIDA \n");

					turno=0;
					break;
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");						
					break;
				}

		}while(exit != 0);			
	}

	
	public static void recVida() {
		
	}
}
		
	
