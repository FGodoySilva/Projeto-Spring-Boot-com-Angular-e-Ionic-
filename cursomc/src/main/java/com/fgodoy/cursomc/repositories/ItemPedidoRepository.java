/**
 * 
 */
package com.fgodoy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgodoy.cursomc.domain.ItemPedido;

/**
 * @author fgodoy
 *
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
