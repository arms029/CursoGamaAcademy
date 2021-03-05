package br.arms.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //classe mapeada no BD
@Table(name="usuario")
public class Usuario {


    public Usuario() {
        super();
    }
    
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

    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Compra> compras;

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

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

}
