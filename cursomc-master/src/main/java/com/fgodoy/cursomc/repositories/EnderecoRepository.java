/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Endereco;

/**
 * @author fgodoy
 *
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
