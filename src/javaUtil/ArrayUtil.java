package javaUtil;

public class ArrayUtil {
	// int 배열을 double 배열로 변환
	public static double[] intToDouble(int[] source) {
		double[] d = new double[source.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = (double) source[i];
		}
		return d;
	}

	// double 배열을 int 배열로 변환
	public static int[] doubleToInt(double[] source) {
		int[] a = new int[source.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) source[i];
		}
		return a;

	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int[] concat(int[] s1, int[] s2) {
		int[] a = new int[s1.length + s2.length];
		System.arraycopy(s1, 0, a, 0, s1.length);
		System.arraycopy(s2, 0, a, 4, s2.length);
		return a;

	}

}
