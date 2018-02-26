package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompany (String name) {
        if (companyDao.retrieveComapniesWithThreeWordsForParam(name).size() == 0) {
            LOGGER.info(NotFoundException.ERR_COMPANY_NOT_FOUND);
        }
        return companyDao.retrieveComapniesWithThreeWordsForParam(name);
    }

    public List<Employee> findEmployee (String name) {
        if (employeeDao.retrieveByName(name).size() == 0) {
            LOGGER.info(NotFoundException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employeeDao.retrieveByName(name);
    }
}
