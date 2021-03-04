package br.arms.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> listarUsuario(){
        List<Usuario> listaUsuario = (List<Usuario>)usuarioRepo.findAll(); //findById busca pela PK
        return ResponseEntity.ok(listaUsuario); //OK = 200
    }

    
    @PostMapping("/loginemail")
    public ResponseEntity<Usuario> loginByEmail(@RequestBody Usuario user){
        Usuario userFound = usuarioRepo.findByEmailAndSenha(user.getEmail(),user.getSenha());

        if (userFound != null){
            userFound.setSenha("*****************");
            return ResponseEntity.ok(userFound); //OK = 200
        }

        return ResponseEntity.status(404).build(); //NOT FOUND = 404

    }
}
