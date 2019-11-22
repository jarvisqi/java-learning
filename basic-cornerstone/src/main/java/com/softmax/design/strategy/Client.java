package com.softmax.design.strategy;

/**
 * �ͻ��˵���
 * ����ģʽ
 * ���µ��㷨�ǲ���Ҫ�ٸ����κ����д���ģ�ֻ��Ҫ��дһ���㷨����˷�Multiplication��
 * ��ʵ��calculate������������Ҫ����ֻ����װ��ȥ�����ʹ���ˡ�
 *
 * @author Jarvis
 * @date 2019/10/22
 */

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //�ӷ�������
        calculator.setCalculateStrategy(new Addition());
        int result = calculator.getResult(1, 2);
        System.out.println(result);

        //����
        calculator.setCalculateStrategy(new Substanction());
        result = calculator.getResult(1, 2);
        System.out.println(result);
    }
}
