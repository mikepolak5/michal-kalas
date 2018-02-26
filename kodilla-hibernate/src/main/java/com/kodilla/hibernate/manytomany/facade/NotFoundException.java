package com.kodilla.hibernate.manytomany.facade;

public class NotFoundException extends Exception {
    public static final String ERR_EMPLOYEE_NOT_FOUND = "Error, employee not found.";
    public static final String ERR_COMPANY_NOT_FOUND = "Error, company not found.";

    public NotFoundException (String message) {
        super(message);
    }
}
