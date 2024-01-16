package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Login;
import java.util.List;


public interface ILoginRepo extends JpaRepository<Login, Integer> {
	
	@Query("SELECT p FROM Login p WHERE p.email=?1 AND pwd=?2")
	List<Login> findByEmailAndfindByPwd(String email,String pwd);

}
