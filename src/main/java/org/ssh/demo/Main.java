package org.ssh.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-05-25 17:03
 */
public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
//		list1.add("111");
//		list1.add("222");

		List<String> list2 = new ArrayList<String>();
		list2.add("111");
		list2.add("222");
		list2.add("333");

		List<String> list = ListUtils.subtract(list1, list2);
//		List<String> list = ListUtils.intersection(list1, list2);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
