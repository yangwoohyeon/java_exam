import javax.swing.*;

public class MyFrame5 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame5(){
        this.setTitle("이벤트 예제");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button=new JButton("버튼을 눌러라~!");
        label= new JLabel("라벨은 못눌러");
        button.addActionListener(e->{
            label.setText("버튼이 눌림!");
                });

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
