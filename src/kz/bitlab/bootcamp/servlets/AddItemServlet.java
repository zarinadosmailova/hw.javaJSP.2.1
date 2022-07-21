package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.DBManager;
import kz.bitlab.bootcamp.db.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        double price = Integer.parseInt(request.getParameter("price"));
        int amount = Integer.parseInt(request.getParameter("amount"));

        Item item = new Item();
        item.setId(id);
        item.setPrice(price);
        item.setAmount(amount);
        DBManager.addItem(item);

        response.sendRedirect("/addItem?success=1");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getRequestDispatcher("/addItem.jsp").forward(request, response);
    }
}