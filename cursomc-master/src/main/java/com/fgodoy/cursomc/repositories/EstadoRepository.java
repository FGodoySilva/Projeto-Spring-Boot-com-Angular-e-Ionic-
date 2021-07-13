/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Estado;

/**
 * @author fgodoy
 *
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
