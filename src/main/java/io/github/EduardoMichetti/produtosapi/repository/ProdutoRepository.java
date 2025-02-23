package io.github.EduardoMichetti.produtosapi.repository;

import io.github.EduardoMichetti.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, String> {
}
