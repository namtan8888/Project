package old;
import java.awt.*;
import javax.swing.*;
public class Scroll
{
    private void createAndDisplayGUI()
    {
        JFrame frame = new JFrame("JTextArea Scrollable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(1, 2, 2, 2));
        JTextArea tArea1 = new JTextArea();
        tArea1.setLineWrap(true);
        JTextArea tArea2 = new JTextArea();
        tArea2.setLineWrap(true);
        tArea1.setText("I got a long long line of text in my JTextArea");
        tArea2.setText("I got a long long line of text in my JTextArea");
        JScrollPane scroller1 = new JScrollPane();
        JScrollPane scroller2 = new JScrollPane();
        
        Container  p1 = new Container();
        p1.setMaximumSize(new Dimension(500, 500));
        JLabel l1 = new JLabel();
        l1.setMaximumSize(new Dimension(100, 100));
        l1.setMinimumSize(new Dimension(100,100));
        l1.setBackground(Color.CYAN);
        l1.setOpaque(true);
        JLabel l2 = new JLabel();
        l2.setMaximumSize(new Dimension(100, 100));
        l1.setMinimumSize(new Dimension(100,100));
        l2.setBackground(Color.RED);
        l2.setOpaque(true);
        p1.add(l1);
        p1.add(l2);
        scroller1.setViewportView(p1);
        scroller2.setViewportView(tArea2);
        contentPane.add(p1);
        contentPane.add(scroller2);
        frame.setContentPane(contentPane);
        frame.setSize(100, 100);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    
    }
    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Scroll().createAndDisplayGUI();
            }
        });
    }
}