package co.edu.uniminuto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.repository.UserRepositoryI;

@Service
public class UserService implements UserServiceI {

	@Autowired
	UserRepositoryI dao;

	@Override
	public UsersData addtUser(UsersData user) {
		// Validacion de existencia de email y documento

		if (!(dao.findIdDocument(user.getUseDocument()).equals(null)
				&& dao.findIdEmail(user.getUseEmail()).equals(null))) {

			return dao.insertUser(user);
		}
		return null;
	}

	@Override
	public UsersData upUser(UsersData user) {
		if (dao.findIdDocument(user.getUseDocument()) !=null && dao.findIdUser(user.getUseId())!=null) {
			return dao.updateUser(user);
		}
		return null;
	}

	@Override
	public int downUser(UsersData user) {
		if (dao.findIdDocument(user.getUseDocument()).equals(null)) {
			return 0;
		}
		return dao.deleteUser(user);
	}

	@Override
	public UsersData findByIdUser(int userId) {

		return dao.findIdUser(userId);
	}

	@Override
	public List<UsersData> listAllUsers() {

		return dao.listUsers();
	}

	@Override
	public UsersData findByIdEmail(String email) {

		return dao.findIdEmail(email);
	}

	@Override
	public UsersData findIdByDocument(String userDocument) {

		return dao.findIdDocument(userDocument);
	}

}
