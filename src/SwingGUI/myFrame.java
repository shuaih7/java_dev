package SwingGUI;
import general.Method;
import java.awt.*;

public class myFrame {
    public static void main(String[] args) {
        Method.print("开始创建一个Frame界面");

        Frame frame = new Frame("Frame");
        frame.setSize(150,120);
        frame.setBackground(new Color(127,127,127));
        frame.setLocation(500,500);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
