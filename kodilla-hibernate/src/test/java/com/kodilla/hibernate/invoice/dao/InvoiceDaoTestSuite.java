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

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        List<Item> items = new ArrayList<>();
        Invoice invoice = new Invoice("01/18/05/2019", items);

        Product smartband = new Product("Smartband");
        Product smartwatch = new Product("Smartwatch");
        Product smartphone = new Product("Smartphone");
        Product laptop = new Product("Laptop");
        Product powerbank = new Product("Powerbank");

        Item itemSmartBand = new Item(smartband, new BigDecimal(150), 1, new BigDecimal(150));
        Item itemSmartWatch = new Item(smartwatch, new BigDecimal(300), 3, new BigDecimal(900));
        Item itemSmartphone = new Item(smartphone, new BigDecimal(1500), 2, new BigDecimal(3000));
        Item itemLaptop = new Item(laptop, new BigDecimal(4500), 1, new BigDecimal(4500));
        Item itemPowerbank = new Item(powerbank, new BigDecimal(50), 4, new BigDecimal(200));

        items.add(itemSmartBand);
        items.add(itemSmartWatch);
        items.add(itemSmartphone);
        items.add(itemLaptop);
        items.add(itemPowerbank);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int invoiceSize = invoice.getItems().size();
        Invoice invoiceData = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceData);
        Assert.assertEquals(invoiceSize, invoiceData);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
            invoiceDao.deleteById(invoiceSize);
        } catch (Exception e) {
            //do nothing
        }
    }
}
