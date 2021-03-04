package br.arms.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.arms.spring02.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario,Integer>{

}

