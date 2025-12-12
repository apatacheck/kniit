package org.kniit.lab11.task23;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private final UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAOImpl();
    }

    public void registerUser(String name, String email) throws Exception {
        if (userDAO.emailExists(email)) {
            throw new Exception("Email уже существует: " + email);
        }
        User user = new User(name, email);
        userDAO.create(user);
    }

    public List<User> listAllUsers() throws SQLException {
        return userDAO.findAll();
    }

    public void deleteUser(int id) throws Exception {
        User user = userDAO.findById(id);
        if (user == null) {
            throw new Exception("Пользователь с ID " + id + " не найден");
        }
        userDAO.delete(id);
    }

    public void updateUser(int id, String newName, String newEmail) throws Exception {
        User user = userDAO.findById(id);
        if (user == null) {
            throw new Exception("Пользователь с ID " + id + " не найден");
        }

        if (!user.getEmail().equals(newEmail)) {
            boolean emailExists = userDAO.emailExists(newEmail);
            if (emailExists) {
                throw new Exception("Email уже существует: " + newEmail);
            }
        }

        user.setName(newName);
        user.setEmail(newEmail);
        userDAO.update(user);
    }
}