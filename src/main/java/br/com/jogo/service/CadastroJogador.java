package br.com.jogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jogo.repository.JogadorRepository;
import br.com.jogo.datasource.model.Jogador;

@Service
public class CadastroJogador {
	@Autowired
	private JogadorRepository jogadorRepository;
	
	public void cadastro(Jogador jogador) {
		jogadorRepository.saveAndFlush(jogador);
	}
}
