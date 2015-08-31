<%-- 
    Document   : checkWeather
    Created on : Aug 30, 2015, 4:18:39 PM
    Author     : sbitrakanti
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Check Weather by Zipcode</h2>
        <form name="invoker" action="invokeServlet" method="POST">
            <input type="text" name="zipcode" value="92126" size="33" />
            <input type="submit" value="submit" name="Lookup" />
        </form>

    </body>
</html>
