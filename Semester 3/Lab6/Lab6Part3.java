import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Lab6Part3 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new Lab6Part3();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

    Container contentPane = getContentPane();
    JPanel panel = new JPanel();
    JPanel volumePanel = new JPanel();
    JPanel balancePanel = new JPanel();

    JSlider volumeSlider = new JSlider();
    JSlider balanceSlider = new JSlider();

    JLabel volumeLabel = new JLabel();
    JLabel balanceLabel = new JLabel();

	public Lab6Part3() {

		volumeSlider.setMaximum(30);
		volumeSlider.setMinimum(0);
		volumeSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				volumeLabel.setText("Volume: " + volumeSlider.getValue());

			}
		});

		balanceSlider.setMaximum(5);
		balanceSlider.setMinimum(-5);
		balanceSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				balanceLabel.setText("Balance: " + balanceSlider.getValue());

			}
		});

		volumePanel.add(volumeSlider);
		volumePanel.add(volumeLabel);
		panel.add(volumePanel);

		balancePanel.add(balanceSlider);
		balancePanel.add(balanceLabel);
		panel.add(balancePanel);

		contentPane.add(panel);

		setSize(300,100);
		setVisible(true);
	}


}
