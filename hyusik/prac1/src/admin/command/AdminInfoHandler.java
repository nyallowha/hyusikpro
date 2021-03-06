package admin.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.service.AdminInfoService;
import info.service.InfoData;
import info.service.NotFoundException;
import mvc.command.CommandHandler;

public class AdminInfoHandler implements CommandHandler {
	
	private AdminInfoService adminIfoService=new AdminInfoService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("AdminInfoHandler");
		try {
			InfoData restnames=adminIfoService.getRestInfo();
			request.setAttribute("restnames",restnames);
			return "/admin/admin_info.jsp";
		}catch(NotFoundException e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		return null;
	}

}
