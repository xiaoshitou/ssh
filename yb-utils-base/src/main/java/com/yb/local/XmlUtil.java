package com.yb.local;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtil {
	/**
	 * 将生成的语句写入工程的src文件夹下
	 * 
	 * @param str
	 * @throws Exception
	 */
	public static void generateFile(String str) throws Exception {
		File target = new File(System.getProperty("user.dir") + "/src/sql1.txt");
		FileOutputStream fos = new FileOutputStream(target);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,
				"utf-8"));
		bw.write(str.toString());
		bw.close();
	}

	/**
	 * 解析指定的xml文件 filePathxml文件路径 返回根节点
	 * 
	 * @throws Exception
	 */
	public static Element xmlParser(String pathname) throws Exception {

		File xml = new File(pathname);
		if (!xml.exists()) {
			throw new Exception("文件路径不正确！");
		}
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		return root;
	}

	/**
	 * 获取传入节点下一层所有节点的值 可以用map.get(key)获取
	 * 
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public static Map<String, List<String>> getvalues(Element root)
			throws Exception {
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		List<Element> elements = root.elements();
		if (elements.size() == 0) {
			throw new Exception("已经是叶子节点");
		}
		List<String> values = new ArrayList<String>();
		for (Element element : elements) {
			values.add(element.getStringValue());
		}
		String key = elements.get(0).getName();// 获取节点名字
		result.put(key, values);
		return result;

	}

	/**
	 * 获取传入节点的特定属性的值
	 * 
	 * @param element
	 *            待查询的节点 ;要查询的属性attrabutes
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getAttrabuteValues(Element element,
			List<String> attrabutes) throws Exception {
		if (attrabutes == null || attrabutes.size() == 0) {
			throw new Exception("属性集合不能为空");
		}
		String[] attr = new String[attrabutes.size()];
		for (int i = 0; i < attr.length; i++) {
			attr[i] = attrabutes.get(i);
		}
		return getAttrabuteValues(element, attr);

	}

	public static Map<String, String> getAttrabuteValues(Element element,
			String[] attrabutes) throws Exception {
		Map<String, String> result = new HashMap<String, String>();
		if (attrabutes == null || attrabutes.length == 0) {
			throw new Exception("属性数组不能为空");
		}
		for (String attrabute : attrabutes) {
			String value = element.attributeValue(attrabute);
			result.put(attrabute, value);
		}
		return result;

	}

	/**
	 * 获取传入节点的 下一层的 特定属性的值
	 * 
	 * @param element
	 *            待查询的父节点 ;attrabutes 要查询的属性
	 * @return
	 * @throws Exception
	 */
	public static List<Map<String, String>> getSubAttrabuteValues(
			Element element, List<String> attrabutes) throws Exception {
		if (attrabutes == null || attrabutes.size() == 0) {
			throw new Exception("属性集合不能为空");
		}
		String[] attr = new String[attrabutes.size()];
		for (int i = 0; i < attr.length; i++) {
			attr[i] = attrabutes.get(i);
		}
		return getSubAttrabuteValues(element, attr);

	}

	public static List<Map<String, String>> getSubAttrabuteValues(
			Element element, String[] attrabutes) throws Exception {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		List<Element> elements = element.elements();
		for (Element element2 : elements) {
			result.add(getAttrabuteValues(element2, attrabutes));
		}
		return result;

	}

	/*public Element setPropoty(Element element, Map<String, String> eleMap) {
		Iterator iterator = eleMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			element.setAttribute((String) entry.getKey(),(String) entry.getValue());
		}
		return element;
	}*/

}
