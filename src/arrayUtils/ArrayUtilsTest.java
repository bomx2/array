package arrayUtils;

public class ArrayUtilsTest {
	public static void main(String[] args) {
		
		//1.
		int[] intArray = {10, 20, 30, 40, 50};
		
		double[] doubleArray = ArrayUtils.intToDouble(intArray);
		
		System.out.println("문제1번");
		int length = doubleArray.length;
		for (int i = 0; i < length; i++) {
			System.out.println(doubleArray[i]);
		}
		
		//2.
		double[] doubleArray2 = {10.1, 20.2, 30.3, 40.4, 50.5};
		
		int[] intArray2 = ArrayUtils.doubleToint(doubleArray2);
		
		System.out.println("문제2번");
		int length2 = intArray2.length;
		for (int i = 0; i < length; i++) {
			System.out.println(intArray2[i]);
		}
		
		
		//3.
		int[] s1 = {1,2,3,4,5};
		int[] s2 = {6,7,8,9,10};
		
		int[] newArrays = ArrayUtils.concat(s1, s2);
		System.out.println("문제3번");
		//int length3 = s1.length;
		//int length4 = s2.length;
		
		for (int i = 0; i < newArrays.length; i++) {
			System.out.println(newArrays[i]);
		}
	}
}
