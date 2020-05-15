package admin.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import info.service.InfoData;
import info.service.InfoService;
import info.service.NotFoundException;
import mvc.command.CommandHandler;

public class InfoUpHandler implements CommandHandler {
	private InfoService infoService=new InfoService();

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("infoHandler");
		String reststr=request.getParameter("site");
		int restno = 0;
		if(reststr!=null) {
			restno=Integer.parseInt(reststr);
		}
		try {
			InfoData infoData=infoService.getInfo(restno);
			request.setAttribute("infoData", infoData);
			return "/admin/info_update.jsp";
		}catch(NotFoundException e) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
				
		return null;
	}

}
