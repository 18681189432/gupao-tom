package com.gupaoedu.vip.factory.func;

public class FactoryTest {

	// ��������ģʽ
	// 1����������ϵͣ����ڸ���ά����չ��
	// 2��������������Ҫ���Ĺ��������ͣ��޷��򵥵��á�
	public static void main(String[] args) {
		
		//������Ʒ�������̣���ӵ�и��ԵĹ���
		//�������գ����ɵĸ߿Ƽ��̶ȶ��ǲ�һ����
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		//��Ҫ�û����ģ������Ʒ��������
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//�����˴����ʹ�ø��Ӷ�
		
		
		//���󹤳�ģʽ
		
	}
	
}
