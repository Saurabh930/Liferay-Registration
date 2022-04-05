package com.entry.portlet;

import com.entry.constants.EntryPortletKeys;
import com.entryservice.model.Employ;
import com.entryservice.service.EmployLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Lenovo
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Entry",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EntryPortletKeys.ENTRY,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EntryPortlet extends MVCPortlet {
	 int count=0;
	@ProcessAction(name="studentpage")
	public void studentpage(ActionRequest request , ActionResponse response) throws IOException, PortletException
	{
		
		String name= ParamUtil.getString(request,"name");
		String email = ParamUtil.getString(request,"email");
		String aadhar = ParamUtil.getString(request,"aadhar");
		String pan = ParamUtil.getString(request,"pan");

		try {
			for(int i=1; i<=EmployLocalServiceUtil.getEmploysCount();i++) {
				if(EmployLocalServiceUtil.getEmploy(i).getAadhar().equals(aadhar)) {
					++count;
					
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(count<=2)
		{
		try {
			Employ emp = EmployLocalServiceUtil.createEmploy(CounterLocalServiceUtil.increment());
			emp.setName(name);
			emp.setEmail(email);
			emp.setAadhar(aadhar);
			emp.setPan(pan);
			EmployLocalServiceUtil.addEmploy(emp);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
		else
		{
			System.out.println("</h1>You have entered twice with same Aadhar</h1>");
		}
		
	}

}