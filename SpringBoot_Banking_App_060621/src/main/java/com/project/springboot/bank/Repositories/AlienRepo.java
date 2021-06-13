package com.project.springboot.bank.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.springboot.bank.Alien;

//@Repository
public interface AlienRepo extends CrudRepository<Alien, Integer>{  //JpaRepository<Alien, Integer>{

	@Query(value="select * from ALIEN order by aid", nativeQuery=true)
	List<Alien> getAliens();

	@Query(value="select Top 2 * from ALIEN order by aid", nativeQuery=true)
	List<Alien> getTopTwoAliens();
	
	@Query(value="select Top 1 * from ALIEN where aid=?1 order by aid", nativeQuery=true)
	Alien getAlienByID(int aid);

}
