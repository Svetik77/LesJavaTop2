package ru.javawebinar.topjava.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.repository.mock.MockUserRepositoryImpl;
import ru.javawebinar.topjava.util.UserUtils;

/**
 * Servlet implementation class UserServlet
 */
 @WebServlet("/users")
public class UserServlet extends HttpServlet {
	private static final Logger LOG = LoggerFactory.getLogger(UserServlet.class);
	private static final long serialVersionUID = 1L;
	private static UserRepository repository;   
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		repository = new MockUserRepositoryImpl();
	}

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
 		request.setAttribute("users", UserUtils.USERS);
 		 String action = request.getParameter("action");
 		 
 		 
		 request.getRequestDispatcher("/users.jsp").forward(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
