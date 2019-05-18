package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		
		Categoria categoria = categoriaRepository.findOne(id);
		if (categoria == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
						+ ", Tipo: " + Categoria.class.getName());
		}
		
		return categoria;
	}
}
