/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Categoria;

/**
 * @author fgodoy
 *
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
