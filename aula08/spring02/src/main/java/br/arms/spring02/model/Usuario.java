package br.arms.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //classe mapeada no BD
@Table(name="usuario")
public class Usuario {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    @Column(name="id") //nome da coluna
    private int id;

    @Column(name="nome", length = 150, nullable = false) 
    private String name;

    @Column(name="cpf", length = 11, nullable = false, unique = true) 
    private String cpf;

    @Column(name="email", length = 30, nullable = false, unique = true) 
    private String email;

    @Column(name="senha", length = 20, nullable = false) 
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}
