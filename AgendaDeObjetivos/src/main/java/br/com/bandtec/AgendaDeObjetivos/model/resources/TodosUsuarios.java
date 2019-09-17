package br.com.bandtec.AgendaDeObjetivos.model.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bandtec.AgendaDeObjetivos.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface TodosUsuarios extends JpaRepository<User, Integer> {

    @Query("select u from User u where login = :login and senha = :senha")
    public List<User> existe(@Param("login")String login, @Param("senha")String senha);
    
}
