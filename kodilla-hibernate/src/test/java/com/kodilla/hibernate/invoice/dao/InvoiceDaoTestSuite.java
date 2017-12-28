package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //When
        Item cake = new Item(BigDecimal.valueOf(1000), 2, BigDecimal.valueOf(12));
        Item candy = new Item(BigDecimal.valueOf(23000), 10, BigDecimal.valueOf(20));
        Item gravy = new Item(BigDecimal.valueOf(3000), 15, BigDecimal.valueOf(80));

        Product product = new Product("cake");
        Product product2 = new Product("candy");
        Product product3 = new Product("gravy");

        Invoice invoice = new Invoice("one");
        Invoice invoice2 = new Invoice("two");
        Invoice invoice3 = new Invoice("three");

        invoice.getItems().add(cake);
        invoice2.getItems().add(candy);
        invoice3.getItems().add(gravy);
        invoice.getItems().add(gravy);
        invoice3.getItems().add(candy);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, invoice2Id);
        Assert.assertNotEquals(0, invoice3Id);

        //CleanUp
        try {
            invoiceDao.delete(invoice);
            invoiceDao.delete(invoice2);
            invoiceDao.delete(invoice3);
        } catch (Exception e) {
            //do nothing
        }



    }

}
