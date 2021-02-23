package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.IOException;
import java.util.Calendar;
import java.sql.*;
import java.util.Scanner;

public class DataBase {
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/shop_bd1";
//    private static final String USER = "root";
//    private static final String PASS = "TimaBezMozga1";
//
//    public Connection connection = null;
//    public static Statement statement = null;
//    public static InputData input = new InputData();
//    public static int rows;
//
//    DataBase() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        connection = DriverManager.getConnection(DB_URL, USER, PASS);
//        statement = connection.createStatement();
//
//    }
//
//    public static String MySql_Insert() throws SQLException {
//        input.setSurname();
//        input.setName();
//        input.setMiddle_name();
//        input.setPassport_id();
//        input.setPassport_series();
//        input.setAddress();
//        input.setTelephone();
//        input.setPosition_id();
//        input.setDepartment_id();
//        String SQL_Insert =  "INSERT employee(id,surname,name,middle_name,passport_id,passport_series,address,telephone,position_id,department_id) VALUES (0,'"+ input.getSurname() +"','"+ input.getName() +"','"+ input.getMiddle_name() +"','"+ input.getPassport_id() +"','"+ input.getPassport_series() +"','"+ input.getAddress() +"','"+ input.getTelephone() +"','"+ input.getPosition_id() +"','"+ input.getDepartment_id() +"')";
//        rows = statement.executeUpdate(SQL_Insert);
//        System.out.printf("Added %d rows", rows);
//        return  SQL_Insert;
//    }
//    public static String MySql_Delete(){
//        System.out.println("Введите id записи: ");
//        int id = input.nextInt();
//        String SQL_Updated = "DELETE FROM employee WHERE id = " + id;
//        return SQL_Updated;
//    }
//    public static String MySql_Updated(){
//        System.out.println("Введите id записи для редактирования: ");
//        int id = input.nextInt();
//        System.out.println("Введите фамилию: ");
//        String surname = input.next();
//        System.out.println("Введите имя: ");
//        String name = input.next();
//        System.out.println("Введите отчество: ");
//        String middle_name = input.next();
//        System.out.println("Введите номер паспорта: ");
//        int passport_id = input.nextInt();
//        System.out.println("Введите серию паспорта: ");
//        String passport_series = input.next();
//        System.out.println("Введите адрес: ");
//        String address = input.next();
//        System.out.println("Введите телефон: ");
//        String telephone = input.next();
//        System.out.println("Введите id должности: ");
//        int position_id = input.nextInt();
//        System.out.println("Введите id отдела: ");
//        int department_id = input.nextInt();
//        String Sql_Update = "UPDATE employee SET surname = '" + surname +"', name = '" + name + "', middle_name = '" + middle_name + "', passport_id = " + passport_id + ", passport_series = '" + passport_series + "', address = '" + address + "', telephone = '" + telephone + "', position_id = " + position_id +  ", department_id = " + department_id + " WHERE id = " + id;
//        return Sql_Update;
//    }
    public void MySql_Write(){
//        Connection connection = null;
//        Statement statement = null;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//
//        sql = "SELECT * FROM employee";
//
//        resultSet = statement.executeQuery(sql);
//
//        System.out.println("Retrieving data from database...");
//        System.out.println("\nEmployee:");
//        while (resultSet.next()) {
//            id = resultSet.getInt("id");
//            String surname = resultSet.getString("surname");
//            String name = resultSet.getString("name");
//            String middle_name = resultSet.getString("middle_name");
//            int passport_id = resultSet.getInt("passport_id");
//            String passport_series = resultSet.getString("passport_series");
//            String address = resultSet.getString("address");
//            String telephone = resultSet.getString("telephone");
//            int position_id = resultSet.getInt("position_id");
//            int department_id = resultSet.getInt("department_id");
//
//            System.out.println("\n================\n");
//            System.out.println("id: " + id);
//            System.out.println("Surname: " +surname);
//            System.out.println("Name: " + name);
//            System.out.println("Middle_name: " + middle_name);
//            System.out.println("Passport_id: " + passport_id);
//            System.out.println("Passport_series: " + passport_series);
//            System.out.println("Address: " + address);
//            System.out.println("Telephone: " + telephone);
//            System.out.println("Position_id: " + position_id);
//            System.out.println("Department_id: " + department_id);
//        }
//        System.out.println();


    }
}
