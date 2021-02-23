package com.company;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static Scanner inputt = new Scanner(System.in);

    public static String MySql_Insert(){
        InputData input = new InputData();
        input.setSurname();
        input.setName();
        input.setMiddle_name();
        input.setPassport_id();
        input.setPassport_series();
        input.setAddress();
        input.setTelephone();
        input.setPosition_id();
        input.setDepartment_id();
        String SQL_Insert =  "INSERT employee(id,surname,name,middle_name,passport_id,passport_series,address,telephone,position_id,department_id) VALUES (0,'"+ input.getSurname() +"','"+ input.getName() +"','"+ input.getMiddle_name() +"','"+ input.getPassport_id() +"','"+ input.getPassport_series() +"','"+ input.getAddress() +"','"+ input.getTelephone() +"','"+ input.getPosition_id() +"','"+ input.getDepartment_id() +"')";
        return  SQL_Insert;
    }
    public static String MySql_Delete(){
        InputData input = new InputData();
        input.setId();
        String SQL_Updated = "DELETE FROM employee WHERE id = " + input.getId();
        return SQL_Updated;
    }
    public static String MySql_Updated(){
        InputData input = new InputData();
        input.setId();
        input.setSurname();
        input.setName();
        input.setMiddle_name();
        input.setPassport_id();
        input.setPassport_series();
        input.setAddress();
        input.setTelephone();
        input.setPosition_id();
        input.setDepartment_id();
        String Sql_Update = "UPDATE employee SET surname = '" + input.getSurname() +"', name = '" + input.getName() + "', middle_name = '" + input.getMiddle_name() + "', passport_id = " + input.getPassport_id() + ", passport_series = '" + input.getPassport_series() + "', address = '" + input.getAddress() + "', telephone = '" + input.getTelephone() + "', position_id = " + input.getPosition_id() +  ", department_id = " + input.getDepartment_id() + " WHERE id = " + input.getId();
        return Sql_Update;
    }



    public static void main(String[] args) throws ClassNotFoundException,SQLException {

        Connection connection = null;
        Statement statement = null;

        System.out.println("Registering JDBC driver...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/Pharmacy", "root", "TimaBezMozga1");

        System.out.println("Executing statement...");
        statement = connection.createStatement();

        String sql;
        sql = "SELECT * FROM employee";
        ResultSet resultSet = statement.executeQuery(sql);
        int rows;
        Scanner input = new Scanner(System.in);
        int x = 0;
        while (x!=5){
            System.out.println("Выберите пункт меню:");
            System.out.println("1 - Добавление данных в таблицу;");
            System.out.println("2 - Удаление данных из таблицы;");
            System.out.println("3 - Редактирование данных в таблице;");
            System.out.println("4 - Вывод данных;");
            System.out.println("5 - Выход.");
            x = input.nextInt();
            switch (x) {
                case 1:
                    rows = statement.executeUpdate(MySql_Insert());
                    System.out.printf("Added %d rows", rows);
                    System.out.println();
                    break;
                case 2:
                    rows = statement.executeUpdate(MySql_Delete());
                    System.out.printf("%d row(s) deleted", rows);
                    System.out.println();
                    break;
                case 3:
                    rows = statement.executeUpdate(MySql_Updated() );
                    System.out.printf("Updated %d rows", rows);
                    System.out.println();
                    break;
                case 4:
                    sql = "SELECT * FROM employee";
                    resultSet = statement.executeQuery(sql);
                    System.out.println("\nEmployee:");
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String surname = resultSet.getString("surname");
                        String name = resultSet.getString("name");
                        String middle_name = resultSet.getString("middle_name");
                        int passport_id = resultSet.getInt("passport_id");
                        String passport_series = resultSet.getString("passport_series");
                        String address = resultSet.getString("address");
                        String telephone = resultSet.getString("telephone");
                        int position_id = resultSet.getInt("position_id");
                        int department_id = resultSet.getInt("department_id");
                        System.out.println("\n================\n");
                        System.out.println("id: " + id);
                        System.out.println("Surname: " +surname);
                        System.out.println("Name: " + name);
                        System.out.println("Middle_name: " + middle_name);
                        System.out.println("Passport_id: " + passport_id);
                        System.out.println("Passport_series: " + passport_series);
                        System.out.println("Address: " + address);
                        System.out.println("Telephone: " + telephone);
                        System.out.println("Position_id: " + position_id);
                        System.out.println("Department_id: " + department_id);
                    }
                    System.out.println();
                    break;
                case 5:
                    x = 5;
                    break;
                default:
                    System.out.println("Вы выбрали неверный пункт меню!");
                    System.out.println();
                    break;
            }
        }
        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        statement.close();
        connection.close();
    }
}
