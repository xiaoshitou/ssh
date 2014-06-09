package com.yyb.manager.service.impl;

import java.io.Serializable;

import com.yyb.manager.entity.Tmenu;
import com.yyb.manager.pageModel.Pmenu;

@Service("menuService")
@Transactional
public class MenuServiceImpl  implements MenuServiceI {
	private static final Logger logger = Logger.getLogger(MenuServiceImpl.class);
	@Autowired
	private MenuDaoI menuDao;
	/**
     * 增加
     */
	public Puser addPmenu(Pmenu puser){
		Tmenu t=new Tmenu();
		BeanUtils.copyProperties(puser, t);
		menuDao.save(t);
		BeanUtils.copyProperties(t, puser);
		return puser;
	}
  /**
     * 主键删除
     */
	public void removePmenu(String id){
	  Tmenu t= menuDao.get(Tmenu.class ,id);
	  menuDao.delete(t);
	}
	  /**
     * 集合删除
     */
	public void removePmenus(String[] ids){
	   for(String id :ids){
	     this.removePmenu(String id);
	   }
	}

   /**
     * 编辑
     */
	public Pmenu editPmenu(Pmenu puser){
	    Tmenu t=new Tmenu();
		BeanUtils.copyProperties(puser, t);
		menuDao.saveOrUpdate(t);
		BeanUtils.copyProperties(t, puser);
		return puser;
	}
	
	
    /**
     * 查询列表
     */
    public List<Pmenu> getPmenus(){
    
    }
    
    /**
     * 条件查询列表
     */
    public List<Pmenu> getPmenus(String hql){
    }
    /**
     * 根据主键查询
     */
    public Pmenu getPmenu(String id){
      Tmenu t= menuDao.get(Tmenu.class ,id);
      Pmenu pt= new Pmenu();
      BeanUtils.copyProperties(t, pt);
      return pt;
    }
}
