import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame4 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame4(){
        this.setTitle("이벤트 예제");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button=new JButton("버튼을 눌러라~!");
        label= new JLabel("라벨은 못눌러");
        button.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               if(button==e.getSource()){
                   button.setText("버튼이 눌렸음");
                   label.setText("라벨도 변경가능");
               }
           }
        });

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
