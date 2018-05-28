package com.cristianAlcantara.batallaPorTurno;

import java.util.Scanner;

public class Batalla extends Personaje{
	
	public Batalla(String nombre, int vida, int rVida, int atq1, int atq2, int atq3) {
		super(nombre, vida, rVida, atq1, atq2, atq3);
		// TODO Auto-generated constructor stub
		
	}       
        
	public static int turno = (int)Math.floor(Math.random()*(1 - 0 + 1) + 0 );;

	public static void batalla() {	 
		
		System.out.println( "PLAYER 1: ["+Personaje.player1.getNombre()+"] VIDA: ["+Personaje.player1.getVida()+"] ___________PLAYER 2: ["+Personaje.player2.getNombre()+"] VIDA: ["+Personaje.player2.getVida()+"]" );

		if (turno == 0) {
			System.out.println("Empieza Player 2: " + Personaje.player2.getNombre());
		}else {
			System.out.println("Empieza Player 1 " + Personaje.player1.getNombre());
		}
		
		while (Personaje.player1.getVida() > 0 && Personaje.player2.getVida() > 0) {			
		
		if (turno == 0) {
			
			turno0();			
			
		}else {
			
			turno1();			
			
		}		
					
		} 			
		
		if (Personaje.player1.getVida() <= 0) {
			
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ ":::::::::::::::EL GANADOR ES[" + Personaje.player2.getNombre() + "]:::CON UNA VIDA DE :["+ Personaje.player2.getVida() + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
			
		} else {
			
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
					+ "::::::::::::::::EL GANADOR ES[" + Personaje.player1.getNombre() + "]:::CON UNA VIDA DE :["+ Personaje.player1.getVida() + "]::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
							+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
					}
	}
	
	public static void turno0() {
		
		//Es el turno del player 2
		
		int exit = 0;
		do {
			
			
			System.out.println(Personaje.player2.getNombre() + " Elije entre: \n");		
			
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
					RecVida.recVida2();
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
			
			System.out.println(Personaje.player1.getNombre() + " Elije entre: \n");		
			
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
					RecVida.recVida1();
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
					Personaje.player2.setAtq1((int)Math.floor(Math.random()*(45 - 40 + 1) + 40 )); //Ataque entre 40 y 45 puntos
					Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq1()); 
					System.out.println( Personaje.player2.getNombre() + " :: ATAQUE BASICO 1 :: " + Personaje.player2.getAtq1() + " ptos. A " + Personaje.player1.getNombre() + " LE QUEDAN [" + Personaje.player1.getVida() + "] PUNTOS DE VIDA \n");
					turno=1;
					break;	
				case 2:
					Personaje.player2.setAtq2((int)Math.floor(Math.random()*(55 - 45 + 1) + 45 )); //Ataque entre 40 y 45 puntos
					Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq2()); 
					System.out.println( Personaje.player2.getNombre() + " :: ATAQUE BASICO 2 :: " + Personaje.player2.getAtq2() + " ptos. A " + Personaje.player1.getNombre() + " LE QUEDAN [" + Personaje.player1.getVida() + "] PUNTOS DE VIDA \n");
					turno=1;
					break;		
				case 3:
					Personaje.player2.setAtq3((int)Math.floor(Math.random()*(75 - 55 + 1) + 55 )); //Ataque entre 40 y 45 puntos
					Personaje.player1.setVida(Personaje.player1.getVida() - Personaje.player2.getAtq3()); 
					System.out.println( Personaje.player2.getNombre() + " :: ATAQUE BASICO 1 :: " + Personaje.player2.getAtq3() + " ptos. A " + Personaje.player1.getNombre() + " LE QUEDAN [" + Personaje.player1.getVida() + "] PUNTOS DE VIDA \n");
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
					Personaje.player1.setAtq1((int)Math.floor(Math.random()*(45 - 40 + 1) + 40 )); //Ataque entre 40 y 45 puntos
					Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq1()); 
					System.out.println( Personaje.player1.getNombre() + " :: ATAQUE BASICO 1 :: " + Personaje.player1.getAtq1() + " ptos. A " + Personaje.player2.getNombre() + " LE QUEDAN [" + Personaje.player2.getVida() + "] PUNTOS DE VIDA \n");
					turno=0;
					break;	
				case 2:
					Personaje.player1.setAtq2((int)Math.floor(Math.random()*(55 - 45 + 1) + 45 )); //Ataque entre 40 y 45 puntos
					Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq2()); 
					System.out.println( Personaje.player1.getNombre() + " :: ATAQUE BASICO 1 :: " + Personaje.player1.getAtq2() + " ptos. A " + Personaje.player2.getNombre() + " LE QUEDAN [" + Personaje.player2.getVida() + "] PUNTOS DE VIDA \n");
					turno=0;
					break;		
				case 3:
					Personaje.player1.setAtq3((int)Math.floor(Math.random()*(75 - 55 + 1) + 55 )); //Ataque entre 40 y 45 puntos
					Personaje.player2.setVida(Personaje.player2.getVida() - Personaje.player1.getAtq3()); 
					System.out.println( Personaje.player1.getNombre() + " :: ATAQUE BASICO 1 :: " + Personaje.player1.getAtq3() + " ptos. A " + Personaje.player2.getNombre() + " LE QUEDAN [" + Personaje.player2.getVida() + "] PUNTOS DE VIDA \n");
					turno=0;
					break;
				default:						
					System.out.println("\n \n ....¡¡Selecciona una opción valida 3!!....\n \n");						
					break;
				}

		}while(exit != 0);			
	}

	
	
}
