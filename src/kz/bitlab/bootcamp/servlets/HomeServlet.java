package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.Item;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/indexpage")
public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int id = 0;
        ArrayList<Item> items = DBManager.getItems(id);

        request.setAttribute("items", items);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

