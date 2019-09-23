package br.com.bandtec.AgendaDeObjetivos.resources;

import br.com.bandtec.AgendaDeObjetivos.model.Objetivo;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface TodosObjetivos extends JpaRepository<Objetivo, Integer> {
	
    @Query("select o from Objetivo o where o.dataMaximaParaExecucao <= :data")
	public List<Objetivo> ate(@Param("data")LocalDate data);

}