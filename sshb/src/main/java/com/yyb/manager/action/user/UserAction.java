package com.yyb.manager.action.user;


import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.yyb.manager.action.BaseAction;
import com.yyb.manager.entity.Tuser;
import com.yyb.manager.pageModel.DataGrid;
import com.yyb.manager.pageModel.Message;
import com.yyb.manager.pageModel.Puser;
import com.yyb.manager.service.UserManagerI;



@Action(value = "userAction")
public class UserAction  extends BaseAction implements ModelDriven<Puser> {
	@Autowired
   private UserManagerI userManagerI;
	
	private Puser puser = new Puser();
	
	public void add(){
		
		Puser s;
		try {
			s =  userManagerI.add(puser);
			super.writeJson(new Message("0000","注册成功",s));
		} catch (Exception e) {
			super.writeJson(new Message("9999",e.getMessage()));
		}
	
	}
	public void edit(){
		
		Puser s;
		try {
			s =  userManagerI.edit(puser);
			super.writeJson(new Message("0000","编辑成功",s));
		} catch (Exception e) {
			super.writeJson(new Message("9999",e.getMessage()));
		}
		
	}
	public void remove(){
		try {
			 userManagerI.remove(puser);
			super.writeJson(new Message("0000","删除成功！"));
			
		} catch (Exception e) {
			super.writeJson(new Message("9999",e.getMessage()));
		}
	}
	public void login(){
		Tuser u =userManagerI.login(puser);
		if(u!=null){
			super.writeJson(new Message("0000","登录成功"));
		}else{
			super.writeJson(new Message("9999","用户名或者密码不对！"));
			
		}
		
	}
	
	public void datagrid(){
	
		try {
			DataGrid d= userManagerI.datagrid(puser);
			super.writeJson(d);
		} catch (Exception e) {
			super.writeJson(new Message("9999",e.getMessage()));
		}
		
	}
	@Override
	public Puser getModel() {
		// TODO Auto-generated method stub
		return puser;
	}
	
}
