package java_exam;

public class ArrayExam {

	public static void main(String[] args) {

		int[] scoreArray = new int[7]; // 자바 공식 문법
//		int scoreArray2[] = new int[7]; // c style
		System.out.println(scoreArray);
//		scoreArray[0] = 18;
//		scoreArray[1] = 22;
//		scoreArray[4] = 55;
//		scoreArray[2] = 11;
//		scoreArray[3] = 78;
//		scoreArray[5] = 90;
//		scoreArray[6] = 41;

//		System.out.println(scoreArray[0]);
//		System.out.println(scoreArray[1]);
//		System.out.println(scoreArray[2]);
//		System.out.println(scoreArray[3]);
//		System.out.println(scoreArray[4]);
//		System.out.println(scoreArray[5]);
//		System.out.println(scoreArray[6]);

		for (int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] = (int)(Math.random() * 45 + 1);
		}
		
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
		}

		// 중복되지 않도록 7개의 숫자
		// 배열, for, while 사용
		// 서로 다른 숫자 7개가 배열에 할당될 때 까지 반복
		// 1. 배열에 채워진 숫자의 개수가 7개 인가?
		// - 예 : 종료
		// - 아니요: 계속
		// 2. 새로운 숫자를 생성하고, 배열에 이미 존재하는지 확인한다.
		// - 존재하지 않으면 배열에 추가하고, 1번으로 돌아간다.
		// - 존재하면 다시 2번으로 돌아간다.

		int[] rottoNumb = new int[7];
		int randomNumber = 0;
		int count = 0;
		boolean isExist = false;
		while (count != rottoNumb.length) {
			isExist = false;
			randomNumber = (int) (Math.random() * 45 + 1);
//			for (int i = 0; i < scoreArray.length; i++) {
//				if (scoreArray[i] == randomNumber) {
//					break;
//				}
//				if (i == scoreArray.length - 1) {
//					scoreArray[count++] = randomNumber;
//				}
//			}
			for (int i = 0; i < count; i++) {
				if (rottoNumb[i] == randomNumber) {
					isExist = true;
					break;
				}
			}
			if(!isExist) {
				rottoNumb[count++] = randomNumber;
			}
		}

		for (int i = 0; i < rottoNumb.length; i++) {
			System.out.print(rottoNumb[i] + " ");
		}
		System.out.println();
		
		// 다른 방법 강사님 github에서 보기
		// while 없이 2중 for문으로 i값을 제어해서 중복 제거
		// 중복된 값이 나올 경우 index를 돌려서 다른 값이 나올 때까지 반복
		for(int i = 0; i < rottoNumb.length; i++) {
			rottoNumb[i] = (int) (Math.random() * 45 + 1);
			for(int j=0; j < i; j++) {
				if(rottoNumb[i]==rottoNumb[j]) {
					i--;
					break;
				}
				
			}
		}
		
		
		
		int[] rottoNums = new int[45];
		int idx = 0;
		for (int i = 0; i < rottoNums.length; i++) {
			rottoNums[i] = i+1;
		}

		for (int i = 0; i < 7; i++) {
			while(true) {
				idx = (int) (Math.random() * 45);
				if(rottoNums[idx]!=0) {
					System.out.print(rottoNums[idx] + " ");
					rottoNums[idx] = 0;
					break;
				}
				
			}
		}
		
		
	}

}
