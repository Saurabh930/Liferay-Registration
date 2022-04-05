package com.producer.portlet;

import com.producer.constants.producerPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

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
		"javax.portlet.display-name=producer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + producerPortletKeys.PRODUCER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-public-render-parameter=message"
	},
	service = Portlet.class
)
public class producerPortlet extends MVCPortlet {
	
	@SuppressWarnings("deprecation")
	@ProcessAction(name="pro")
	public void producer(ActionRequest request,ActionResponse response ) 
	{
		String message=ParamUtil.getString(request,"message");
	     response.setRenderParameter("message", message);
	}
	
}