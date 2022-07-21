<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.bootcamp.db.User" %>
<%@ page import="kz.bitlab.bootcamp.db.Item" %>
<body>
    <h1>Hello First JSP</h1>
    <form action="/addItem" method="post">
        Id: <input type="number" name="id">
        Price: <input type="number" name="price">
        Amount: <input type="number" name="amount">
        <button>Add Item</button>
    </form>
    <%
      ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
      if(items != null){
        for(Item item : items){
    %>
    <h4>
      <% out.print(item.getName()); %> - <% out.print(item.getPrice()); %>
    </h4>
    <%
        }
      }
    %>

</body>
</html>
