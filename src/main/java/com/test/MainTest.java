package com.test;

/**
 * Created by Сергей on 27.06.2015.
 */
public class MainTest {
    public static void main(String[] args) {
        TestUtil test = new TestUtil.Builder(240,8).calories(20).carbohydrate(55).sodium(33).build();
        System.out.println(test);
    }
}
