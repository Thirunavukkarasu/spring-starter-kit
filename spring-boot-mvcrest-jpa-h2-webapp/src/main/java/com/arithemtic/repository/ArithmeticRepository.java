package com.arithemtic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arithemtic.model.Arithmetic;

@Repository
public interface ArithmeticRepository extends CrudRepository<Arithmetic,String>{
	public void deleteById(Integer id);
}
