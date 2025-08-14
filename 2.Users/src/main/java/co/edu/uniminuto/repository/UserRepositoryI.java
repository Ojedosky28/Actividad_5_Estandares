package co.edu.uniminuto.repository;

import java.util.List;

import co.edu.uniminuto.entity.UsersData;

public interface UserRepositoryI {

	UsersData insertUser (UsersData user);
	UsersData updateUser (UsersData user);
	int deleteUser (UsersData user);
	UsersData findIdUser (int userId);
	List<UsersData> listUsers();
	UsersData findIdEmail (String email);
	UsersData findIdDocument (String userDocument);
	
}
