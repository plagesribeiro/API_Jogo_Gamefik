package br.com.jogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jogo.datasource.model.Jogador;
import br.com.jogo.repository.JogadorRepository;

@Service
public class BuscarJogador {
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	public List<Jogador> buscarTodosJogadores() {
		List<Jogador> lista = jogadorRepository.findAll();
		return lista;
	}
}
