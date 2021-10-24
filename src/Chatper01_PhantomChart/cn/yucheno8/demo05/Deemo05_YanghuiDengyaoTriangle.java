package Chatper01_PhantomChart.cn.yucheno8.demo05;

import java.util.Scanner;

/**
 * @author yucheno8
 * @date 2021/10/24/024
 **/

/*
    问题描述：输出等腰杨辉三角。
 */
public class Deemo05_YanghuiDengyaoTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入等腰杨辉三角的行高：");
        int m = scanner.nextInt(); // 从键盘接收输入
        int n = 2 * m - 1; // 列元素个数

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) { // 外循环控制行
            for (int j = 0; j < n; j++) { // 内循环控制列
                if (j < (m - i - 1) || (j >= (m + i))) { // 输出等腰三角形两边空格
                    System.out.print("   ");
                } else if ((j == (m - i - 1)) || (j == (m + i - 1))) { // 计算并输出等腰三角形的两个腰
                    arr[i][j] = 1;
                    System.out.printf("%-3d", arr[i][j]);
                } else if ((i + j) % 2 == 0 && m % 2 == 0 || (i + j) % 2 == 1 && m % 2 == 1) {
                    System.out.print("   "); // 中间默认数字0用空格替换
                } else { // 计算并输出中间数字
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                    System.out.printf("%-3d", arr[i][j]);
                }
            }
            System.out.println(); // 输出换行

        }
    }

}
