package com.yb.db;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.yb.local.BeanUtils;

public class DbUtils {
	
	 public static Map buildHql(Object t,String sort,String order){
			Map<String,Object> result= new HashMap<String, Object>();
			Map<String, Object> params = new HashMap<String, Object>();
			String hql="from "+t.getClass().getSimpleName()+" t ";
			Map<String, Object> prop = BeanUtils.model2Map(t);
			
			for (Entry<String, Object> entry : prop.entrySet()) {
				if(entry.getValue()!=null&&!"serialVersionUID".equals(entry.getKey())){
					hql += " where t."+entry.getKey().toUpperCase()+" like :"+entry.getKey();
					params.put(entry.getKey(), "%"+entry.getValue()+"%");
				}
			}
			
			String countHql ="select count(*) "+hql;
			if(sort!=null&&order!=null){
				hql += " order by " + sort + " " +order;
			}
			result.put("hql", hql);
			result.put("countHql", countHql);
			result.put("params", params);
			return result;
		}
}
