import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;

    public MyFrame3(){
        this.setTitle("이벤트 예제");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("버튼을 눌러라");
        label = new JLabel("어서 버튼을 눌러라");
        button.addActionListener(this);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(button == e.getSource()){
            button.setText("버튼 눌림");
            label.setText("라벨 바뀜");
        }
    }

}
