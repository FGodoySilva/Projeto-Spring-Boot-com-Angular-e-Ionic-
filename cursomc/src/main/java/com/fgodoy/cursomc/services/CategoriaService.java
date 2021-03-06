/**
 * 
 */
package com.fgodoy.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fgodoy.cursomc.domain.Categoria;
import com.fgodoy.cursomc.repositories.CategoriaRepository;
import com.fgodoy.cursomc.services.exception.DataIntegrityException;
import com.fgodoy.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author fgodoy
 *
 */
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository rep;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public Categoria insert(Categoria obj) {
		// null para que o save() não entenda como update
		obj.setId(null);
		return rep.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return rep.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			rep.deleteById(id);	
		}catch(DataIntegrityViolationException e) {
			// Tratando nas exceptions dos services
			throw new DataIntegrityException("Não é possível "
					+ "excluir uma categoria que possui produtos");
		}
	}	
}
