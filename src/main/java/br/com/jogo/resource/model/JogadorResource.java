package br.com.jogo.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadorResource {
	
	@JsonProperty("nome_jogador")
	private String nome;
    private int pontos;
    private int pos;

    public JogadorResource(String nome , int pontos , int pos){
        this.nome = nome;
        this.pontos = pontos;
        this.pos = pos;
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
