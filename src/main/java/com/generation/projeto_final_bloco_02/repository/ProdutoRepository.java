package com.generation.projeto_final_bloco_02.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.projeto_final_bloco_02.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	//select * from tb_produtos where preco > preco order by preco;
	 
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	//select * from tb_produtos where preco < preco order by preco desc;
	 
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
	//select * from produto	where preco < var order by preco desc;
	
}
