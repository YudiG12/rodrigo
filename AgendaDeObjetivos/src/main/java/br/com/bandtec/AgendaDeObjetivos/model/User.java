package br.com.bandtec.AgendaDeObjetivos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="T_USUARIOS")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    
    @Embedded
    private Credential credential;
    private int age;
    private String name;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    public User(String login, String password) {
        super();
        this.id = id;
    }

    public User(Long id, String login, String password) {
        super();
        this.id = id;
    }
    
//    public User(int id, String login, String password, int age, String name) {
//        this.id = id;
//        this.login = login;
//        this.password = password;
//        this.age = age;
//        this.name = name;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    
}
