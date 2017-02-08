<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@page import="components.controller.*, java.util.*"%>
<%@ page import="components.model.Person" %>

<div>
  <h2>List of Persons</h2>

  <table title="List Of Persons" border="1">
    <tr>
      <th>Name</th>
      <th>Age</th>
    </tr>

    <%
      List<Person> personList = (List<Person>)request.getAttribute("persons");
      System.out.println(personList);
      for(Person person: personList){
        out.println("<tr>");
        out.println("<td>" + person.getName() + "</td>");
        out.println("<td>" + person.getAge() + "</td>");
        out.println("</tr>");
      }

    %>

  </table>

</div>
