package main;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import javax.swing.*;

public class main extends JFrame{

	private static Component Component;
	private static JProgressBar progress;

	public static void main String{
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		f.setTitle("Frame Test");
		f.addWindowListener((WindowListener) new EventHandler());
		f.setSize(300,300);
		f.setVisible(true);
        f.setLayout(new FlowLayout());//��ġ������ ����
        JProgressBar progress = new JProgressBar();
        //�ּҰ��� 0,�ִ밪�� 100���� ǥ��
        //progress.setValue(0);//0���� ����.���� �������� 
        //ǥ��
        progress.setStringPainted(true);
        //true�� �����ϸ� ���� �����Ȳ�� %�� ǥ����.
        try {
			f.add(progress);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���� �����������쿡 ���α׷�����
        //��ġ
        f.setSize(300,150);
        f.setVisible(true);
        progress_start();//progress_start()�޼��带
        //ȣ��
    }//������ ����
    
    public static void progress_start(){
        int i;
            for(i=51;i<=100;i++){
				progress.setValue(50);
                Thread.sleep(1);//�и������� ������
                //�����ð��� ����.
            }
           catch(InterruptedException ie){
            ie.printStackTrace();
           }
        }
    }

	private static JProgressBar number(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
public class SwingTest04 {
    public static void main(String[] args) {
        new JFrameTest04();//�����ڸ� ȣ��

	}

}
class EventHandler extends WindowAdapter {

	 @Override
	 public void windowClosing(WindowEvent we) {
	  we.getWindow().setVisible(false);
	  we.getWindow().dispose();
	  System.exit(0);
	 }

	} 