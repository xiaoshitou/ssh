package com.yyb.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.yb.local.BeanUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

public class FreemarkerUtil {
	public static void main(String[] args) throws Exception {
		FreemarkerUtil f = new FreemarkerUtil();
		f.getModule();
	}

	/**
	 * 根据Constant里配置的module和entity产生 一套  三层结构
	 */
	public void getModule() {
		getDao();getDaoImpl();getServiceI();getServiceImpl(); getAction();
	}

	public void getDao() {
		for (String entity : Constant.ENTITYNAMES) {
			TaskVO t = new TaskVO();
			t.setFtlName("Dao.ftl");
			t.setGenerateName(entity.substring(0, 1).toUpperCase() + entity.substring(1) + "DaoI.java");
			t.setPackageName(Constant.MODULEPATH + ".dao");// com.yyb.manager.dao
			t.setEntityPath(Constant.MODULEPATH + ".entity");// com.yyb.manager.entity
			t.setModelName("T" + entity);// Tuser
			generateFile(t);
		}
	}

	public void getDaoImpl() {
		for (String entity : Constant.ENTITYNAMES) {
			TaskVO t = new TaskVO();
			t.setFtlName("DaoImpl.ftl");
			t.setGenerateName(entity.substring(0, 1).toUpperCase()+ entity.substring(1) + "DaoImpl.java");// UserDaoImpl.java
			t.setPackageName(Constant.MODULEPATH + ".dao.impl");
			t.setEntityPath(Constant.MODULEPATH + ".entity");
			t.setModelName("T" + entity);
			t.setDaoPath(Constant.MODULEPATH + ".dao");
			generateFile(t);
		}
	}

	public void getServiceI() {
		for (String entity : Constant.ENTITYNAMES) {
			TaskVO t = new TaskVO();
			t.setFtlName("ServerI.ftl");
			t.setGenerateName(entity.substring(0, 1).toUpperCase()+ entity.substring(1) + "ServiceI.java");
			t.setPackageName(Constant.MODULEPATH +".service");
			t.setpModelPath(Constant.MODULEPATH +".pageModel");
			t.setpModelName("P"+entity);
			generateFile(t);
		}
	}

	public void getServiceImpl() {
		for (String entity : Constant.ENTITYNAMES) {
		TaskVO t = new TaskVO();
		t.setFtlName("ServerImpl.ftl");
		t.setGenerateName(entity.substring(0, 1).toUpperCase()+ entity.substring(1) + "ServiceImpl.java");
		t.setPackageName(Constant.MODULEPATH +".service");
		t.setEntityPath(Constant.MODULEPATH +".entity");
		t.setpModelPath(Constant.MODULEPATH +".pageModel");
		t.setModelName("T"+entity);
		t.setpModelName("P"+entity);
		generateFile(t);}
	}

	public void getAction() {
		for (String entity : Constant.ENTITYNAMES) {
			TaskVO t = new TaskVO();
			t.setFtlName("Action.ftl");
			t.setGenerateName(entity.substring(0, 1).toUpperCase()+ entity.substring(1) + "Action.java");
			t.setPackageName(Constant.MODULEPATH + ".action");
			t.setEntityPath(Constant.MODULEPATH + ".entity");
			t.setpModelPath(Constant.MODULEPATH + ".pageModel");
			t.setModelName("T" + entity);
			t.setpModelName("P" + entity);
			generateFile(t);
		}
	}

	/**
	 * ftl 必须放在src/test/resources目录下
	 * 
	 * @param param
	 *            <generateName ftlName root>
	 */
	private  void generateFile(TaskVO t) {
		if (t.getGenerateName() == null || t.getFtlName() == null) {
			System.err
					.println("oh!lack of some params  that is must,Be sure 'generateName' 'ftlName' is passed");
			return;
		}
		// 生产模板需要的参数
		Map<String, Object> param = BeanUtils.model2Map(t);

		Configuration cfg = new Configuration();
		try {
			cfg.setDirectoryForTemplateLoading(new File(Constant.RESOURCESDIR));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// Some other recommended settings:
		cfg.setIncompatibleImprovements(new Version(2, 3, 20));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setLocale(Locale.US);
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		Writer fileWriter = null;
		File outputFile = new File(Constant.GENERATEDIR
				+ param.get("generateName").toString());
		try {
			File dir = new File(Constant.GENERATEDIR);
			if (!(dir.isDirectory() && dir.exists())) {
				dir.mkdirs();
			}
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}
			Template template = cfg
					.getTemplate(param.get("ftlName").toString());
			fileWriter = new FileWriter(outputFile);
			template.process(param, fileWriter);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
