package Chatper01_PhantomChart.cn.yucheno8.demo07;

import javax.swing.*;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2021/10/24/024
 **/

/*
    问题描述：打印心形图。
    问题分析：
        心形图案物实现，重点是心形函数r=a(l-siri0) 据说这是笛卡尔死前寄出的最后一封
    情书的内容，这里面隐藏着一个刻骨铭心的秘密：“一生只为等待能手绘这个函数给我的
    人”。心形函数要做直角坐标系转换，然后投影到xOy 平面上，就可以调用画椭圆方法来
    实现画心形图案。
 */
public class Demo07_HeartShaped extends JFrame{

    public static void main(String[] args) {
        new MyFrame("心形图").launch();
    }

    static class MyFrame extends JFrame {


        public MyFrame(String s) {
            super(s);
        }

        public void launch() {
            int width, height;
            Image image; // 缓冲区对象

            Graphics g1;
            setBackground(Color.black);
            setSize(350, 310);
            setVisible(true);


            Point point = new Point(350, 200);
            setLocation(point);
            width = getSize().width; // 获得窗口宽度
            height = getSize().height;
            image = createImage(width, height); // 创建图像对象
            g1 = image.getGraphics();

            g1.clearRect(0, 0, width, height);
            g1.setColor(Color.red);

            double x, y, r;

            for (int i = 0; i <= 90; i++) { // 横向变化
                for (int j = 0; j <= 90; j++) { // 竖向变化
                    // 转换为直角坐标
                    r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 18;
                    // 为了在中间显示，加了偏移量
                    x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + width / 2;
                    y = -r * Math.sin(Math.PI / 45 * j) + height / 4;

                    g1.fillOval((int) x, (int) y, 2, 2);
                    g1.fillOval((int) x, (int) y, 1, 1);
                }
            }
            // 显示缓存区的可变Image对象
            g1.drawImage(image, 0, 0, this);

        }
    }

}
