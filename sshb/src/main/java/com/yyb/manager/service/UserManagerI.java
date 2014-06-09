package com.yyb.manager.service;

import java.io.Serializable;

import com.yyb.manager.entity.Tuser;
import com.yyb.manager.pageModel.DataGrid;
import com.yyb.manager.pageModel.Pmenu;
import com.yyb.manager.pageModel.Puser;

public interface UserManagerI {
	public Puser add(Puser user);

	public void remove(Puser user);

	public Tuser login(Puser user);

	public DataGrid datagrid(Puser puser);

	public Puser edit(Puser puser);
}
