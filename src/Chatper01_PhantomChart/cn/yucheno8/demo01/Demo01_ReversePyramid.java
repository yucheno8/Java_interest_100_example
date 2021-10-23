package Chatper01_PhantomChart.cn.yucheno8.demo01;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/

/*
    问题描述：打印倒金字塔。
 */
public class Demo01_ReversePyramid {
    public static void main(String[] args) {
        int n, i, j, k;
        System.out.println("请输入倒金字塔的行高：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // 外层循环控制行高
        for (i = 1; i <= n; i++) {
            // 内层第一个循环控制空格的输入
            for (j = 1; j < i; j++)
                System.out.print(" ");
            // 内层第二个循环控制星号的输入
            for (k = 1; k <= 2 * n - (2 * i - 1); k++)
                System.out.print("☆");
            // 每行结束，输入换行
            System.out.println();
        }
    }
}
