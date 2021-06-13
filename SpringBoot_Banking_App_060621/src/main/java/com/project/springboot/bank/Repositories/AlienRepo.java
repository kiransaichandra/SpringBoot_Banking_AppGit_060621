package com.project.springboot.bank.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.springboot.bank.Alien;

//@Repository
//@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
//Using above RepositoryRestResource we can avoid controller and system will auto generate paths.
public interface AlienRepo extends JpaRepository<Alien, Integer>{  //CrudRepository<Alien, Integer>{

	@Query(value="select * from ALIEN order by aid", nativeQuery=true)
	List<Alien> getAliens();

	@Query(value="select Top 2 * from ALIEN order by aid", nativeQuery=true)
	List<Alien> getTopTwoAliens();
	
	@Query(value="select Top 1 * from ALIEN where aid=?1 order by aid", nativeQuery=true)
	Alien getAlienByID(int aid);

}
