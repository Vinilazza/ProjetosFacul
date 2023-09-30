package Game;

import java.util.Random;

public class Soldado {
	private String nome;
	private int vida;
	private String arma;
	
	public Soldado(String nome, int vida, String arma) {
		this.nome = nome;
		this.vida = vida;
		this.arma = arma;
	}
	
    public void moverPlayer(Soldado player) {
        Random rand = new Random();
        int move = rand.nextInt(10) + 1; 
        System.out.println(player.getNome() + " se moveu " + move + " espaços.");
    }

    public void atacarPlayer(Soldado inimigo, Soldado player) {
        Random rand = new Random();
        int chanceAtaque = rand.nextInt(100);
        if (chanceAtaque < 30) { 
            int dano = rand.nextInt(10) + 1;
            System.out.println(inimigo.getNome() + " ataca " + player.getNome() + " causando " + dano + " de dano.");
            player.inimigoVida(dano);
        }
    }
	
	public void atack(Soldado inimigo, String arma) {
        Random rand = new Random();
        int dano = rand.nextInt(10) + 1;
        System.out.println(this.nome + " ataca " + inimigo.nome + " com " + this.arma + " causando " + dano + " de dano.");
        inimigo.inimigoVida(dano);
	}
	   public void contraAtacar(Soldado inimigo) {	
	        Random rand = new Random();
	        int dano = rand.nextInt(10) + 1;
	        System.out.println(this.nome + " contra-ataca " + inimigo.nome + " causando " + dano + " de dano.");
	        inimigo.inimigoVida(dano);
	    }
	public void inimigoVida(int dano) {
		this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado.");
        }
	}
	public int healPlayer(Soldado player) {
	    if (this.vida > 0 && this.vida < 100) {
	        this.vida += 10;
	        if (this.vida > 100) {
	            this.vida = 100; 
	        }
	    }
	    return this.vida; 
	}
    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public String getNome() {
        return nome;
    }

    public String getArma() {
        return arma;
    }
    public int getVida() {
    	
        return vida;
    }
}
