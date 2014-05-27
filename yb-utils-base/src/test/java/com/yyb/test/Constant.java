package com.yyb.test;

import java.io.File;
import java.util.List;

public class Constant {
	/**
	 * 路径常量
	 */
  static final String TARGETDIR = System.getProperty("user.dir")+File.separator + "target"+File.separator;
  static final String PROJECTDIR = System.getProperty("user.dir")+File.separator;
  static final String GENERATEDIR = System.getProperty("user.dir")+File.separator +"generate"+File.separator;
  static final String RESOURCESDIR = System.getProperty("user.dir")+File.separator + "src"+File.separator+ "test"+File.separator+ "resources"+File.separator;
  
  /**
   * module 相关常量，每一个module 定义一个
   */
  static final String MODULEPATH="com.yyb.manager";
  static final String[] ENTITYNAMES = new String[]{"user","menu"} ;
}
