package prob4;

public class StringUtil {
	public static String concatenate(String[] s) {
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			s1 += s[i];
		}
		return s1;
	}
}
