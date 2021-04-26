package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Manager;
import model.Client;


/**
 * Servlet implementation class Enregistrer
 */
@WebServlet("/Enregistrer")
public class Enregistrer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Manager M= new Manager();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enregistrer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail= request.getParameter("txtEmail");
		String password= request.getParameter("txtPassword");
		Client C=new Client(mail,password);
		try {
			if(M.Check(C)==true) {
	            RequestDispatcher requestDispatcher = request
	                    .getRequestDispatcher("accueil1.jsp");
	            requestDispatcher.forward(request, response);        
			}
			else {
				RequestDispatcher requestDispatcher = request
	                    .getRequestDispatcher("accueil.jsp");
	            requestDispatcher.forward(request, response);       
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher requestDispatcher = request
                    .getRequestDispatcher("accueil.jsp");
            requestDispatcher.forward(request, response);  
            System.out.println("une erruer est produite");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
