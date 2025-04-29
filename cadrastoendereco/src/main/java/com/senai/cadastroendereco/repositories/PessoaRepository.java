package com.senai.cadastroendereco.repositories;

import com.senai.cadastroendereco.entities.Pessoa;

public interface PessoaRepository extends JpaResposy<Pessoa, Long> {
	// Busca  a pessoa pelo email
	Pessoa findByEmail(String email);
	

}
