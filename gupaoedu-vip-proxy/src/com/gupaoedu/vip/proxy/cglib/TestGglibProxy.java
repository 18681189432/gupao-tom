package com.gupaoedu.vip.proxy.cglib;

/**
 * // ��̬�����ص㣺
	//�ع�һ�£��������ģʽӦ�ó�����������Ҫ��������ȡ��
	//1��������ɫ��ִ���ߡ����������
	//2��ע�ع��̣�����Ҫ�������������ûʱ�������߲������������ߣ�����רҵ
	//3��ִ���߱����õ����������ĸ������ϣ�ִ���߳��б������������ã�
 * @author Administrator
 *
 */
public class TestGglibProxy {
	
	public static void main(String[] args) {
		
		//JDK�Ķ�̬������ͨ���ӿ�������ǿ��ת����
		//�����Ժ�Ĵ�����󣬿���ǿ��ת��Ϊ�ӿ�
		
		
		//CGLib�Ķ�̬������ͨ������һ���������������࣬Ȼ����д����ķ���
		//�����Ժ�Ķ��󣬿���ǿ��ת��Ϊ���������Ҳ�������Լ�д���ࣩ
		//�������ø�ֵ������
		
		
		try {
			YunZhongYu obj = (YunZhongYu)new GPMeipo().getInstance(YunZhongYu.class);
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
