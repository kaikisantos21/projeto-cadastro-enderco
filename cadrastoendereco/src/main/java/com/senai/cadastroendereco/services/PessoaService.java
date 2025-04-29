package com.senai.cadastroendereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Pessoa;
import com.senai.cadastroendereco.repositories.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	//Criar uma nova pessoa
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
		
	}
	
	//Buscar uma pessoa pelo ID
	public Pessoa buscarPorId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
		
	}
	
	//Listar todas as pessoas 
	public List<Pessoa> listarTodas(){
		return pessoaRepository.findAll();
		
	}
	
	//Excluir uma pessoa
	public void deletarPorId(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	//Buscar pessoa por email
	public Pessoa bsucarPorEmail(String email) {
		return pessoaRepository.findByEmail(email);
		
		
	// Verificar email e senha do login
		
	public Pessoa autenticarPessoa(String email, String senha) {
		
		//Verificar existencia do email
		Pessoa pessoa = pessoaRepository.findByEmail(email);
		
		//Se qualquer dado da pessoa for nulo e o getsenha seja igual a senha
		if (pessoa != null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		}else {
			return  null;
		}
		
	}
	
	// Deletar pessoa por ID
	public void deletarPorId1(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	}



