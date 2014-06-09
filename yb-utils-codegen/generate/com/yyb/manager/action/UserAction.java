package com.yyb.manager.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ModelDriven;
import com.yyb.manager.action.BaseAction;

import com.yyb.manager.pageModel.Puser;

@Service("userAction")
@Transactional
public class UserAction extends BaseAction  implements ModelDriven<Puser> {
	
	@Autowired
	private UserServiceI userServiceI;
	private Puser puser =new Puser();

    
    @Override
	public Puser getModel() {
		// TODO Auto-generated method stub
		return puser;
	}
}
