package br.com.bandtec.AgendaDeObjetivos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    
    @JsonProperty
    private String login;
    
    @JsonProperty
    private String senha;
    
    @JsonProperty
    private int age;
     
    @JsonProperty
    private String name;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public User(int id, String login, String senha, int age, String name) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.age = age;
        this.name = name;
    }
    
    

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    
}
