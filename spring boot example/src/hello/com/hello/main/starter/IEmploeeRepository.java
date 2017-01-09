package com.hello.main.starter;

import org.springframework.data.repository.CrudRepository;

public interface IEmploeeRepository extends CrudRepository<Emploee, String> {

	public Emploee findById(String id);	
}
