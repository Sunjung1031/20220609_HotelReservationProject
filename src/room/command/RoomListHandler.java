package room.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;


public class RoomListHandler implements CommandHandler {
	
	@Override
	public String process(HttpServletRequest rq, HttpServletResponse rp) throws Exception {
		if (rq.getMethod().equals("POST"))
			return processPost(rq, rp);
		else if (rq.getMethod().equals("GET"))
			return processGet(rq, rp);
		else
			return null;
	}
	private String processGet(HttpServletRequest rq, HttpServletResponse rp) {
		return "/WEB-INF/view/room/roomList.jsp";
		
	}
	private String processPost(HttpServletRequest rq, HttpServletResponse rp) {
		return "/WEB-INF/view/room/roomList.jsp";
	}
	
	
}