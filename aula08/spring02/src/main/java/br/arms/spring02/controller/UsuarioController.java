package br.arms.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.arms.spring02.model.Usuario;
import br.arms.spring02.repository.UsuarioRepo;

@RestController
@CrossOrigin("*") //requisições de qualquer origem
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepo usuarioRepo;
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable int id){
        Usuario usuarioEncontrado = usuarioRepo.findById(id).orElse(null); //findById busca pela PK

        if (usuarioEncontrado != null)
            return ResponseEntity.ok(usuarioEncontrado); //OK = 200

        return ResponseEntity.notFound().build(); //NOT FOUND = 404
    }
}
