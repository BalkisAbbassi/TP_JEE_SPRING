<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title> Affichages des Comptes</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>

<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>N° Compte</th>
        <th>Date Creation</th>
        <th>Type Compte</th>
        <th>Solde</th>
    </tr>
    </thead>
    <tbody>
    <c: forEach items="${user}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.num_Compte}</td>
            <td>${c.Date_Creation}</td>
            <td>${c.type_Compte}</td>
            <td>${c.solde}</td>

        </tr>
    </c: forEach>
    </tbody>
</table>
</body>
</html>