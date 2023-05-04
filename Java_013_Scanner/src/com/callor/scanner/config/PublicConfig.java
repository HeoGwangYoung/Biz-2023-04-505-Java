package com.callor.scanner.config;

public class PublicConfig {
	
	/*
	 * ���� ���𹮿� static �߰� �� ��� "Ŭ���� ����"
	 * ������Ʈ�� ���۵ɶ� �ڵ����� ����(����, �ʱ�ȭ) �Ǵ� ����
	 * �� ������ Ŭ������ ��ü�� �������� �ʾƵ� ����� �� �ִ� ����
	 * 
	 * �Ϲ����� Ŭ������ ����� ���� ����ϱ� ���ؼ��� �ݵ�� ��ü ������ ���� �Ǿ�� �Ѵ�
	 * Class obj = new DataClass()
	 * obj.���� = 30;
	 * 
	 * Ŭ���� ������ ��ü�� �������� �ʰ� ���� ȣ���Ҽ� �ִ�
	 * 		Config.���� = 30;
	 * 		System.out.println(Config.����)
	 */
	
	public static String dLine = "=".repeat(60);
	public static String sLine = "-".repeat(60);
	
	/*
	 * Ŭ���� method
	 * ������Ʈ�� ���۵ɶ� �ڵ����� �޸𸮿� loading �Ǿ� ����� �غ� �Ϸ�Ǵ� method
	 * PublicConfig.dLine(100);
	 */
	public static String dLine(int length) {
		return "=".repeat(length);
	}
	
	public static String sLine(int length) {
		return "-".repeat(length);
	}
	/*
	 * Ŭ������ ���Ե� ����, method ���� static Ű���带 �߰��� �� �ִ�
	 * ������ �̷��� ����, method�� ��������, ���� �޼��� ��� �Ѵ�
	 * 
	 * ������Ʈ�� ���۵ɶ� �������� ����� �� �ֵ��� �̸� �غ�Ǵ� ������
	 * ����Ҷ��� Ŭ������.����, Ŭ������.�޼���() �� ���� ���� Ŭ���� �̸��� ���Ͽ� �����Ѵ�
	 */
}
