

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextArea;

public class Case_study {
	String iTax, iSubTotal, iTotal;
	double [] itemcost = new double[40];

	protected static final String False = null;
	private JFrame frmFoodClub;
	private JTextField textField_24;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField tax;
	private JTextField subtotal;
	private JTextField total;
	
	private JFrame frame;
	protected Component receipt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Case_study window = new Case_study();
					window.frmFoodClub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Case_study() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFoodClub = new JFrame();
		frmFoodClub.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				textField_6.setEnabled(false);
				textField_7.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				
			}
});
		frmFoodClub.setTitle("Food Club");
		frmFoodClub.getContentPane().setBackground(new Color(255, 255, 255));
		frmFoodClub.setBounds(0, 0, 1370,700);
		frmFoodClub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFoodClub.getContentPane().setLayout(new GridLayout(1, 3, 5, 5));
		frmFoodClub.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmFoodClub.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton but1 = new JButton("Mozzarella sticks (O1) ");
		
		panel.add(but1);
		
		JButton but2 = new JButton("Onion rings (O2)");

		panel.add(but2);
		
		JButton but3 = new JButton("Jalapeno poppers (O3)");
		panel.add(but3);
		
		JButton but4 = new JButton("Buffalo wings (O4)");
		panel.add(but4);
		
		JButton but5 = new JButton("Classic cheeseburger (O5)");
		panel.add(but5);
		
		JButton but6 = new JButton("Bacon cheeseburger (O6)");
		panel.add(but6);
		
		JButton but7 = new JButton("Veggie burger (O7)");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(but7);
		
		JButton but8 = new JButton("BBQ bacon burger (O8)");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(but8);
		
		JButton but9 = new JButton("Grilled chicken sandwich (O9)");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(but9);
		
		JButton but10 = new JButton("Turkey club sandwich (O10)");
		but10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(but10);
		
		JButton but11 = new JButton("Tuna melt (O11)");
		panel.add(but11);
		
		JButton but12 = new JButton("BBQ pulled pork sandwich (O12)");
		panel.add(but12);
		
		JButton but13 = new JButton("French fries (O13)");
		panel.add(but13);
		
		JButton but14 = new JButton("Curly fries (O14)");
		panel.add(but14);
		
		JButton but15 = new JButton("Onion rings (O15)");
		panel.add(but15);
		
		JButton but16 = new JButton("Fried pickles (O16)");
		panel.add(but16);
		
		JButton but17 = new JButton("Soft serve ice cream (O17)");
		panel.add(but17);
		
		JButton but18 = new JButton("Chocolate milkshake (O18)");
		panel.add(but18);
		
		JButton but19 = new JButton("Banana split (O19)");
		panel.add(but19);
		
		JButton but20 = new JButton("Brownie sundae (O-20)");
		panel.add(but20);
		
		JButton but21 = new JButton("Soft drinks (Coke, Sprite, etc.) (O21)");
		panel.add(but21);
		
		JButton but22 = new JButton("Lemonade (O22)");
		panel.add(but22);
		
		JButton but23 = new JButton("Iced tea (O23)");
		panel.add(but23);
		
		JButton but24 = new JButton("Coffee (O-24)");
		panel.add(but24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmFoodClub.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox O1 = new JCheckBox("O1");
		
		O1.setEnabled(false);
		O1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O1.setBounds(0, 3, 221, 27);
		panel_3.add(O1);
		
		JCheckBox O2 = new JCheckBox("O2");

		O2.setEnabled(false);
		O2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O2.setBounds(0, 30, 221, 27);
		panel_3.add(O2);
		
		JCheckBox O3 = new JCheckBox("O3");
		O3.setEnabled(false);
		O3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O3.setBounds(0, 57, 221, 27);
		panel_3.add(O3);
		
		JCheckBox O4 = new JCheckBox("O4");
		O4.setEnabled(false);
		O4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O4.setBounds(0, 84, 221, 27);
		panel_3.add(O4);
		
		JCheckBox O5 = new JCheckBox("O5");
		O5.setEnabled(false);
		O5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O5.setBounds(0, 111, 221, 27);
		panel_3.add(O5);
		
		JCheckBox O6 = new JCheckBox("O6");
		O6.setEnabled(false);
		O6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O6.setBounds(0, 138, 221, 27);
		panel_3.add(O6);
		
		JCheckBox O7 = new JCheckBox("O7");
		O7.setEnabled(false);
		O7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O7.setBounds(0, 165, 221, 27);
		panel_3.add(O7);
		
		JCheckBox O8 = new JCheckBox("O8");
		O8.setEnabled(false);
		O8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O8.setBounds(0, 192, 221, 27);
		panel_3.add(O8);
		
		JCheckBox O9 = new JCheckBox("O9");
		O9.setEnabled(false);
		O9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O9.setBounds(0, 219, 221, 27);
		panel_3.add(O9);
		
		JCheckBox O10 = new JCheckBox("O10");
		O10.setEnabled(false);
		O10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O10.setBounds(0, 246, 221, 27);
		panel_3.add(O10);
		
		JCheckBox O11 = new JCheckBox("O11");
		O11.setEnabled(false);
		O11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O11.setBounds(0, 273, 221, 27);
		panel_3.add(O11);
		
		JCheckBox O12 = new JCheckBox("O12");
		O12.setEnabled(false);
		O12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O12.setBounds(0, 300, 221, 27);
		panel_3.add(O12);
		
		JCheckBox O13 = new JCheckBox("O13");
		O13.setEnabled(false);
		O13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O13.setBounds(0, 327, 221, 27);
		panel_3.add(O13);
		
		JCheckBox O14 = new JCheckBox("O14");
		O14.setEnabled(false);
		O14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O14.setBounds(0, 354, 221, 27);
		panel_3.add(O14);
		
		JCheckBox O15 = new JCheckBox("O15");
		O15.setEnabled(false);
		O15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O15.setBounds(0, 381, 221, 27);
		panel_3.add(O15);
		
		JCheckBox O16 = new JCheckBox("O16");
		O16.setEnabled(false);
		O16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O16.setBounds(0, 408, 221, 27);
		panel_3.add(O16);
		
		JCheckBox O17 = new JCheckBox("O17");
		O17.setEnabled(false);
		O17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O17.setBounds(0, 435, 221, 27);
		panel_3.add(O17);
		
		JCheckBox O18 = new JCheckBox("O18");
		O18.setEnabled(false);
		O18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O18.setBounds(0, 462, 221, 27);
		panel_3.add(O18);
		
		JCheckBox O19 = new JCheckBox("O19");
		O19.setEnabled(false);
		O19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O19.setBounds(0, 489, 221, 27);
		panel_3.add(O19);
		
		JCheckBox O20 = new JCheckBox("O20");
		O20.setEnabled(false);
		O20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O20.setBounds(0, 516, 221, 27);
		panel_3.add(O20);
		
		JCheckBox O21 = new JCheckBox("O21");
		O21.setEnabled(false);
		O21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O21.setBounds(0, 543, 221, 27);
		panel_3.add(O21);
		
		JCheckBox O22 = new JCheckBox("O22");
		O22.setEnabled(false);
		O22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O22.setBounds(0, 570, 221, 27);
		panel_3.add(O22);
		
		JCheckBox O23 = new JCheckBox("O23");
		O23.setEnabled(false);
		O23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O23.setBounds(0, 597, 221, 27);
		panel_3.add(O23);
		
		JCheckBox O24 = new JCheckBox("O24");
		O24.setEnabled(false);
		O24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		O24.setBounds(0, 624, 221, 27);
		panel_3.add(O24);
		
		JRadioButton rdbtnNewRadioButton_6_1_1_1 = new JRadioButton("Soft drinks (Coke, Sprite, etc.");
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(31, 3, 160, 27);
		textField_1.setColumns(10);
		panel_5.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(31, 30, 160, 27);
		textField_2.setColumns(10);
		panel_5.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(31, 57, 160, 27);
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(31, 84, 160, 27);
		textField_4.setColumns(10);
		panel_5.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(31, 111, 160, 27);
		textField_5.setColumns(10);
		panel_5.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(31, 138, 160, 27);
		textField_6.setColumns(10);
		panel_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setBounds(31, 165, 160, 27);
		textField_7.setColumns(10);
		panel_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setBounds(31, 192, 160, 27);
		textField_8.setColumns(10);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setBounds(31, 219, 160, 27);
		textField_9.setColumns(10);
		panel_5.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setBounds(31, 246, 160, 27);
		textField_10.setColumns(10);
		panel_5.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setBounds(31, 273, 160, 27);
		textField_11.setColumns(10);
		panel_5.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setBounds(31, 300, 160, 27);
		textField_12.setColumns(10);
		panel_5.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setBounds(31, 327, 160, 27);
		textField_13.setColumns(10);
		panel_5.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setBounds(31, 354, 160, 27);
		textField_14.setColumns(10);
		panel_5.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setBounds(31, 381, 160, 27);
		textField_15.setColumns(10);
		panel_5.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setBounds(31, 408, 160, 27);
		textField_16.setColumns(10);
		panel_5.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setBounds(31, 435, 160, 27);
		textField_17.setColumns(10);
		panel_5.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setBounds(31, 462, 160, 27);
		textField_18.setColumns(10);
		panel_5.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setBounds(31, 489, 160, 27);
		textField_19.setColumns(10);
		panel_5.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setBounds(31, 516, 160, 27);
		textField_20.setColumns(10);
		panel_5.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setBounds(31, 543, 160, 27);
		textField_21.setColumns(10);
		panel_5.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setBounds(31, 570, 160, 27);
		textField_22.setColumns(10);
		panel_5.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setBounds(31, 597, 160, 27);
		textField_23.setColumns(10);
		panel_5.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setBounds(31, 624, 160, 27);
		panel_5.add(textField_24);
		textField_24.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmFoodClub.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(50, 22, 46, 20);
		panel_2.add(lblNewLabel);
		
		JLabel lblSubTotal = new JLabel("Subtotal");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(181, 22, 122, 20);
		panel_2.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(353, 25, 65, 17);
		panel_2.add(lblTotal);
		
		tax = new JTextField();
		tax.setText("0");
		tax.setHorizontalAlignment(SwingConstants.CENTER);
		tax.setBounds(49, 47, 86, 34);
		panel_2.add(tax);
		tax.setColumns(10);
		
		subtotal = new JTextField();
		subtotal.setText("0");
		subtotal.setHorizontalAlignment(SwingConstants.CENTER);
		subtotal.setColumns(10);
		subtotal.setBounds(169, 47, 107, 34);
		panel_2.add(subtotal);
		
		total = new JTextField();
		total.setText("0");
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setColumns(10);
		total.setBounds(338, 47, 86, 34);
		panel_2.add(total);
		
		JButton totalbelow = new JButton("Total");
		
		totalbelow.setFont(new Font("Tahoma", Font.BOLD, 18));
		totalbelow.setBounds(109, 605, 107, 33);
		panel_2.add(totalbelow);
		O1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (O1.isSelected()){
					textField_1.setEnabled(true);
					textField_1.setText("");
					textField_1.requestFocus();	
				}else {
					textField_1.setEnabled(false);
					textField_1.setText("0");
				}

			}
		});
		
		O2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (O2.isSelected()){
					textField_2.setEnabled(true);
					textField_2.setText("");
					textField_2.requestFocus();	
				}else {
					textField_2.setEnabled(false);
					textField_2.setText("0");
				}

			}
		});
		O3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (O3.isSelected()){
					textField_3.setEnabled(true);
					textField_3.setText("");
					textField_3.requestFocus();	
				}else {
					textField_3.setEnabled(false);
					textField_3.setText("0");
				}

			}
		});
		
		O4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O4.isSelected()){
					textField_4.setEnabled(true);
					textField_4.setText("");
					textField_4.requestFocus();	
				}else {
					textField_4.setEnabled(false);
					textField_4.setText("0");
				}

			}

		});
		
		O5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O5.isSelected()){
					textField_5.setEnabled(true);
					textField_5.setText("");
					textField_5.requestFocus();	
				}else {
					textField_5.setEnabled(false);
					textField_5.setText("0");
				}

			}
		});
		O6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O6.isSelected()){
					textField_6.setEnabled(true);
					textField_6.setText("");
					textField_6.requestFocus();	
				}else {
					textField_6.setEnabled(false);
					textField_6.setText("0");
				}

			}
		});
		
		O7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O7.isSelected()){
					textField_7.setEnabled(true);
					textField_7.setText("");
					textField_7.requestFocus();	
				}else {
					textField_7.setEnabled(false);
					textField_7.setText("0");
				}

			}
		});
		O8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O8.isSelected()){
					textField_8.setEnabled(true);
					textField_8.setText("");
					textField_8.requestFocus();	
				}else {
					textField_8.setEnabled(false);
					textField_8.setText("0");
				}

			}
		});
		O9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O9.isSelected()){
					textField_9.setEnabled(true);
					textField_9.setText("");
					textField_9.requestFocus();	
				}else {
					textField_9.setEnabled(false);
					textField_9.setText("0");
				}

			}
		});
		
		O10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O10.isSelected()){
					textField_10.setEnabled(true);
					textField_10.setText("");
					textField_10.requestFocus();	
				}else {
					textField_10.setEnabled(false);
					textField_10.setText("0");
				}

			}
		});
		O11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O11.isSelected()){
					textField_11.setEnabled(true);
					textField_11.setText("");
					textField_11.requestFocus();	
				}else {
					textField_11.setEnabled(false);
					textField_11.setText("0");
				}

			}
		});
		
		O12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O12.isSelected()){
					textField_12.setEnabled(true);
					textField_12.setText("");
					textField_12.requestFocus();	
				}else {
					textField_12.setEnabled(false);
					textField_12.setText("0");
				}

			}

		});
		
		O13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O13.isSelected()){
					textField_13.setEnabled(true);
					textField_13.setText("");
					textField_13.requestFocus();	
				}else {
					textField_13.setEnabled(false);
					textField_13.setText("0");
				}

			}
		});
		O14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (O14.isSelected()){
					textField_14.setEnabled(true);
					textField_14.setText("");
					textField_14.requestFocus();	
				}else {
					textField_14.setEnabled(false);
					textField_14.setText("0");
				}

			}
		});
		
		O15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O15.isSelected()){
					textField_15.setEnabled(true);
					textField_15.setText("");
					textField_15.requestFocus();	
				}else {
					textField_15.setEnabled(false);
					textField_15.setText("0");
				}

			}
		});
		O16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O16.isSelected()){
					textField_16.setEnabled(true);
					textField_16.setText("");
					textField_16.requestFocus();	
				}else {
					textField_16.setEnabled(false);
					textField_16.setText("0");
				}

			}
		});
		O17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (O17.isSelected()){
					textField_17.setEnabled(true);
					textField_17.setText("");
					textField_17.requestFocus();	
				}else {
					textField_17.setEnabled(false);
					textField_17.setText("0");
				}

			}
		});
		
		O18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O18.isSelected()){
					textField_18.setEnabled(true);
					textField_18.setText("");
					textField_18.requestFocus();	
				}else {
					textField_18.setEnabled(false);
					textField_18.setText("0");
				}

			}
		});
		O19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O19.isSelected()){
					textField_19.setEnabled(true);
					textField_19.setText("");
					textField_19.requestFocus();	
				}else {
					textField_19.setEnabled(false);
					textField_19.setText("0");
				}

			}
		});
		
		O20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O20.isSelected()){
					textField_20.setEnabled(true);
					textField_20.setText("");
					textField_20.requestFocus();	
				}else {
					textField_20.setEnabled(false);
					textField_20.setText("0");
				}

			}

		});
		
		O21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O21.isSelected()){
					textField_21.setEnabled(true);
					textField_21.setText("");
					textField_21.requestFocus();	
				}else {
					textField_21.setEnabled(false);
					textField_21.setText("0");
				}

			}
		});
		O22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O22.isSelected()){
					textField_22.setEnabled(true);
					textField_22.setText("");
					textField_22.requestFocus();	
				}else {
					textField_22.setEnabled(false);
					textField_22.setText("0");
				}

			}
		});
		
		O23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O23.isSelected()){
					textField_23.setEnabled(true);
					textField_23.setText("");
					textField_23.requestFocus();	
				}else {
					textField_23.setEnabled(false);
					textField_23.setText("0");
				}
			}
		});
		O24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				if (O24.isSelected()){
					textField_24.setEnabled(true);
					textField_24.setText("");
					textField_24.requestFocus();	
				}else {
					textField_24.setEnabled(false);
					textField_24.setText("0");
				}

			}
		});
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O1.setEnabled(true);
			}
		});
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O2.setEnabled(true);
			}
		});
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O3.setEnabled(true);
			}
		});
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O4.setEnabled(true);
			}
		});
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O5.setEnabled(true);
			}
		});
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O6.setEnabled(true);
			}
		});
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O7.setEnabled(true);
			}
		});
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O8.setEnabled(true);
			}
		});but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O9.setEnabled(true);
			}
		});
		but10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O10.setEnabled(true);
			}
		});
		but11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O11.setEnabled(true);
			}
		});
		but12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O12.setEnabled(true);
			}
		});
		but13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O13.setEnabled(true);
			}
		});
		but13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O13.setEnabled(true);
			}
		});
		but14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O14.setEnabled(true);
			}
		});
		but15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O15.setEnabled(true);
			}
		});
		but16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O16.setEnabled(true);
			}
		});
		but17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O17.setEnabled(true);
			}
		});
		but18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O18.setEnabled(true);
			}
		});
		but19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O19.setEnabled(true);
			}
		});
		but20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O20.setEnabled(true);
			}
		});
		but21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O21.setEnabled(true);
			}
		});
		but22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O22.setEnabled(true);
			}
		});
		but23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O23.setEnabled(true);
			}
		});but24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				O24.setEnabled(true);
			}
		});
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =  new JFrame("Exit");
					if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Food Club",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {System.exit(0);
			}
		}});
		exit.setFont(new Font("Tahoma", Font.BOLD, 18));
		exit.setBounds(262, 605, 89, 33);
		panel_2.add(exit);
		
		JTextArea receipt = new JTextArea();
		receipt.setBounds(50, 219, 368, 188);
		panel_2.add(receipt);
		totalbelow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				itemcost [1] = Double.parseDouble(textField_1.getText())*70;
				itemcost [2] = Double.parseDouble(textField_2.getText())*80;
				itemcost [3] = Double.parseDouble(textField_3.getText())*70;
				itemcost [4] = Double.parseDouble(textField_4.getText())*120;
				itemcost [5] = Double.parseDouble(textField_5.getText())*70;
				itemcost [6] = Double.parseDouble(textField_6.getText())*140;
				itemcost [7] = Double.parseDouble(textField_7.getText())*70;
				itemcost [8] = Double.parseDouble(textField_8.getText())*140;
				itemcost [9] = Double.parseDouble(textField_9.getText())*150;
				itemcost [10] = Double.parseDouble(textField_10.getText())*150;
				itemcost [11] = Double.parseDouble(textField_11.getText())*150;
				itemcost [12] = Double.parseDouble(textField_12.getText())*150;
				itemcost [13] = Double.parseDouble(textField_13.getText())*80;
				itemcost [14] = Double.parseDouble(textField_14.getText())*80;
				itemcost [15] = Double.parseDouble(textField_15.getText())*120;
				itemcost [16] = Double.parseDouble(textField_16.getText())*100;
				itemcost [17] = Double.parseDouble(textField_17.getText())*100;
				itemcost [18] = Double.parseDouble(textField_18.getText())*100;
				itemcost [19] = Double.parseDouble(textField_19.getText())*100;
				itemcost [20] = Double.parseDouble(textField_20.getText())*100;
				itemcost [21] = Double.parseDouble(textField_21.getText())*50;
				itemcost [22] = Double.parseDouble(textField_22.getText())*70;
				itemcost [23] = Double.parseDouble(textField_23.getText())*120;
				itemcost [24] = Double.parseDouble(textField_24.getText())*80;
				
				itemcost [24] = itemcost [0] + itemcost [1] + itemcost [2] + itemcost [3]+ itemcost [4] + itemcost [5]+ itemcost [6] +
						itemcost [7] + itemcost [8] + itemcost [9] + itemcost [10]+ itemcost [11] + itemcost [12]+ itemcost [13] + 
						itemcost [14] + itemcost [15] + itemcost [16] + itemcost [17]+ itemcost [18] + itemcost [19]+ itemcost [20] + itemcost [21] + itemcost [22]+ itemcost [23];
				
				
								
				iTax = String.format("₱ %.2f", itemcost[24]/100);
				iSubTotal = String.format("₱ %.2f", itemcost[24]);
				iTotal = String.format("₱%.2f", itemcost[24]+(itemcost[24]/100));
				
				tax.setText(iTax);
				subtotal.setText(iSubTotal);
				total.setText(iTotal);
				
				
				//==========================Receipt=========================
				receipt.setEnabled(true);
				//==========================================================
			int refs= 1325 + (int) (Math.random()*4238);
			
			//================================================================
			    Calendar timer = Calendar.getInstance();
			    timer.getTime();
			    SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
			    tTime.format(timer.getTime());
			    SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
			    Tdate.format(timer.getTime());
			//===================================================================
			receipt.append("\t Food club\n" + "Reference:\t\t\t" + refs + "\n=================================================\t" + 
			"\n=================================================\t" +
					"\nTax: \t\t\t" + iTax +
					"\nSub Total:\t\t\t" + iSubTotal+
					"\nTotal:\t\t\t " + iTotal +
					"\n==================================================\t "+
					"\nDate: " + Tdate.format(timer.getTime())+
					"\t\tTime: " + tTime.format(timer.getTime()) +
					"\n\n\t Thank you for ordering\n");
								
			}
		});
	}
	public String getTextField_1Text() {
		return textField_1.getText();
	}
	public void setTextField_1Text(String text) {
		textField_1.setText(text);
	}
}

