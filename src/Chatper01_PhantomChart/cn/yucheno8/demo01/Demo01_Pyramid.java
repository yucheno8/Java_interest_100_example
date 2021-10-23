package Chatper01_PhantomChart.cn.yucheno8.demo01;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2021/10/22/022
 **/
public class Demo01_Pyramid {
    /*
        问题描述：打印出金字塔图案。
     */

    public static void main(String[] args) {
        int i, j, k, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金字塔高度：");
        n = scanner.nextInt();
        // 外层循环控制高度
        for (i = 1; i <= n; i++) {
            // 根据外层行号，输入星号左边空格
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 根据外层行号，输入星号
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("☆");
            }
            // 一行结束，换行
            System.out.println();
        }
    }
}
