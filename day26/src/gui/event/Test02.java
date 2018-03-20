package gui.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Window02 extends Frame{
	//배치할 구성요소(컴포넌트)를 멤버필드로 구현한 뒤 사용
	
	private Button bt1 = new Button("예");
	private Button bt2 = new Button("아니오");
	
	private Label label = new Label("이용 약관에 동의하십니까?",Label.CENTER);
	
	private GridLayout grid = new GridLayout(1,2);
	private BorderLayout border = new BorderLayout();
	
	private Panel p = new Panel();
	
	private Font font = new Font("",Font.BOLD,40);
	
	private Color color = new Color(240,240,240);
	
	
	
	//main에 하던 설정들을 생성자에서 진행
	public Window02(){
		this.display();	//화면 구성 관련 처리
		this.event();	//이벤트 관련 처리
		this.menu();	//메뉴 관련 처리
		
		this.setTitle("GUI테스트");
		this.setSize(500, 400);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void display() {
		this.setLayout(border);
		this.add(label, BorderLayout.NORTH);
		this.add(p, BorderLayout.CENTER);
		p.setLayout(grid);
		p.add(bt1);
		p.add(bt2);
		label.setFont(font);
	}

	private void event() {
		MouseListener listener = new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				//모든버튼 비활성화, 처리가완료되었스빈다.
				label.setText("처리가 완료되었습니다.");
				bt1.setEnabled(false);
				bt2.setEnabled(false);
			}
			public void mouseEntered(MouseEvent event) {
				if(event.getComponent().getName().equals("button0"))
					bt2.setBackground(color.yellow);
				if(event.getComponent().getName().equals("button1"))
					bt1.setBackground(color.yellow);
			}
			public void mouseExited(MouseEvent arg0) {
				bt1.setBackground(color);
				bt2.setBackground(color);
			}
			public void mousePressed(MouseEvent arg0) {
				
			}
			public void mouseReleased(MouseEvent arg0) {
				
			}
		};
		bt1.addMouseListener(listener);
		bt2.addMouseListener(listener);
	}
	
	private void menu() {
		
	}
}

public class Test02 {
	public static void main(String[] args) {
		//창을 더이상 직접 만들지 않고 확장시킨 클래스의 인스턴스를 생성
		Window02 window = new Window02();
	}
}
