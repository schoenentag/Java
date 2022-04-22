package co.edu.array;

public class ArrayExam_review {

	public static void main(String[] args) {
		// 1. 어려웠던 부분 input값을 배열에 집어넣기
		// 2. max, agv 평균값 구하기

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i <mathScores.length; i++)
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i = 0; i <englishScores.length; i++) {
			for (int k = 0; k < englishScores.length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		System.out.println();
		int[][] javaScores = {{95,80}, {92,96,80}};
		for(int i = 0; i<javaScores.length; i++) {
			for(int k = 0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
				
		// int[][] array2 = new int[3][5];
//		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
//		int sum = 0;
//		double avg = 0.0;
//
//		for (int i = 0; i < array2.length; i++) {
//			for (int j = 0; j < array2.length; j++) {
//				
//			}
//		}
//
//		System.out.println("sum + " + sum);
//		System.out.println("avg + " + avg);

		String[] strArray = new String[3];
		strArray[0] = "JAVA";
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");

		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false => [0],[2]의 주소값이 다름
		System.out.println(strArray[0].equals(strArray[2])); // true => 주소값은 다르지만 데이터값 자체를 비교하므로 true

		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}

	}

}
