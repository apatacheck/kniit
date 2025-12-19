package org.kniit.lab11.task24;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private final UserDAO userDAO = new UserDAOImpl();
//проверяет уникальность email, добавляет пользователя
    public void registerUser(String name, String email) throws SQLException {
        if (userDAO.emailExists(email)) {
            System.out.println("Ошибка: email уже существует!");
            return;
        }
        User user = new User(name, email);
        userDAO.create(user);
        System.out.println("Пользователь добавлен успешно.");
    }
//возвращает список пользователей
    public void listAllUsers() throws SQLException {
        List<User> users = userDAO.findAll();
        if (users.isEmpty()) {
            System.out.println("Пользователи не найдены.");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
    //удаляет пользователя
    public void deleteUser(int id) throws SQLException {
        User user = userDAO.findById(id);
        if (user == null) {
            System.out.println("Пользователь с таким ID не найден.");
            return;
        }
        userDAO.delete(id);
        System.out.println("Пользователь удален.");
    }
//обновляет данные пользователя
    public void updateUser(int id, String newName, String newEmail) throws SQLException {
        User user = userDAO.findById(id);
        if (user == null) {
            System.out.println("Пользователь с таким ID не найден.");
            return;
        }
        if (!user.getEmail().equals(newEmail) && userDAO.emailExists(newEmail)) {
            System.out.println("Ошибка: email уже существует!");
            return;
        }
        user.setName(newName);
        user.setEmail(newEmail);
        userDAO.update(user);
        System.out.println("Данные пользователя обновлены.");
    }
}
