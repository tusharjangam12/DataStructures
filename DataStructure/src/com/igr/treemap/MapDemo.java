package com.igr.treemap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Object, Object>  m = new LinkedHashMap <> ();
		m.put("3","Khispra");
		m.put(1, "Gaurav");
		m.put(2, "Jaydip");
		m.put(17, "Xyz");
		m.put("5", "Kamini");
		m.put("4", "Madhuri");
		m.put("6", "Madhuri");
		System.out.println(m);

	}

}
