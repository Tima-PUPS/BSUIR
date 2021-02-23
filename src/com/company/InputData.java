package com.company;

import java.util.Scanner;

public class InputData {

    public Scanner input = new Scanner(System.in);
    private int id;
    private String surname;
    private String name;
    private String middle_name;
    private int passport_id;
    private String passport_series;
    private String address;
    private String telephone;
    private int position_id;
    private int department_id;

    public int getId() {
        return id;
    }

    public void setId() {
        System.out.println("Введите id: ");
        int id = input.nextInt();
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        System.out.println("Введите фамилию: ");
        String surname = input.next();
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Введите имя: ");
        String name = input.next();
        this.name = name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name() {
        System.out.println("Введите отчество: ");
        String middle_name = input.next();
        this.middle_name = middle_name;
    }

    public int getPassport_id() {
        return passport_id;
    }

    public void setPassport_id() {
        System.out.println("Введите номер паспорта: ");
        int passport_id = input.nextInt();
        this.passport_id = passport_id;
    }

    public String getPassport_series() {
        return passport_series;
    }

    public void setPassport_series() {
        System.out.println("Введите серию паспорта: ");
        String passport_series = input.next();
        this.passport_series = passport_series;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("Введите адрес: ");
        String address = input.next();
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone() {
        System.out.println("Введите телефон: ");
        String telephone = input.next();
        this.telephone = telephone;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id() {
        System.out.println("Введите id должности: ");
        int position_id = input.nextInt();
        this.position_id = position_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id() {
        System.out.println("Введите id отдела: ");
        int department_id = input.nextInt();
        this.department_id = department_id;
    }


}
