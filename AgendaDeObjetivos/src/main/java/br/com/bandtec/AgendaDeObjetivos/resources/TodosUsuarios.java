package br.com.bandtec.AgendaDeObjetivos.resources;

import br.com.bandtec.AgendaDeObjetivos.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bandtec.AgendaDeObjetivos.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface TodosUsuarios extends JpaRepository<User, Long> {

    @Query("select u from User u where u.credential = :credential")
    public User existe(@Param("credential") Credential credential);
}
