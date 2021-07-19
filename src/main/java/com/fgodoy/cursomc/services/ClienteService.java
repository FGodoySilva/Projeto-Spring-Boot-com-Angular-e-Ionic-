/**
 * 
 */
package com.fgodoy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgodoy.cursomc.domain.Cliente;
import com.fgodoy.cursomc.repositories.ClienteRepository;
import com.fgodoy.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author fgodoy
 *
 */
@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository rep;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
