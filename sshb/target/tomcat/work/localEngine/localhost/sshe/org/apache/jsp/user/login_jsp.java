package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#user_login_loginForm').form({\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userAction!login.action',\r\n");
      out.write("\t\t\tsuccess : function(r) {\r\n");
      out.write("\t\t\t\tvar obj = jQuery.parseJSON(r);\r\n");
      out.write("\t\t\t\tif (obj.code == '0000') {\r\n");
      out.write("\t\t\t\t\t$('#user_login_loginDialog').dialog('close');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\t\ttitle : '提示',\r\n");
      out.write("\t\t\t\t\tmsg : obj.message\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#user_login_loginForm input').bind('keyup', function(event) {/* 增加回车提交功能 */\r\n");
      out.write("\t\t\tif (event.keyCode == '13') {\r\n");
      out.write("\t\t\t\t$('#user_login_loginForm').submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\twindow.setTimeout(function() {\r\n");
      out.write("\t\t\t$('#user_login_loginForm input[name=name]').focus();\r\n");
      out.write("\t\t}, 0);\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"user_login_loginDialog\" class=\"easyui-dialog\" data-options=\"title:'登录',modal:true,closable:false,buttons:[{\r\n");
      out.write("\t\t\t\ttext:'注册',\r\n");
      out.write("\t\t\t\ticonCls:'icon-edit',\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t$('#user_reg_regDialog').dialog('open');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\ttext:'登录',\r\n");
      out.write("\t\t\t\ticonCls:'icon-help',\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t$('#user_login_loginForm').submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}]\">\r\n");
      out.write("\t<form id=\"user_login_loginForm\" method=\"post\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>登录名</th>\r\n");
      out.write("\t\t\t\t<td><input name=\"name\" class=\"easyui-validatebox\" data-options=\"required:true,missingMessage:'登陆名称必填'\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>密码</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"pwd\" class=\"easyui-validatebox\" data-options=\"required:true,missingMessage:'密码必填'\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>");
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
