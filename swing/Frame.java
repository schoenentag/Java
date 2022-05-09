package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 프레임 생성
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text"); 
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea(); // 한줄이상 타이밍
		
		JPanel btnPanel = new JPanel();
		
		//JTextField txtField = new JTextField(200); //한 줄
		
		
		panel.setLayout(new BorderLayout()); // 원하는 곳으로 레이아웃설정
		
		panel.add(label, BorderLayout.SOUTH);
		panel.add(btnPanel, BorderLayout.EAST);
		btnPanel.add(btn1); // 프레임 안에 판넬을 만들고 판넬안에 버튼 판넬을 만들어 버튼을 넣음
		btnPanel.add(btn2);
		panel.add(txtArea, BorderLayout.CENTER);
		
		
		// 버튼에 기능추가
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//txtArea.append("클릭하면 텍스트가 뜸!\n");
				label.setText(txtArea.getText()); // 적은 대로 라벨 내용이 바뀜
			
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//프레임안에 패널을 넣어줘야함
		frame.add(panel);
		
		
		frame.setResizable(false); // false : 크기 조절 X (크기 고정)
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840,840/12*9);
		frame.setLocationRelativeTo(null); // null로 설정시 중간으로 창이 뜸
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 끄면 메모리상에서도 종료 
		
		
		
		

	}

}
