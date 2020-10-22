package br.com.jogo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogo.datasource.model.Jogador;
//import br.com.jogo.repository.JogadorRepository;
import br.com.jogo.service.BuscarJogador;
import br.com.jogo.service.CadastroJogador;

@RestController 
@RequestMapping(value = "/api")
public class JogadorController {
	
	//@Autowired
	//private JogadorRepository jogadorRepository;
	
	@Autowired
	private BuscarJogador serviceBuscar;
	
	@Autowired
	private CadastroJogador serviceCadastrar;
	
	@GetMapping(path = "/jogadores")
	public List<Jogador> listarJogadores() {
		List<Jogador> lista = serviceBuscar.buscarTodosJogadores();
		Jogador[] array = new Jogador[lista.size()];
		
		for(int i=0 ; i<lista.size() ; i++) {
			array[lista.get(i).getPos() - 1] = lista.get(i); 
		}
		
		List<Jogador> organizada = Arrays.asList(array);
		
		return organizada;
	}
	
	@PostMapping(path = "/jogador/save")
	public void salvarJogagor(@RequestBody Jogador jogador) {
		List<Jogador> lista = serviceBuscar.buscarTodosJogadores();
		
		int n = lista.size();
		
		int posMaiorMenor  = 0;
		int maiorMenor = -999999999;
		
		Jogador j = new Jogador();
		
		
		if(lista.isEmpty()) {
			jogador.setPos(1);			
		}else {
			
			for(int i=0 ; i<n ; i++) {
				j = lista.get(i);
				
				if(j.getPontos() > jogador.getPontos()) {
					
					j.setPos(j.getPos() + 1);
					
				}else {
					
					if(j.getPontos() >= maiorMenor) {
						maiorMenor = j.getPontos();
						posMaiorMenor = j.getPos();
					}		
				}
			}
			
			jogador.setPos(posMaiorMenor+1);
		
		}
		
		serviceCadastrar.cadastro(jogador);
	
	}
	
}
