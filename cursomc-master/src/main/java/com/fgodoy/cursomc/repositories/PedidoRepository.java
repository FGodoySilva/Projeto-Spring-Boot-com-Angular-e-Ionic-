/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.Pedido;

/**
 * @author fgodoy
 *
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
