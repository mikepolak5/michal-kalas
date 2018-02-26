package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void findCompany() throws NotFoundException {
        //Given
        Company company1 = new Company("Milk co.");
        Company company2 = new Company("Meat co.");
        Company company3 = new Company("Game co.");

        //When
        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        List<Company> findCompany = facade.findCompany("som");

        //Then
        Assert.assertNotEquals(0, company1Id);
        Assert.assertNotEquals(0, company2Id);
        Assert.assertNotEquals(0, company3Id);
        Assert.assertEquals(0, findCompany.size());

        try {
            companyDao.delete(company1Id);
            companyDao.delete(company2Id);
            companyDao.delete(company3Id);
        } catch (Exception e) {
            //
        }
    }
}
