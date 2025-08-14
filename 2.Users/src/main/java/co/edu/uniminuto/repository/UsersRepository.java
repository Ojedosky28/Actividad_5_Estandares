package co.edu.uniminuto.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.jpa.JpaUser;

@Repository
public class UsersRepository implements UserRepositoryI {

	@Autowired
	JpaUser jpaUser;

	@Override
	public UsersData insertUser(UsersData user) {
		// TODO Auto-generated method stub
		return jpaUser.save(user);
	}

	@Override
	public UsersData updateUser(UsersData user) {
		// TODO Auto-generated method stub
		return jpaUser.save(user);
	}

	@Override
	public int deleteUser(UsersData user) {

		if (!jpaUser.save(user).equals(null))
			return 1;

		return 0;
	}

	@Override
	public UsersData findIdUser(int userId) {

		return jpaUser.findById(userId).orElse(null);
	}

	@Override
	public List<UsersData> listUsers() {

		return jpaUser.findAll();
	}

	@Override
	public UsersData findIdEmail(String email) {

		return jpaUser.findByUseEmail(email);
	}

	@Override
	public UsersData findIdDocument(String userDocument) {

		return jpaUser.findByUseDocument(userDocument);
	}

}
