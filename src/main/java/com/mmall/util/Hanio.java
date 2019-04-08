package com.mmall.util;

/**
 * Created by tuyingjie on 2019/4/8.
 */
public class Hanio {
    public static void main(String[] args) {
        hanio(4, "A", "B", "C");
    }

    /**
     * 无论有多少盘子，都分割为上下两部分：上面的所有和最后一个
     *
     * @param n    共有N个盘子
     * @param from 开始的柱子
     * @param in   中间的主子
     * @param to   结束的主子
     */
    public static void hanio(int n, String from, String in, String to) {
        if (n == 1) {
            // 只有1个盘子
            System.out.println("第1个盘子从" + from + "移动到" + to);
        } else {
            //移动上面所有盘子到中间位置
            hanio(n - 1, from, to, in);
            //移动下面的盘子到目标位置
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            //把盘子从中间位置移动到目标位置
            hanio(n - 1, in, from, to);
        }
    }

}
