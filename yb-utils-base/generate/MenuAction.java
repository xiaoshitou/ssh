package com.yyb.manager.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ModelDriven;
import com.yyb.manager.action.BaseAction;

import com.yyb.manager.pageModel.Pmenu;

@Service("menuAction")
@Transactional
public class MenuAction extends BaseAction  implements ModelDriven<Pmenu> {
	
	@Autowired
	private MenuServiceI menuServiceI;
	private Pmenu pmenu =new Pmenu();

    
    @Override
	public Pmenu getModel() {
		// TODO Auto-generated method stub
		return pmenu;
	}
}
