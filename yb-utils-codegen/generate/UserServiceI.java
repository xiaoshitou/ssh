package com.yyb.manager.service;

import java.io.Serializable;


import com.yyb.manager.pageModel.Puser;

public interface UserServiceI{
  /**
     * 增加
     */
	public Puser addPuser(Puser puser);
  /**
     * 主键删除
     */
	public void removePuser(String id);
	  /**
     * 集合删除
     */
	public void removePusers(String[] ids);

   /**
     * 编辑
     */
	public Puser editPuser(Puser puser);
	
	
    /**
     * 查询列表
     */
    public List<Puser> getPusers();
    
    /**
     * 条件查询列表
     */
    public List<Puser> getPusers(String hql);
    /**
     * 根据主键查询
     */
    public Puser getPuser(String id) ;
}
