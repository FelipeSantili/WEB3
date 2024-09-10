package br.edu.ifpr.restlab.resources;

import br.edu.ifpr.restlab.domain.models.Produto;
import br.edu.ifpr.restlab.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    ProdutoRepository repository;

    @GetMapping
    public ResponseEntity<List<Produto>> obterProdutos(){

        Produto p1 = new Produto("Monitor", 500.00, LocalDate.now());
        Produto p2 = new Produto("Teclado", 100.00, LocalDate.now());
        Produto p3 = new Produto("Mouse", 50.00, LocalDate.now());

        List<Produto> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Integer id){

        return new Produto("Monitor", 500.00, LocalDate.now());
    }

    public void addProduto(Produto produto){
        repository.save(produto);
    }
}
