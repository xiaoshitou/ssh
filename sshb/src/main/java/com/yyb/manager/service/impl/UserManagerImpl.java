package com.yyb.manager.service.impl;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.db.DbUtils;
import com.yb.local.BeanUtils;
import com.yb.local.DateUtil;
import com.yb.local.PasswordUtil;
import com.yyb.manager.dao.UserDaoI;
import com.yyb.manager.entity.Tuser;
import com.yyb.manager.pageModel.DataGrid;
import com.yyb.manager.pageModel.Puser;
import com.yyb.manager.service.UserManagerI;


@Service("userService")
@Transactional
public class UserManagerImpl  implements UserManagerI {
	private static final Logger logger = Logger.getLogger(UserManagerImpl.class);
  
	
	@Autowired
	private UserDaoI userDao;
	

	@Override
	public Puser  add(Puser user) {
		//将页面bean转换成hibernate的 bean
		Tuser t=new Tuser();
		BeanUtils.copyProperties(user, t);
		t.setId(UUID.randomUUID().toString());
		t.setCreatedatetime(DateUtil.getToday("yyyy-MM-dd HH:mm:ss"));
		t.setPwd(PasswordUtil.md5Password(user.getPwd()));//加密密码
		userDao.save(t);
		BeanUtils.copyProperties(t, user);
		return user;
		
	}

	@Override
	public void remove(Puser user) {
		logger.info("remove");
		String[] nids = user.getIds().split(",");
		String hql = "delete Tuser t where t.id in (";
		for (int i = 0; i < nids.length; i++) {
			if (i > 0) {
				hql += ",";
			}
			hql += "'" + nids[i] + "'";
		}
		hql += ")";
		userDao.executeHql(hql);
	}

	@Override
	public Tuser login(Puser user) {
		logger.info("login");
		String hql="from Tuser where name = '"+user.getName()+"' and pwd = '"+PasswordUtil.md5Password(user.getPwd())+"'";
		return userDao.get(hql);
	}

	@Override
	@SuppressWarnings("unchecked")
	public DataGrid datagrid(Puser puser) {
		DataGrid d = new DataGrid();
		Tuser t = new Tuser();
		BeanUtils.copyProperties(puser, t);
		Map map = DbUtils.buildHql(t,puser.getSort(),puser.getOrder());
		List<Puser> pl=new ArrayList<Puser>();
	    List<Tuser> l=userDao.find(map.get("hql").toString(),(Map)map.get("params"), puser.getPage(),puser.getRows());
	    changeModels(pl,l);
	    d.setRows(pl);
	    d.setTotal(userDao.count(map.get("countHql").toString(),(Map)map.get("params")));
		return d;
	}

	private void changeModels(List<Puser> pl, List<Tuser> l) {
		if(l!=null&&l.size()>0){
           for (Tuser t : l) {
        	   Puser p=new Puser();
        	   BeanUtils.copyProperties(t, p); 
        	    pl.add(p);
		  }
	    }
	}
	
//	public Map buildHql(Puser puser){
//		Map<String,Object> result= new HashMap<String, Object>();
//		Map<String, Object> params = new HashMap<String, Object>();
//		String hql="from Tuser t ";
//		if(!"".equals(puser.getName())&&puser.getName()!=null){
//			hql += " where t.name like :name";
//			params.put("name", "%"+puser.getName()+"%");
//		}
//		String countHql ="select count(*) "+hql;
//		if(puser.getSort()!=null){
//			hql += " order by " + puser.getSort() + " " + puser.getOrder();
//		}
//		result.put("hql", hql);
//		result.put("countHql", countHql);
//		result.put("params", params);
//		return result;
//	}

	@Override
	public Puser edit(Puser puser) {
		Tuser t= userDao.get(Tuser.class, puser.getId());
		BeanUtils.copyProperties(puser, t,new String[]{"id,pwd"});
		return puser;
	}

}
