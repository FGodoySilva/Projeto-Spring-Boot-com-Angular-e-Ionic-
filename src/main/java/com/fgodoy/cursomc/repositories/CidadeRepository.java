/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Cidade;

/**
 * @author fgodoy
 *
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
