/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Produto;

/**
 * @author fgodoy
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
