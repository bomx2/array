package arrayUtils;

public class ArrayUtils {
	public static double[] intToDouble(int[] src){
		int length = src.length;
		
		double[] doubleArray = new double[length];
		
		for (int i = 0; i < length; i++) {
			doubleArray[i] = src[i];
		}
		return doubleArray;
	}
	
	public static int[] doubleToint (double[] src){
		int length = src.length;
		
		int[] intArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			intArray[i] = (int)src[i];
		}
		return intArray;
	}
	
	public static int[] concat(int[] s1, int[] s2){
		int length = s1.length;
		int length2 = s2.length;
		
		int[] concatArray = new int[length+length2];
		
		for (int i = 0; i < length; i++) {
			concatArray[i] = s1[i];
		}
		for (int i = length; i < length+length2; i++) {
			concatArray[i] = s2[i-length];
		}
		
		
		return concatArray;
	}

}
