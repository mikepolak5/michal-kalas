package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
                try {
                companyDao.delete(softwareMachineId);
                companyDao.delete(dataMaestersId);
                companyDao.delete(greyMatterId);
            } catch (Exception e) {
                //do nothing
            }
        }
    @Test
    public void testCompany() {
        Company company1 = new Company("Milk co.");
        Company company2 = new Company("Meat co.");
        Company company3 = new Company("Game co.");

        Employee employee1 = new Employee("John", "Stones");
        Employee employee2 = new Employee("Jimmy", "Gring");
        Employee employee3 = new Employee("Catherine", "Mo");

        company1.setEmployee(employee1);
        company2.setEmployee(employee2);
        company3.setEmployee(employee3);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);

        company1.setEmployee(employee1);
        company2.setEmployee(employee2);
        company3.setEmployee(employee3);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        int company1Id = company1.getId();
        int company2Id = company2.getId();
        int company3Id = company3.getId();

        int employee1Id = employee1.getId();
        int employee2Id = employee2.getId();
        int employee3Id = employee3.getId();

        //When
        List<Employee> lastname = employeeDao.retrieveByName("Stones");
        List<Company> threeWords = companyDao.retrieveComapniesWithThreeWordsForParam("Mea%");

        //Then
        try {
            Assert.assertEquals(8, lastname.size());
            Assert.assertEquals(8, threeWords.size());
        } finally {//CleanUp
/*            companyDao.delete(company1Id);
            companyDao.delete(company2Id);
            companyDao.delete(company3Id);

            employeeDao.delete(employee1Id);
            employeeDao.delete(employee2Id);
            employeeDao.delete(employee3Id);*/
        }
    }
    }