package Chatper01_PhantomChart.cn.yucheno8.demo06;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2021/10/24/024
 **/

/*
    问题描述：打印国际象棋盘。
 */
public class Demo06_ChessBoard {
    public static void main(String[] args) {
        JFrame f = new JFrame("国际象棋棋盘");

        /*
                窗口属性设置包括窗口大小、位置等设置，其中窗口大小要满足能够容纳黑白方格，
            这里指定黑白方格大小为：20*20, 那么窗口属性大小大概为：168*195。窗口位置可以随
            便指定，这里指定为：（350,200)。
         */
        // 窗口属性设置
        f.setSize(168, 159); // 边框的长和宽

        // 窗口位置设置
        Point point = new Point(350, 200);
        f.setLocation(point);

        int grids = 8; // 行数和列数
        int gridsize = 20; // 单元格的高和宽

        for (int i = 0; i < grids; i++) {
            for (int j = 0; j < grids; j++) {
                JLabel l = new JLabel(); // 生成标签实例
                l.setSize(gridsize, gridsize); // 设置标签大小
                l.setLocation(i * gridsize, j * gridsize); // 设置标签位置
                if ((i + j) % 2 == 0) { // 当小方格的坐标刚好是偶数时
                    l.setBackground(Color.black); // 设置方格为黑色
                    l.setOpaque(true); // 设置为不透明
                } else {
                    l.setBackground(Color.white); // 设置方格为白色
                    l.setOpaque(true); // 设置为不透明
                }
                l.setBorder(BorderFactory.createLineBorder(Color.black)); // 设置边界为黑色

                f.add(l); // 添加标签
            }
        }
        f.setVisible(true); // 显示窗口
    }
}
