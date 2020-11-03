/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.demo.Impl;


import com.example.demo.Calculator;
import org.springframework.stereotype.Component;

/**
 * @author Linyunqi
 * @date 2020/11/214:13
 */

@Component("CalculatorImpl")
public class CalculatorImpl implements Calculator {

    @Override
    public Double execute(Double num1, Double num2) {
        return num1 + num2;
    }
}