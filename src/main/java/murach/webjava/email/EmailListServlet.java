package murach.webjava.email;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import murach.webjava.business.User;
import murach.webjava.dao.DAO;

@WebServlet(name = "emailListServlet", value = "/emailListServlet")
public class EmailListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/ass1.html";
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        {
            if (action == null) {
                action = "join";
            }
            if (action.equals("join")) {
                url = "/ass1.html";
            } else if (action.equals("add")) {
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String email = request.getParameter("email");
                User user = new User(firstName, lastName, email);
                //DAO.insert(user);
                request.setAttribute("user", user);
                url = "/thank.jsp";
            }

            getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
