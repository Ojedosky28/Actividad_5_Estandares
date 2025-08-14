package co.edu.uniminuto.service;

import java.util.List;

import co.edu.uniminuto.entity.UsersData;

public interface UserServiceI {

	UsersData addtUser(UsersData user);

	UsersData upUser(UsersData user);

	int downUser(UsersData user);

	UsersData findByIdUser(int userId);

	List<UsersData> listAllUsers();

	UsersData findByIdEmail(String email);

	UsersData findIdByDocument(String userDocument);

}
