package com.hello.main.starter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EmploeeService {
	@Autowired
	private IEmploeeRepository emploeeRepo;
		
	public List<Emploee> getEmploees(){
		 List<Emploee> emplooes = new ArrayList<Emploee>();
		 Iterable<Emploee> findAll = emploeeRepo.findAll();
		for (Emploee emploee : findAll) {
			emplooes.add(emploee);
		}
		return emplooes;
	}
	

	public Emploee getEmploee(String id) {
		return emploeeRepo.findOne(id);
	}


	public boolean addEmploee(Emploee emp) {
		emploeeRepo.save(emp);
		return true;
	}


	public boolean updateEmploee(Emploee emploee) {
		emploeeRepo.save(emploee);
		return true;
	}


	public boolean removeEmploee(String id) {
		try{
			emploeeRepo.delete(id);
		}catch(EmptyResultDataAccessException e){
			return false;
		}
		return true;
	}
	
}
