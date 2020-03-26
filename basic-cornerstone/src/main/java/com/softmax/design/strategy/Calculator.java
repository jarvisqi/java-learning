package com.softmax.design.strategy;

import java.math.BigDecimal;

/**
 * ��������
 *
 * @author Jarvis
 * @date 2019/10/22
 */
public class Calculator {

    /**
     * ӵ��ĳ���㷨����
     */
    private CalculateStrategy calculateStrategy;

    /**
     * �����㷨����
     *
     * @param calculateStrategy
     */
    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int getResult(int a, int b) {
        return calculateStrategy.calculate(a, b);
    }

    public BigDecimal getResult(float a, float b) {
        return calculateStrategy.calculate(a, b);
    }
}
