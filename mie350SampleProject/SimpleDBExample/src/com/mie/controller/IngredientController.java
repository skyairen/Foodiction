package com.mie.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mie.dao.IngredientDao;
import com.mie.model.Ingredient;

public class IngredientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/user.jsp";
	private static String LIST_USER = "/listUser.jsp";
	private static String SEARCH_FNAME_USER = "/searchFNUser.jsp";
	private IngredientDao dao;

	public IngredientController() {
		super();
		dao = new IngredientDao();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("delete")) {
//			int userId = Integer.parseInt(request.getParameter("userId"));
//			dao.deleteUser(userId);
//			forward = LIST_USER;
//			request.setAttribute("users", dao.getAllUsers());
		} else if (action.equalsIgnoreCase("edit")) {
//			forward = INSERT_OR_EDIT;
//			int userId = Integer.parseInt(request.getParameter("userId"));
//			User user = dao.getUserById(userId);
//			request.setAttribute("user", user);
		} else if (action.equalsIgnoreCase("listUser")) {
			forward = LIST_USER;
			request.setAttribute("ing", dao.getAllIngredient());
		} else {
//			forward = INSERT_OR_EDIT;
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Ingredient ingredient = new Ingredient();
		ingredient.setName(request.getParameter("name"));
//		try {
//			Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(request
//					.getParameter("dob"));
//			ingredient.setName(dob);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		ingredient.setEmail(request.getParameter("email"));
//		String userid = request.getParameter("userid");
//		if (userid == null || userid.isEmpty()) {
//			dao.addUser(ingredient);
//		} else {
//			ingredient.setUserid(Integer.parseInt(userid));
//			dao.updateUser(ingredient);
//		}
		RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
		request.setAttribute("ing", dao.getAllUsers());
		view.forward(request, response);
	}
}