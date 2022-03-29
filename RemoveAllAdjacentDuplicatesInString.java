package com.tried.off;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "azxxzy";

		int k = 2;

		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i) + "", map.get(s.charAt(i) + "") != null ? map.get(s.charAt(i) + "") + 1 : 1);
			if(map.get(s.charAt(i) + "")%k==0) map.remove(s.charAt(i) + "");
		}

		Stack<String> stack = null;
		while (map.keySet().size() != s.length()) {
			stack = new Stack<>();
			String tmp = "";
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {

				tmp = s.charAt(i) + "";

				if (counter == 0) {
					counter++;
					stack.add(tmp);
				} else {
					if (stack.peek().equals(tmp)) {
						counter++;
					} else {
						counter = 1;
					}
					stack.add(tmp);

					if (counter == k) {
						for (int j = 1; j <= k; j++) {
							stack.pop();
						}
						counter = 0;
					}
				}
			}
			s = "";
			while(!stack.isEmpty()) s = s + stack.pop();
		}
		System.out.println(s);
	}

}
