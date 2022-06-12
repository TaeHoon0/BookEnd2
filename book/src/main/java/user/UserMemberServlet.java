package user;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import bean.AES;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/userMember.do")
public class UserMemberServlet extends HttpServlet{
	RequestDispatcher rd;
	SimpleDateFormat sdf;
	UserMemberDao dao;
	AES aes;
	String memberBase = "user/member/user_member_";
	String url="";
	String job="";
	
	public UserMemberServlet() {
		sdf = new SimpleDateFormat("yyyy-HH-dd");
		dao = new UserMemberDao();
		aes = new AES();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		job = req.getParameter("job");
		
		switch(job) {
			case "memberJoin" :
				memberJoin(req, resp);
				break;
			
			case "uIdValidation" :
				System.out.println("aaa");
				break;
				
			case "memberLogin" :
				memberLogin(req, resp);
				break;
			
			case "memberFindUidPhone" :
				memberFindUidPhone(req, resp);
				break;
				

			case "memberFindUidEmail" :
				memberFindUidEmail(req, resp);
				break;
			
			case "memberFindPwd" :
				memberFindPwd(req, resp);
				break;
				
			default :
				
		}
	}
	
	public void memberJoin(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException, NumberFormatException {
		UserMemberVo vo = new UserMemberVo();
		String address = req.getParameter("address1") + " " + req.getParameter("address2");
		String pwd = aes.enc(req.getParameter("pwd"));
		
		vo.setuId(req.getParameter("uId"));
		vo.setPwd(pwd);
		vo.setuName(req.getParameter("uName"));
		vo.setBirth(req.getParameter("birth"));
		vo.setPhone(req.getParameter("phone"));
		vo.setEmail(req.getParameter("email"));
		vo.setZipCode(req.getParameter("zipCode"));
		vo.setAddress(address);
		vo.setGender(req.getParameter("gender"));
		vo.setJoinDate(sdf.format(System.currentTimeMillis())); // 현재날짜
		vo.setJob("");
		
		if(dao.userMemberJoin(vo)) {
			req.setAttribute("msg", "회원가입 되었습니다.");
		} else {
			req.setAttribute("msg", "회원가입 중 오류가 발생했습니다.");
		}
		
		rd = req.getRequestDispatcher(url);
		rd.forward(req, resp);
	}
	
	public void memberLogin(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	}
	
	public void memberFindUidPhone(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
	}
	
	public void memberFindUidEmail(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
	}
	
	public void memberFindPwd(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
	}
}
