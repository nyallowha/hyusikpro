package admin.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.service.NotFoundException;
import mvc.command.CommandHandler;


public class AdminHandler implements CommandHandler {
	
	//private OilService oilService=new OilService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("AdminInfoHandler");
		try {
			//OilData oil=oilService.getOil();
			//request.setAttribute("oil",oil);
			return "/admin/admin.jsp";
		}catch(NotFoundException e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		return null;
	}

}
