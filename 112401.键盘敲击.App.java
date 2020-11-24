import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_a = new JTextArea();
    JTextArea textArea_b = new JTextArea();


    //构造方法
    public App() {
        textArea_a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    textArea_b.append("单身狗\n");
                }

                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    textArea_b.setText("");
                }


            }
        });
    }
    //显示窗体方法
    void go(){
        //设置坐标跟大小
        textArea_a.setBounds(100,100,300,177);
        textArea_b.setBounds(100,300,300,177);
        //添加至myPanel中
        myPanel.add(textArea_a);
        myPanel.add(textArea_b);
        textArea_a.setBackground(Color.CYAN);
        textArea_b.setBackground(Color.LIGHT_GRAY);

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
