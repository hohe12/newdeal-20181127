<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jquery.ajax.comment.CommentDAO" %>
<%@ page import="com.jquery.ajax.comment.CommentVO" %>
<%@ page import ="java.util.List" %>
<%@ page import="net.sf.json.JSONArray" %>

<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	int bbsSeq = Integer.parseInt(request.getParameter("bbsSeq"));
	//System.out.println(bbsSeq + " / " + comment);
	
	CommentDAO dao = CommentDAO.getInstance();
	dao.removeComment(seq);
	Object obj = dao.getCommentList(bbsSeq);
	//덧글삭제
	//dao.addComment(comment);
    //삭제기능 구현하세요
	
	//JSON 데이터
	JSONArray jsonarray = JSONArray.fromObject(obj); //JSONArray.fromObject(commentlist);
%>
<%=jsonarray %>











