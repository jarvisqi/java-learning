package com.softmax.design.strategy;

/**
 * ʵ���㷨�ӿ�
 *
 * @author Jarvis
 * @date 2019/10/22
 */
class Addition implements CalculateStrategy {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

/**
 * ʵ���㷨�ӿ�
 */
class Substanction implements CalculateStrategy {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
