package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        Display display = applicationContext.getBean(Display.class);
        //When
        double resultAdd = calculator.add(1, 2);
        double resultSub = calculator.sub(2, 1);
        double resultDiv = calculator.div(10, 2);
        double resultMul = calculator.mul(10, 10);
        //Then
        Assert.assertEquals(3, resultAdd, 0);
        Assert.assertEquals(1, resultSub, 0);
        Assert.assertEquals(5, resultDiv, 0);
        Assert.assertEquals(100, resultMul, 0);

    }
}
