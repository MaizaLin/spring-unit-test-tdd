/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.example.demo.Impl;


import com.example.demo.CalcModule;
import com.example.demo.Calculator;
import com.example.demo.OperatorEnum;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Linyunqi
 * @date 2020/11/214:13
 */

@Component("CalculatorImpl")
public class CalculatorImpl implements Calculator {

    @Autowired
    private BeanFactory beanFactory;

    @Override
    public Double execute(Double num1, Double num2, String operator) {

        OperatorEnum operatorEnum = OperatorEnum.getOperator(operator);

        if(operatorEnum == null) {
            throw new IllegalArgumentException("不支持的操作类型");
        }

        CalcModule calcModule = beanFactory.getBean(operatorEnum.getBeanName(), CalcModule.class);

        if(calcModule == null) {
            throw new IllegalArgumentException("不支持的操作类型");
        }

        Double result = calcModule.calc(num1, num2);

        return result;
    }
}