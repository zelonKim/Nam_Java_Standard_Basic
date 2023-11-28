package anonymous1;

import java.awt.Button;

class AnonymousEx1 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트가 발생했습니다.");
			}
		});
	}
}

