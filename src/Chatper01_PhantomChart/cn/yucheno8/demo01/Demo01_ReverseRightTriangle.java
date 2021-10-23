package Chatper01_PhantomChart.cn.yucheno8.demo01;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/
/*
    问题描述：输入倒直角三角形。
 */
public class Demo01_ReverseRightTriangle {
    public static void main(String[] args) {
        int n, i, j;
        System.out.println("请输入倒直角三角形的行高：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // 外层循环控制行高
        for (i = 1; i < n; i++) {
            // 内层循环控制星号的输入
            for (j = n; j >= i; j--) {
                System.out.print("☆");
            }
            // 每结束一行，输入换行
            System.out.println();
        }
    }
}
