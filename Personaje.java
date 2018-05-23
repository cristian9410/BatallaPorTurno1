package com.cristianAlcantara.batallaPorTurno;

public class Personaje {
	
	public  String nombre;		//Nombre del personaje
	public  int vida;			//Vida del personaje
	public  int rVida;			//Recuperacion de Vida
	public  int atq1;			//Ataque Basico 1
	public  int atq2;			//Ataque Basico 2	
	public  int atq3;			//Ataque Super
	
	
	public Personaje (String nombre, int vida,int rVida, int atq1, int atq2, int atq3) {
		this.nombre = nombre;
		this.vida = vida;
		this.rVida = rVida;
		this.atq1 = atq1;
		this.atq2 = atq2;		
		this.atq3 = atq3;
		
	}	
	
	public  static Personaje player1 = new Personaje("player", 20,20,20,20,20);
	public  static Personaje player2 = new Personaje("player", 20,20,20,20,20);
	
	

}
