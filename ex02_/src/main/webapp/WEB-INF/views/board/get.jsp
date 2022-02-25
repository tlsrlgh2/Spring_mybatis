<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Read
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        		<div class="form-group">
	                                <label>bno</label>
	                                <input class="form-control" name="bno" readonly="readonly" value="<c:out value="${board.bno}"/>">
                                </div>
                   				<div class="form-group">
	                                <label>Title</label>
	                                <input class="form-control" name="title" readonly="readonly" value="<c:out value="${board.title}"/>">
                                </div>
                                <div class="form-group">
	                                <label>Content</label>
	                                <textarea class="form-control" rows="5" cols="50" name="content">
	                                	<c:out value="${board.content}"/>
	                                </textarea>
                                </div>	
                                 <div class="form-group">
	                                <label>Writer</label>
	                                <input class="form-control" name="writer" value="<c:out value="${board.writer}"/>">
                                </div>	
                                <button type="submit" class="btn btn-default">Submit Button</button>
                                <button type="reset" class="btn btn-default">Reset Button</button>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
<%@include file="../includes/footer.jsp" %>