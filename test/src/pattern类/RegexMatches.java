package pattern类;

import java.util.regex.*;

public class RegexMatches {
	private static String REGEX = "a*b";
	private static String INPUT = "aabhxabhxbhx^^!";
	private static String REPLACE = "-";
 
	public static void main(String[] args) {
		// 生成 Pattern 对象并且编译一个简单的正则表达式"a*b"->匹配0到多个的a和b的组合，例aab、ab、b都可匹配到
		Pattern p = Pattern.compile(REGEX);
		// 用 Pattern 类的 matcher() 方法生成一个 Matcher 对象
		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			//aab、ab、b被替换为-,并且将最后匹配到之前的子串（-hx-hx-）都添加到sb对象中，此时sb为-hx-hx-
			m.appendReplacement(sb, REPLACE);
		}
		//将最后匹配到后面的子串（hx^^!）添加到sb对象中，此时sb为-hx-hx-hx^^!
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
