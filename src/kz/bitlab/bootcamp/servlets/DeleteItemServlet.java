package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.DBManager;
import kz.bitlab.bootcamp.db.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteItem")
public class DeleteItemServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));

        Item item = new Item();
        item.setId(id);

        if(item != null){
            DBManager.deleteItem(item);
        }

        response.sendRedirect("/");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getRequestDispatcher("/deleteItem.jsp").forward(request, response);
    }
}