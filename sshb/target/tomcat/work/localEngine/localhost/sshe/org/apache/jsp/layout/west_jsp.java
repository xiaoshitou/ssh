package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class west_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"easyui-panel\" data-options=\"title:'功能导航',border:false,fit:true\">\r\n");
      out.write("\t<div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t\t<div title=\"系统菜单\" data-options=\"iconCls:'icon-save'\">\r\n");
      out.write("\t\t\t<ul id=\"index_tree\" class=\"easyui-tree\" data-options=\"\r\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/menuAction!getTree.action',\r\n");
      out.write("\t\t\t\t\tparentField : 'pid',\r\n");
      out.write("\t\t\t\t\tlines : true,\r\n");
      out.write("\t\t\t\t\tonLoadSuccess:function(node, data){\r\n");
      out.write("\t\t\t\t\t   $(this).tree('collapseAll');\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tonClick : function(node) {\r\n");
      out.write("\t\t\t\t\t\tif (node.attributes.url) {\r\n");
      out.write("\t\t\t\t\t\t\tvar url = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + node.attributes.url;\r\n");
      out.write("\t\t\t\t\t\t\taddTab({\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : node.text,\r\n");
      out.write("\t\t\t\t\t\t\t\tclosable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\thref : url\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\"></ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div title=\"Title2\" data-options=\"iconCls:'icon-reload'\"></div>\r\n");
      out.write("\t</div>\r\n");
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
