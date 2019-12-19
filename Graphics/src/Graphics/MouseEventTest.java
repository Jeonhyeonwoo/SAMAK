package Graphics;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements MouseListener, MouseMotionListener
{
	int startx;
	int starty;
	int endx;
	int endy;

    JFrame frm = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    boolean pressed = false;

    public MyFrame()
    {
        //�⺻���� ������ ����
        frm.setTitle("���콺 �̺�Ʈ �ڵ鸵");
        frm.setLayout(new GridLayout(3,0));
        frm.setBounds(120, 120, 300, 100);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
        //������Ʈ �߰�
        frm.add(label1);
        frm.add(label2);
        frm.add(label3);

        //�̺�Ʈ �ڵ鷯 �߰�
        frm.addMouseListener(this);
        frm.addMouseMotionListener(this);

    }
    
    public void mouseDragged(MouseEvent e)
    {
        label1.setText("���콺 ���� : �巹��");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
        //g.drawLine(startx, starty, e.getX(), e.getY());

       
    }
    
    public void mouseMoved(MouseEvent e)
    {
        label1.setText("���콺 ���� : �̵�");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
    }

    public void mouseClicked(MouseEvent e)
    {
        label1.setText("���콺 ���� : Ŭ��");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());

    }

    public void mouseEntered(MouseEvent e) 
    {
        label1.setText("���콺 ���� : ������Ʈ �� ����");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
    }

    public void mouseExited(MouseEvent e) 
    {
        label1.setText("���콺 ���� : ������Ʈ ��");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
    }

    public void mousePressed(MouseEvent e) 
    {
        label1.setText("���콺 ���� : ����");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
        startx = e.getX();
        starty = e.getY();
    }

    public void mouseReleased(MouseEvent e)
    {
        label1.setText("���콺 ���� : Ǯ��");
        label2.setText(" X : " + e.getX() + "Y : " + e.getY());
        label3.setText("���콺 ��ư : "+e.getButton());
        endx = e.getX();
        endy = e.getY();
        Graphics g = getGraphics();
        g.drawLine(startx, starty, endx, endy);
    }
}

public class MouseEventTest 
{
    public static void main(String[] args) 
    {
        MyFrame my = new MyFrame();
    }
}
