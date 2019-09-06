package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchByFragment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchByFragmentTestSuite {

    @Autowired
    private SearchByFragment searchByFragment;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void RetrieveCompanyAndEmployeeLikeTest() {
        //Given
        Company samsung = new Company("Samsung");
        Company apple = new Company("Apple");
        Company xiaomi = new Company("Xiaomi");

        Employee michael = new Employee("Michael", "Foster");
        Employee michelle = new Employee("Michelle", "Brown");
        Employee alex = new Employee("Alex", "Lee");

//        samsung.getEmployees().add(michael);
//        apple.getEmployees().add(michelle);
//        xiaomi.getEmployees().add(alex);
//
//        michael.getCompanies().add(samsung);
//        michelle.getCompanies().add(apple);
//        alex.getCompanies().add(xiaomi);

        companyDao.save(samsung);
        companyDao.save(apple);
        companyDao.save(xiaomi);
        employeeDao.save(michael);
        employeeDao.save(michelle);
        employeeDao.save(alex);

        //When
        List<Company> companiesResult = searchByFragment.retrieveCompanyLike("aom");

        List<Company> employeesResult = searchByFragment.retrieveCompanyLike("mic");

        //Then
        Assert.assertEquals(1, companiesResult.size());
        Assert.assertEquals(2, employeesResult.size());

        //CleanUp
        try {
            companyDao.delete(samsung);
            companyDao.delete(apple);
            companyDao.delete(xiaomi);
            employeeDao.delete(michael);
            employeeDao.delete(michael);
            employeeDao.delete(alex);
        } catch (Exception e) {
            //do nothing
        }
    }
}
