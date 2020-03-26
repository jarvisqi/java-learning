package com.softmax.design.strategy;

import java.math.BigDecimal;

/**
 * ������Խӿ�
 *
 * @author Jarvis
 * @date 2019/10/22
 */
public interface CalculateStrategy {
    /**
     * ����
     *
     * @param a
     * @param b
     * @return
     */
    int calculate(int a, int b);

    /**
     * ����
     *
     * @param a
     * @param b
     * @return
     */
    BigDecimal calculate(float a, float b);
}
