package com.mcgoodtime.client;

import java.awt.Toolkit;

import javax.swing.JFrame;


public class MainWindow {

	public static void main(String[] args) {
		 JFrame f = new JFrame("��ӭ����GoodTime���߹�����");
		 f.setVisible(true);
		 f.setSize(800,600);
		 f.setLocation(200, 100);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setResizable(true);
		 f.setIconImage(Toolkit.getDefaultToolkit().createImage(""));
		 
	}

}
