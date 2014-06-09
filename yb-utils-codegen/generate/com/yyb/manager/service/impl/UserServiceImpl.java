package com.yyb.manager.service.impl;

import java.io.Serializable;

import com.yyb.manager.entity.Tuser;
import com.yyb.manager.pageModel.Puser;

@Service("userService")
@Transactional
public class UserServiceImpl  implements UserServiceI {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDaoI userDao;
	/**
     * 增加
     */
	public Puser addPuser(Puser puser){
		Tuser t=new Tuser();
		BeanUtils.copyProperties(puser, t);
		userDao.save(t);
		BeanUtils.copyProperties(t, puser);
		return puser;
	}
  /**
     * 主键删除
     */
	public void removePuser(String id){
	  Tuser t= userDao.get(Tuser.class ,id);
	  userDao.delete(t);
	}
	  /**
     * 集合删除
     */
	public void removePusers(String[] ids){
	   for(String id :ids){
	     this.removePuser(String id);
	   }
	}

   /**
     * 编辑
     */
	public Puser editPuser(Puser puser){
	    Tuser t=new Tuser();
		BeanUtils.copyProperties(puser, t);
		userDao.saveOrUpdate(t);
		BeanUtils.copyProperties(t, puser);
		return puser;
	}
	
	
    /**
     * 查询列表
     */
    public List<Puser> getPusers(){
    
    }
    
    /**
     * 条件查询列表
     */
    public List<Puser> getPusers(String hql){
    }
    /**
     * 根据主键查询
     */
    public Puser getPuser(String id){
      Tuser t= userDao.get(Tuser.class ,id);
      Puser pt= new Puser();
      BeanUtils.copyProperties(t, pt);
      return pt;
    }
}
