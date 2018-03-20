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
	//��ġ�� �������(������Ʈ)�� ����ʵ�� ������ �� ���
	
	private Button bt1 = new Button("��");
	private Button bt2 = new Button("�ƴϿ�");
	
	private Label label = new Label("�̿� ����� �����Ͻʴϱ�?",Label.CENTER);
	
	private GridLayout grid = new GridLayout(1,2);
	private BorderLayout border = new BorderLayout();
	
	private Panel p = new Panel();
	
	private Font font = new Font("",Font.BOLD,40);
	
	private Color color = new Color(240,240,240);
	
	
	
	//main�� �ϴ� �������� �����ڿ��� ����
	public Window02(){
		this.display();	//ȭ�� ���� ���� ó��
		this.event();	//�̺�Ʈ ���� ó��
		this.menu();	//�޴� ���� ó��
		
		this.setTitle("GUI�׽�Ʈ");
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
				//����ư ��Ȱ��ȭ, ó�����Ϸ�Ǿ������.
				label.setText("ó���� �Ϸ�Ǿ����ϴ�.");
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
		//â�� ���̻� ���� ������ �ʰ� Ȯ���Ų Ŭ������ �ν��Ͻ��� ����
		Window02 window = new Window02();
	}
}
