package pattern��;

import java.util.regex.*;

public class RegexMatches {
	private static String REGEX = "a*b";
	private static String INPUT = "aabhxabhxbhx^^!";
	private static String REPLACE = "-";
 
	public static void main(String[] args) {
		// ���� Pattern �����ұ���һ���򵥵�������ʽ"a*b"->ƥ��0�������a��b����ϣ���aab��ab��b����ƥ�䵽
		Pattern p = Pattern.compile(REGEX);
		// �� Pattern ��� matcher() ��������һ�� Matcher ����
		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			//aab��ab��b���滻Ϊ-,���ҽ����ƥ�䵽֮ǰ���Ӵ���-hx-hx-������ӵ�sb�����У���ʱsbΪ-hx-hx-
			m.appendReplacement(sb, REPLACE);
		}
		//�����ƥ�䵽������Ӵ���hx^^!����ӵ�sb�����У���ʱsbΪ-hx-hx-hx^^!
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
