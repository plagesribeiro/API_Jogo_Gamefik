package br.com.jogo.datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jogador")
public class Jogador implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6525418813165779073L;
	
	@Id
	private String nome;
    private int pontos;
    private int pos;

    public Jogador(String nome , int pontos){
        this.nome = nome;
        this.pontos = pontos;
        this.pos = -1;
    }

    public Jogador(){
    	this.nome = "///";
        this.pontos = -88888888;
        this.pos = -1;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPontos(){
        return this.pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    
    public int getPos(){
        return this.pos;
    }

    public void setPos(int pos){
        this.pos = pos;
    }
}
