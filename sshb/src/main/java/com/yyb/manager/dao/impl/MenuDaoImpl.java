package com.yyb.manager.dao.impl;

import org.springframework.stereotype.Repository;

import com.yyb.manager.dao.MenuDaoI;
import com.yyb.manager.entity.Tmenu;

@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<Tmenu> implements MenuDaoI {

}
