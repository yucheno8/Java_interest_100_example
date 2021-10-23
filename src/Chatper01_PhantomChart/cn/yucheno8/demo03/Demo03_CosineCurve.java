package Chatper01_PhantomChart.cn.yucheno8.demo03;

import java.applet.Applet;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/

/*
    问题描述：在屏幕上画出余弦函数cos(x)曲线。
    问题分析：
        连续的曲线是由点组成的，点与点之间距离比较近，看上去就是曲线了，画图的关键
    是画出每个点。Java 提供了三角函数方法，直接调用cos()方法就可以根据x坐标计算出y
    坐标。需要注意的是，cos()方法输入的参数是弧度值，要进行坐标转换，同样，得到的结
    果也要进行转换处理。这条余弦曲线有两个周期，我们可以把x坐标控制在0~720。
 */

// 1. 确定程序框架
public class Demo03_CosineCurve extends Applet {
    int x, y;

    // 当一个Applet被系统调用时，系统会自动调用start()方法
    @Override
    public void start() {
        Graphics graphics = getGraphics(); // 画画之前，必须先取得画笔
        // 2. 画x轴
        for (int x = 0; x <= 750; x += 1) {
            graphics.drawString(".", x, 200);
        }
        // 实现x轴上的箭头
        for (x = 740; x <= 750; x += 1) {
            graphics.drawString(".", x, x - 550);
            graphics.drawString(".", x, 950 - x);
        }
        // 2. 画y轴
        for (y = 0; x <= 385; y += 1) {
            graphics.drawString(".", 360, y);
        }
        // 实现y轴上的箭头
        for (x = 360; x <= 370; x += 1) {
            graphics.drawString(".", x - 10, 375 - x);
            graphics.drawString(".", x, x - 355);
        }
        // 3. 画cos(x)曲线
        // 两个周期，即4π
        for (x = 0; x <= 720; x += 1) {
            double a = Math.cos(x * Math.PI / 180 + Math.PI);
            y = (int) (200 + 80 * a); // 放大80倍并向下平移200个像素
            graphics.drawString("x", x, y);
        }
    }

}
