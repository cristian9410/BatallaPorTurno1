package com.cristianAlcantara.batallaPorTurno;
public class Personaje {
	
	private  String nombre;		//Nombre del personaje
	private  int vida;			//Vida del personaje
	private  int rVida;			//Recuperacion de Vida
	private  int atq1;			//Ataque Basico 1
	private  int atq2;			//Ataque Basico 2	
	private  int atq3;			//Ataque Super

    public Personaje(String nombre, int vida, int rVida, int atq1, int atq2, int atq3) {
        this.nombre = nombre;
        this.vida = vida;
        this.rVida = rVida;
        this.atq1 = atq1;
        this.atq2 = atq2;
        this.atq3 = atq3;
    }
        public static Personaje player1 = new Personaje("player", 20,20,20,20,20);
	public static Personaje player2 = new Personaje("player", 20,20,20,20,20);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getrVida() {
        return rVida;
    }

    public void setrVida(int rVida) {
        this.rVida = rVida;
    }

    public int getAtq1() {
        return atq1;
    }

    public void setAtq1(int atq1) {
        this.atq1 = atq1;
    }

    public int getAtq2() {
        return atq2;
    }

    public void setAtq2(int atq2) {
        this.atq2 = atq2;
    }

    public int getAtq3() {
        return atq3;
    }

    public void setAtq3(int atq3) {
        this.atq3 = atq3;
    }

    public static Personaje getPlayer1() {
        return player1;
    }

    public static void setPlayer1(Personaje player1) {
        Personaje.player1 = player1;
    }

    public static Personaje getPlayer2() {
        return player2;
    }

    public static void setPlayer2(Personaje player2) {
        Personaje.player2 = player2;
    }       
}
