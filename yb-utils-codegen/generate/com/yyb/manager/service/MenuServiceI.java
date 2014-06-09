package com.yyb.manager.service;

import java.io.Serializable;


import com.yyb.manager.pageModel.Pmenu;

public interface MenuServiceI extends BaseServiceI<Pmenu>{
  /**
     * 增加
     */
	public Puser addPmenu(Pmenu puser);
  /**
     * 主键删除
     */
	public void removePmenu(String id);
	  /**
     * 集合删除
     */
	public void removePmenus(String[] ids);

   /**
     * 编辑
     */
	public Pmenu editPmenu(Pmenu puser);
	
	
    /**
     * 查询列表
     */
    public List<Pmenu> getPmenus();
    
    /**
     * 条件查询列表
     */
    public List<Pmenu> getPmenus(String hql);
    /**
     * 根据主键查询
     */
    public Pmenu getPmenu(String id) ;
}
