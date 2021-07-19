/**
 * 
 */
package com.fgodoy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgodoy.cursomc.domain.Pedido;
import com.fgodoy.cursomc.repositories.PedidoRepository;
import com.fgodoy.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author fgodoy
 *
 */
@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository rep;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
