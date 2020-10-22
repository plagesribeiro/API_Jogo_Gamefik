package br.com.jogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jogo.datasource.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador , String> {
	
}
