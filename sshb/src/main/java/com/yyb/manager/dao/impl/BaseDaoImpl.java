package com.yyb.manager.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yyb.manager.dao.BaseDaoI;

@Repository("baseDao")
public class BaseDaoImpl<T>  implements BaseDaoI<T> {

	@Autowired
	private SessionFactory sessionFactory;

/*
 * 获取当前的session
 */
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 保存实体
	 * @see sy.dao.BaseDaoI#save(java.lang.Object)
	 */
	public Serializable save(T o) {
		return this.getCurrentSession().save(o);
	}

	/*
	 * (non-Javadoc)
	 * 查询实体
	 * @see sy.dao.BaseDaoI#save(java.lang.Object)
	 */
	@Override
	public T get(String hql) {
		Query q =  this.getCurrentSession().createQuery(hql);
		List<T> l = q.list();
		if (l != null && l.size() > 0) {
			return l.get(0);
		}
		return null;
	}
/**
 * 根据输入的参数查询实体
 */
	@Override
	public T get(String hql, Map<String, Object> params) {
		Query q =  this.getCurrentSession().createQuery(hql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		List<T> l = q.list();
		if (l != null && l.size() > 0) {
			return l.get(0);
		}
		return null;
	}
/*
 * (non-Javadoc)
 * 删除实体
 * @see sy.dao.BaseDaoI#delete(java.lang.Object)
 */
	@Override
	public void delete(T o) {
		this.getCurrentSession().delete(o);
	}
/*
 *更新实体 
 */
	@Override
	public void update(T o) {
		this.getCurrentSession().update(o);
	}
/*
 * (non-Javadoc)
 * 保存和更新
 * @see sy.dao.BaseDaoI#saveOrUpdate(java.lang.Object)
 */
	@Override
	public void saveOrUpdate(T o) {
		this.getCurrentSession().saveOrUpdate(o);
	}
/*
 * (non-Javadoc)
 * getList
 * @see sy.dao.BaseDaoI#find(java.lang.String)
 */
	@Override
	public List<T> find(String hql) {
		Query q =  this.getCurrentSession().createQuery(hql);
		return q.list();
	}
/*
 * (non-Javadoc)
 * getLists集合
 * @see sy.dao.BaseDaoI#find(java.lang.String, java.util.Map)
 */
	@Override
	public List<T> find(String hql, Map<String, Object> params) {
		Query q =  this.getCurrentSession().createQuery(hql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.list();
	}
/*
 * (non-Javadoc)
 * 分页查询  带参数
 * @see sy.dao.BaseDaoI#find(java.lang.String, java.util.Map, int, int)
 */
	@Override
	public List<T> find(String hql, Map<String, Object> params, int page, int rows) {
		Query q =  this.getCurrentSession().createQuery(hql);
		
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}
/*
 * (non-Javadoc)
 * 分页查询   不带参数
 * @see sy.dao.BaseDaoI#find(java.lang.String, int, int)
 */
	@Override
	public List<T> find(String hql, int page, int rows) {
		Query q =  this.getCurrentSession().createQuery(hql);
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}

	@Override
	public Long count(String hql) {
		Query q =  this.getCurrentSession().createQuery(hql);
		return (Long) q.uniqueResult();
	}

	@Override
	public Long count(String hql, Map<String, Object> params) {
		Query q = this.getCurrentSession().createQuery(hql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return (Long) q.uniqueResult();
	}
	@Override
	public int executeHql(String hql) {
		Query q = this.getCurrentSession().createQuery(hql);
		return q.executeUpdate();
	}

	@Override
	public T get(Class<T> c, Serializable id) {
		return (T)this.getCurrentSession().get(c, id);
	}
}
