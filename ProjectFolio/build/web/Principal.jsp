<%-- 
    Document   : Principal
    Created on : 28-dic-2022, 19:56:48
    Author     : daya_
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
      
  <div class="container">
      <div class="row justify-content-end">
          <div class="col-2">
      
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
              ${usuario.getNom()}
            </button>
            <ul class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton1">
              <li><a class="dropdown-item" href="#">Usuario: ${usuario.getNom()}</a></li>
              <div class="dropdown-divider"></div>
              <form action="Validar" method="POST">
              <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button></li>
              </form>
            </ul>
   
              </div>
          </div>
         
             <!-- tabla -->
             
             <form class="row mt-4" action="Controlador?accion=Buscar" method="POST">
                 <div class="col-2">
                     <input class="form-control me-2" type="text" placeholder="" aria-label="Buscar" name="folio">
                </div>
                 <div class="col-2">
                     <button class="btn btn-outline-success" type="submit" value="BuscarProducto" name="accion">Buscar</button>
                 </div>
                
                 <input class="form-control me-2" type="text" placeholder="" aria-label="Buscar" name="folioproduc" value="${numero.getProducto()}">
            </form>
          
             
             <div class="card mt-4">
             <table class="table table-hover">
                 <thead>
                     <tr>
                         <th>No</th>
                         <th>Producto</th>
                         <th>Cantidad</th>
                         <th>Precio unitario</th>
                         <th>Total</th>
                     </tr>
                 </thead>
                 <tbody>
                     <c:forEach var="pr" items="${productos}">
                     <tr>
                         <td>${pr.getId()}</td>
                         <td>${pr.getProducto()}</td>
                         <td>${pr.getCantidad()}</td>
                         <td>${pr.getPreciou()}</td>
                         <td>${pr.getTotal()}</td>
                     </tr>
                     </c:forEach>
                 </tbody>
             </table>
              
              </div>
  </div>
              
              
              
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
