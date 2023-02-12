import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Game {

	private JFrame frmFinanceSheetMaker;
	private JTextField INPUT1;
	private JTextField INPUT2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frmFinanceSheetMaker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFinanceSheetMaker = new JFrame();
		frmFinanceSheetMaker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFinanceSheetMaker.setType(Type.POPUP);
		frmFinanceSheetMaker.getContentPane().setForeground(new Color(0, 0, 0));
		frmFinanceSheetMaker.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 102, 0));
		frmFinanceSheetMaker.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INPUT BELOW ALL YOUR EXPENSES");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 11, 277, 33);
		panel.add(lblNewLabel);
		
		INPUT1 = new JTextField();
		INPUT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		INPUT1.setBounds(155, 55, 158, 33);
		panel.add(INPUT1);
		INPUT1.setColumns(10);
		
		JButton BUT1 = new JButton("SUBMIT");
		BUT1.setBackground(new Color(153, 153, 153));
		BUT1.setBounds(181, 99, 114, 33);
		panel.add(BUT1);
		
		JCheckBox CHECK1 = new JCheckBox("1 WEEK");
		CHECK1.setEnabled(false);
		CHECK1.setBackground(new Color(153, 153, 153));
		CHECK1.setBounds(191, 161, 97, 23);
		panel.add(CHECK1);
		
		JCheckBox CHECK2 = new JCheckBox("1 MONTH");
		CHECK2.setEnabled(false);
		CHECK2.setBackground(new Color(153, 153, 153));
		CHECK2.setBounds(191, 187, 97, 23);
		panel.add(CHECK2);
		
		JCheckBox CHECK3 = new JCheckBox("1 YEAR");
		CHECK3.setEnabled(false);
		CHECK3.setBackground(new Color(153, 153, 153));
		CHECK3.setBounds(191, 213, 97, 23);
		panel.add(CHECK3);
		
		BUT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CHECK1.setEnabled(true);
				CHECK2.setEnabled(true);
				CHECK3.setEnabled(true);
				
			}
		});
		
		
		JProgressBar bar = new JProgressBar();
		bar.setBounds(167, 256, 146, 14);
		panel.add(bar);
		
		INPUT2 = new JTextField();
		INPUT2.setBounds(100, 279, 277, 171);
		panel.add(INPUT2);
		INPUT2.setColumns(10);
		frmFinanceSheetMaker.setFont(new Font("Cambria", Font.BOLD, 20));
		frmFinanceSheetMaker.setTitle("Money Log");
		frmFinanceSheetMaker.setBounds(100, 100, 500,500);
	}
}
