package com.yb.code;

import java.util.Map;
import java.util.Map.Entry;

import com.yb.local.BeanUtils;

public class T {

	public static void main(String[] args) {
		TaskVO t= new TaskVO();
		t.setDaoPath("daopathv");
		t.setEntityPath("entityPathv");
		Map<String, Object> prop = BeanUtils.model2Map(t);
		
		for (Entry<String, Object> entry : prop.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
