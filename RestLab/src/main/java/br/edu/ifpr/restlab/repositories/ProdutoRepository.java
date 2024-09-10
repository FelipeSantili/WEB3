package br.edu.ifpr.restlab.repositories;

import br.edu.ifpr.restlab.domain.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
