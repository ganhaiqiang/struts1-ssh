package org.ssh.demo.action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.struts.DispatchActionSupport;
import org.ssh.demo.forms.CalculatorActionForm;
import org.ssh.demo.service.UserService;

import com.alibaba.fastjson.JSON;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-05-26 13:49
 */
public class CalculatorAction extends DispatchActionSupport {
	private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorAction.class);

	public ActionForward calc(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserService userService = (UserService) getWebApplicationContext().getBean("userService");
		List<Object[]> list = userService.getAllUser();
		LOGGER.info(JSON.toJSONString(list, true));

		CalculatorActionForm cActionForm = (CalculatorActionForm) form;
		double a = cActionForm.getParam1();
		double b = cActionForm.getParam2();
		String operator = cActionForm.getOperator();
		LOGGER.info("a=" + a + ",b=" + b + ",operator=" + operator);
		double rightRst = 0.0;
		try {
			if ("+".equals(operator)) {
				rightRst = a + b;
			} else if ("-".equals(operator)) {
				rightRst = a - b;
			} else if ("*".equals(operator)) {
				rightRst = a * b;
			} else if ("/".equals(operator)) {
				rightRst = a / b;
			}
			request.setAttribute("result", rightRst);
			return mapping.findForward("success");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return mapping.findForward("error");
	}

	public ActionForward getJson(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String appName = MessageResources.getMessageResources("i18n/MessageResources").getMessage(Locale.US,
				"app.name");
		LOGGER.info("appName=" + appName);

		UserService userService = (UserService) getWebApplicationContext().getBean("userService");
		List<Object[]> list = userService.getAllUser();

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(JSON.toJSONString(list));
		pw.flush();
		return mapping.findForward(null);
	}

	public ActionForward setLang(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String lang = request.getParameter("lang");

		Locale currentLocale = Locale.getDefault();
		if ("zh_CN".equals(lang)) {
			currentLocale = new Locale("zh", "CN");
		} else if ("en_US".equals(lang)) {
			currentLocale = new Locale("en", "US");
		}

		// 自己设置Locale
		// request.getSession().setAttribute(Globals.LOCALE_KEY, currentLocale);
		// 调用struts中提供的方法设置Locale
		this.setLocale(request, currentLocale);
		return mapping.findForward("index");
	}
}
