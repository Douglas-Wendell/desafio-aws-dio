package me.dio.desafio_de_projeto1_DT2025.Repository;

import me.dio.desafio_de_projeto1_DT2025.Produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<me.dio.desafio_de_projeto1_DT2025.Produto.Produto> findByCategoria(String categoria);
}
