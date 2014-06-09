package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yhgl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#admin_yhgl_datagrid').datagrid({\r\n");
      out.write("\t\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userAction!datagrid.action',\r\n");
      out.write("\t\t\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\t\t\tborder : false,\r\n");
      out.write("\t\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\t\tidField : 'id',\r\n");
      out.write("\t\t\t\t\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\t\t\t\t\tpageList : [ 10, 20, 30, 40, 50 ],\r\n");
      out.write("\t\t\t\t\t\t\tsortName : 'name',\r\n");
      out.write("\t\t\t\t\t\t\tsortOrder : 'asc',\r\n");
      out.write("\t\t\t\t\t\t\tfrozenColumns : [ [ {\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\tcheckbox : true\r\n");
      out.write("\t\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : '登录名称',\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t} ] ],\r\n");
      out.write("\t\t\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'pwd',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '密码',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(value, row, index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn '******';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'modifydatetime',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '最后修改时间',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} ] ],\r\n");
      out.write("\t\t\t\t\t\t\ttoolbar : [ {\r\n");
      out.write("\t\t\t\t\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\t\t\t\t\ttext : '增加',\r\n");
      out.write("\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#admin_yhgl_add').dialog('open');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#admin_yhgl_addForm input').val('');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}, '-', {\r\n");
      out.write("\t\t\t\t\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\t\t\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tedit();\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}, '-', {\r\n");
      out.write("\t\t\t\t\t\t\t\ticonCls : 'icon-remove',\r\n");
      out.write("\t\t\t\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tremove();\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\t\t\tonDblClickRow : function(rowIndex, rowData) {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(rowData.name);\r\n");
      out.write("\t\t\t\t\t\t\t\tconsole.info(rowData);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t$('#admin_yhgl_addForm').form({\r\n");
      out.write("\t\t\t url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userAction!add.action',\r\n");
      out.write("\t\t\t success : function(r) {\r\n");
      out.write("\t\t\t\t\tvar obj = jQuery.parseJSON(r);\r\n");
      out.write("\t\t\t\t\tif (obj.code == '0000' ) {\r\n");
      out.write("\t\t\t\t\t\t$('#admin_yhgl_add').dialog('close');\r\n");
      out.write("\t\t\t\t\t\t$('#admin_yhgl_datagrid').datagrid('insertRow',{\r\n");
      out.write("\t\t\t\t\t\t\tindex:0,\r\n");
      out.write("\t\t\t\t\t\t\trow:obj.obj\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\ttitle : '提示',\r\n");
      out.write("\t\t\t\t\t\tmsg : obj.message\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction searchFun() {\r\n");
      out.write("\t\t$('#admin_yhgl_datagrid').datagrid('load', serializeObject($('#admin_yhgl_serachForm')));\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction clearFun() {\r\n");
      out.write("\t\t$('#admin_yhgl_layout input[name=name]').val('');\r\n");
      out.write("\t\t$('#admin_yhgl_datagrid').datagrid('load', {});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction remove(){\r\n");
      out.write("\t\tvar rows = $('#admin_yhgl_datagrid').datagrid('getChecked');\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tif(rows.length>0){\r\n");
      out.write("\t\t\t$.messager.confirm('确认','您是否要删除当前选中的项目？',function(r){\r\n");
      out.write("\t\t\t\tif (r){\r\n");
      out.write("\t\t\t\t\tfor ( var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tids.push(rows[i].id);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userAction!remove.action',\r\n");
      out.write("\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\tids : ids.join(',')\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(r) {\r\n");
      out.write("\t\t\t\t\t\t\t$('#admin_yhgl_datagrid').datagrid('load');\r\n");
      out.write("\t\t\t\t\t\t\t$('#admin_yhgl_datagrid').datagrid('unselectAll');\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : '提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg : r.message\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'提示',\r\n");
      out.write("\t\t\t\tmsg:'请勾选要删除的记录！',\r\n");
      out.write("\t\t\t\ttimeout:5000,\r\n");
      out.write("\t\t\t\tshowType:'slide'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction edit(){\r\n");
      out.write("\t\tvar rows = $('#admin_yhgl_datagrid').datagrid('getChecked');\r\n");
      out.write("\t\tif(rows.length == 1){\r\n");
      out.write("\t\t\tvar d = $('<div/>').dialog({\r\n");
      out.write("\t\t\t\twidth : 500,\r\n");
      out.write("\t\t\t\theight : 200,\r\n");
      out.write("\t\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/yhglEdit.jsp',\r\n");
      out.write("\t\t\t\tmodal : true,\r\n");
      out.write("\t\t\t\ttitle : '编辑用户',\r\n");
      out.write("\t\t\t\tbuttons : [{\r\n");
      out.write("\t\t\t\t\ttext:'编辑',\r\n");
      out.write("\t\t\t\t\thandler : function(){\r\n");
      out.write("\t\t\t\t\t\t$('#admin_yhgl_editForm').form('submit', {\r\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userAction!edit.action',\r\n");
      out.write("\t\t\t\t\t\t\tsuccess: function(r){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar obj = jQuery.parseJSON(r);\r\n");
      out.write("\t\t\t\t\t\t\t\tif (obj.code == '0000') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\td.dialog('close');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#admin_yhgl_datagrid').datagrid('updateRow',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{index:$('#admin_yhgl_datagrid').datagrid('getRowIndex',rows[0]),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trow:obj.obj\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '提示',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmsg : obj.message\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}],\r\n");
      out.write("\t\t\t\tonClose : function(){\r\n");
      out.write("\t\t\t\t\t$(this).dialog('destroy');\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tonLoad : function(){\r\n");
      out.write("\t\t\t\t\t$('#admin_yhgl_editForm').form('load',rows[0]);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$.messager.alert('提示','请选择一条记录进行编辑！');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"admin_yhgl_layout\" class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t<div data-options=\"region:'north',title:'查询条件',border:false\" style=\"height:120px;\" align=\"center\">\r\n");
      out.write("\t<form id=\"admin_yhgl_serachForm\">\r\n");
      out.write("\t\t检索用户名称(可模糊查询)：<input name=\"name\" /> \r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\"onclick=\"searchFun();\">查询</a> \r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\" onclick=\"clearFun();\">清空</a>\r\n");
      out.write("     </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div data-options=\"region:'center'\">\r\n");
      out.write("\t\t<div id=\"admin_yhgl_datagrid\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"admin_yhgl_add\" class=\"easyui-dialog\" title=\"增加人员\" style=\"width: 500px;height:200px;\" align=\"center\"\r\n");
      out.write("\tdata-options=\"iconCls:'icon-save',closed:true,resizable:false,modal:true,buttons:[{\r\n");
      out.write("\t\t\t\ttext:'确定',\r\n");
      out.write("\t\t\t\ticonCls:'icon-ok',\r\n");
      out.write("\t\t\t\thandler:function(){$('#admin_yhgl_addForm').submit();}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\ttext:'重置',\r\n");
      out.write("\t\t\t\ticonCls:'icon-undo',\r\n");
      out.write("\t\t\t\thandler:function(){$('#admin_yhgl_addForm input').val('');}\r\n");
      out.write("\t\t\t}]\" >\r\n");
      out.write("\t<form id=\"admin_yhgl_addForm\" method=\"post\" >\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>编号</th>\r\n");
      out.write("\t\t\t\t<td><input name=\"id\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<th>登录名称</th>\r\n");
      out.write("\t\t\t\t<td><input name=\"name\" class=\"easyui-validatebox\" data-options=\"required:true\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>密码</th>\r\n");
      out.write("\t\t\t\t<td><input name=\"pwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:true\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<th>创建时间</th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input class=\"easyui-datetimebox\" name=\"createdatetime\" data-options=\"showSeconds:false\"  style=\"width:150px\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>最后修改时间</th>\r\n");
      out.write("\t\t\t\t<td><input class=\"easyui-datetimebox\" name=\"modifydatetime\" data-options=\"showSeconds:false\"  style=\"width:150px\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
