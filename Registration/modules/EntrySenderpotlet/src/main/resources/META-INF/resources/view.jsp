<%@ include file="/init.jsp" %>


<portlet:actionURL name="studentpage" var="studentpage" />

<h3>SignUp Form</h3>
<aui:form action="<%=studentpage%>" method="Post">

<aui:input type="text" name="name" label="Name">
<aui:validator  name="required"  errorMessage="Field is required" />
 </aui:input>



<aui:input type="text" name="email" label="Email">
<aui:validator  name="required"  errorMessage="Field is required" />
<aui:validator name="email"/>
 </aui:input>
 
<aui:input type="text" name="aadhar" label="Aadhar No.">
<aui:validator  name="required"  errorMessage="Field is required" />
<aui:validator errorMessage="Please enter valid No" 
name="range">[100000000000,9999999999999]</aui:validator>
 </aui:input>

<aui:input type="text" name="pan" label="PAN No.">
<aui:validator  name="required"  errorMessage="Field is required" />
<aui:validator errorMessage="Please enter valid No" 
name="range">[1000000000,9999999999]</aui:validator>
 </aui:input>
 
 
<aui:button type="Submit" value="Submit" />

</aui:form>
