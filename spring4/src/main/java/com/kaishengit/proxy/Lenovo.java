package com.kaishengit.proxy;

/**
 * @author jinjianghao
 * @date 2018/7/14
 */
public class Lenovo implements  Sale {

    @Override
    public void salePc() {
        System.out.println("联想厂商销售电脑一台");
    }

    @Override
    public int salePrice() {
        System.out.println("售价100元");
        return 100;
    }
}
