package gui.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*
 * [이벤트]
 - 컴포넌트와 실행코드를 연결시키는 것
 - 이벤트의 종류와 그에 따른 처리 클래스를 알아야 한다(암기)

[주요 이벤트]
ActionEvent	작동시키는 경우
ActionListener	ActionEvent를 처리하기 위해 만들어진 인터페이스

MouseEvent	마우스로 특정 행위를 하는 경우
MouseListener	MouseEvent를 처리하기 위해 만들어진 인터페이스

KeyEvent		키보드로 특정 행위를 하는 경우
KeyListener	KeyEvent를 처리하기 위해 만들어진 인터페이스

WindowEvent	창의 상태와 관련된 행위를 하는 경우
WindowListener	WindowEvent를 처리하기 위해 만들어진 인터페이스
 */
class Window01 extends Frame{
	//배치할 구성요소(컴포넌트)를 멤버필드로 구현한 뒤 사용
	private Button bt = new Button("마우스를 올려보세요!");
	
	
	
	
	
	
	//main에 하던 설정들을 생성자에서 진행
	public Window01(){
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
		this.add(bt);
	}

	private void event() {
		//마우스 이벤트를 처리할 수 있는 객체를 만들어 버튼에 설정
		// -> MouseListener
		MouseListener listener = new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
//				System.out.println("마우스 뗌");
			}
			public void mousePressed(MouseEvent arg0) {
//				System.out.println("마우스 누름");
			}
			public void mouseExited(MouseEvent arg0) {
//				System.out.println("마우스 탈출");
			}
			public void mouseEntered(MouseEvent arg0) {
//				System.out.println("마우스 진입");
			}
			public void mouseClicked(MouseEvent event) {
				System.out.println("마우스 클릭!");
				System.out.println(event.getClickCount());
				System.out.println(event.getSource());
				System.out.println(event.getWhen());
				System.out.println(event.getX());
			}
		};
		bt.addMouseListener(listener);
	}
	
	private void menu() {
		
	}
}

public class Test01 {
	public static void main(String[] args) {
		//창을 더이상 직접 만들지 않고 확장시킨 클래스의 인스턴스를 생성
		Window01 window = new Window01();
	}
}
