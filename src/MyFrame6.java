import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame6 extends JFrame {
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private JPanel panel;

    public MyFrame6(){
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(new MyListener6());
        button2 = new JButton("빨간색");
        button2.addActionListener(new MyListener6());
        panel.add(button1);
        panel.add(button2);
        this.add(panel);
        this.setVisible(true);

    }

    public class MyListener6 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(button1==e.getSource()){
                panel.setBackground(Color.YELLOW);
            }else if(button2==e.getSource()){
                panel.setBackground(Color.PINK);
            }
        }

    }
}
