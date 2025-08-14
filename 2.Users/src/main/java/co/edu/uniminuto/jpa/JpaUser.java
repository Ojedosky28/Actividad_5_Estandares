package co.edu.uniminuto.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniminuto.entity.UsersData;

public interface JpaUser extends JpaRepository<UsersData, Integer>{

	UsersData findByUseEmail(String useEmail);
	UsersData findByUseDocument(String useDocument);
}
