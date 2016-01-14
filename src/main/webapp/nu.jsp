<%@ page import="nl.rug.esi.Nu" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<%@ taglib prefix="ng" uri="/bbNG" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  Nu nu = new Nu();
  request.setAttribute("titles", nu.getTitles());
%>
<ng:genericPage>
  <h1>Headlines from Nu.nl</h1>
  <ul>
    <c:forEach items="${titles}" var="title">
      <li>${title}</li>
    </c:forEach>
  </ul>
</ng:genericPage>