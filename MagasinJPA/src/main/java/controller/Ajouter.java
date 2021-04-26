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
 * Servlet implementation class Ajouter
 */
@WebServlet("/Ajouter")
public class Ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
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
		String Nom = request.getParameter("txtNom");
		String Prenom = request.getParameter("txtPrenom");
		String Adresse = request.getParameter("txtAdresse");
		int code = Integer.parseInt(request.getParameter("txtCode"));
		String ville = request.getParameter("txtVille");
		String telephone = request.getParameter("txtTel");			
			Client C= new Client(mail,Nom,Prenom,Adresse,code,ville,telephone,password );
			Manager M = new Manager();
			M.AjouterClient(C);
			RequestDispatcher requestDispatcher = request
			        .getRequestDispatcher("accueil1.jsp");
			requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

