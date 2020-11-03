/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.demo.Impl;

import com.example.demo.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Linyunqi
 * @date 2020/11/214:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class CalculatorImplTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    @Qualifier("CalculatorImpl")
    Calculator calculator;

    @Test
    public void TestAdd() {
        Assert.assertTrue("简单加法测试", calculator.execute(1D, 1D, "Add").equals(2D));
    }

    @Test
    public void TestSub() {
        Assert.assertTrue("简单减法测试", calculator.execute(2D, 1D, "Sub").equals(1D));
    }

}