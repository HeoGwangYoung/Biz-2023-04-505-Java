package guide.exec;

public class RandomNumTest {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			
			if(rndNum < 1 || rndNum > 100) {
				System.out.println("100번 테스트를 수행하려고 했으나" + (i + 1) + " 번 쨰에서 테스트를 실패함");
			} else {
				System.out.println("100번 테스트 수행결과 1 ~ 100 까지 범위의 랜덤수를 만들어 내고 있음");
			}
		}
	}
}
