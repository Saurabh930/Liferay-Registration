<%@ include file="/init.jsp" %>

 
 
 <h1>Producer</h1>
<portlet:actionURL name="producer" var="producer">
</portlet:actionURL>

<form action="${producer}" method="POST">

<input type="text" name="<portlet:namespace/>message">
<input type="submit">
</form>