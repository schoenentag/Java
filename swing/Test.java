package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("별장 windowBuilder Test");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null); //화면 가운데로
		frame.setResizable(false); // 크기 조정 X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel main_panel = new JPanel(); // 판넬 생성 후 프레임에 판넬 넣음
		frame.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
		btnStart.setBounds(130, 250, 100, 50);
		main_panel.add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 다음 화면으로 넘어가는 기능 넣기
			}
		});
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
		btnExit.setBounds(130, 330, 100, 50);
		main_panel.add(btnExit);
		// 버튼을 클릭하면 종료된다.
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		

		
//		JButton btnNewButton1 = new JButton(" 예 ");
//		btnNewButton1.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
//		btnNewButton1.setBounds(550, 510, 100, 30);
//		panel.add(btnNewButton1);
//		
//		JButton btnNewButton2 = new JButton("아니오");
//		btnNewButton2.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 15));
//		btnNewButton2.setBounds(650, 510, 100, 30);
//		panel.add(btnNewButton2);
		
		//JPanel panel_1 = new JPanel();
		//frame.getContentPane().add(panel_1);
		//panel_1.setLayout(null);
		
	}
}
