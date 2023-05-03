package com.callor.system.exec;

public class StringC {

	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = new String("Korea");
		String str3 = "KOREA";
		
		// str1 ���ڿ� ������ str2 ���ڿ� ���� (��ü����)�� ���� ������ ���ϱ�
		boolean bYes = str1 == str2; //���ڿ� �� ���� �Ұ�
		// str1 ������ ��� ���ڿ��� str2 ������ ��� ���ڿ��� ������ ���Ͽ� ����� bYes�� ����
		// ���ڿ� ���� �񱳴� equals() method�� ����ؾ� �Ѵ�
		bYes = str1.equals(str2);
		bYes = str2.equals(str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
		
		// equals() method�� ����� �������� ��ҹ��ڸ� ���� �ٸ� ���ڿ��� ����
		bYes = str1.equals(str3);
		System.out.println(bYes);
		
		// �����ڸ� ���Ҷ� ��, �ҹ��ڸ� ���о��� ���ϰ� ������
		// Korea == KOREA �� ������ Ȯ���ϰ� ������
		// Korea == korea, kOREA == kOrea
		bYes = str1.equalsIgnoreCase(str3);
		System.out.println(bYes);
		
		str1 = "Republic of KOrea";
		str2 = "Republic Of Korea";
		str3 = "Republic of   Korea";
		
		/*
		 * equalsIgnoreCase()
		 * ������ ����� ���ڿ��� �迭�� ��ġ�ϰ� ��ҹ��ڰ� ������������ ���� ������ ����
		 */
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
	}
}
