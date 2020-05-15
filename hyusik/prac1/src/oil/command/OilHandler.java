package oil.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.service.NotFoundException;
import mvc.command.CommandHandler;
import oil.Service.OilData;
import oil.Service.OilService;

public class OilHandler implements CommandHandler {
	
	private OilService oilService=new OilService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("OilHandler");
		try {
			OilData oil=oilService.getOil();
			request.setAttribute("oil",oil);
			return "/oilprice/oilprice.jsp";
		}catch(NotFoundException e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		return null;
	}

}
