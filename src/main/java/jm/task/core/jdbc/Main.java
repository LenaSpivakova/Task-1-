package jm.task.core.jdbc;
//Создание таблицы User(ов)
//Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
//Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
//Очистка таблицы User(ов)
//Удаление таблицы

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Alexey", "Sidorov", (byte) 20);
        userService.saveUser("Maria", "Smirnova", (byte) 23);
        userService.saveUser("Dmitry", "Suvorov", (byte) 33);
        userService.saveUser("Petr", "Ivanov", (byte) 25);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
