


<%@ page import="DBconnetion.DBconnection"%>
<%@ page import="jakarta.servlet.RequestDispatcher"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Boxicons -->
	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
	<!-- My CSS -->
	<link rel="stylesheet" href="admin.css">
	    <!-- Vendor CSS Linkks -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.min.css" rel="stylesheet">

    <!-- Vendor Script Linkks -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,700;0,900;1,300;1,400;1,500&display=swap"
      rel="stylesheet" />

    <!-- Main CSS Files -->
    <link href="css2/bootstrap.min.css" rel="stylesheet" />
    <link href="css2/style.css" rel="stylesheet" />
    <link href="css2/styleprofile.css" rel="stylesheet" />
     <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

	<title>Event Admin</title>
</head>
<body>


	<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-smile'></i>
			<span class="text">Event Admin</span>
		</a>
		<ul class="side-menu top">
			<li class="active">
				<a href="#">
					<i class='bx bxs-dashboard' ></i>
					<span class="text" >Dashboard</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-shopping-bag-alt' ></i>
					<span class="text" >Ads</span>
				</a>
			</li>
			<li>
				<a href="inventoryadmin.html">
					<i class='bx bxs-doughnut-chart' ></i>
					<span class="text" >Our Stocks</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-message-dots' ></i>
					<span class="text" >Message</span>
				</a>
			</li>
			<li>
				<a href="admincustomers.html">
					<i class='bx bxs-group' ></i>
					<span class="text">Users</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text" >Settings</span>
				</a>
			</li>
			<li>
				<a href="#" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text" >Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->



	<!-- CONTENT -->
	<section id="content">
		
		
		
		 <section style="margin-left: 50px;margin-top: -30px;margin-right: 100px;font-size:medium;">

       
    <div class="d-flex justify-content-center align-items-center vh-100">
        
        <form action="<%= request.getContextPath() %>/adminupdatedetails" method="post">

            <h4 class="display-4  fs-1">Edit Profile</h4><br>
            <!-- error -->
            
           
          
            
            <!-- success -->
           
           <div class="mb-3">
         <p>User id:</p>
            <input  type="text" 
                   class="form-control"
                   name="id"
                   value="<%=session.getAttribute("cusID") %>" style="width:180%;">
          </div>
            
          <div class="mb-3">
           <p>User Name:</p>
            <input type="text" 
                   class="form-control"
                   name="name"
                   value="<%=session.getAttribute("name1") %>" style="width:180%;">
          </div>

          <div class="mb-3">
            <p>Email:</p>
            <input type="text" 
                   class="form-control"
                   name="email"
                   value="<%=session.getAttribute("mail") %>" style="width:180%;">
          </div>
         
               
           
               
          <div class="mb-3">
           <p>User id:</p>
            <input type="file" 
                   class="form-control"
                   name="pp" style="width:180%;">
            <img src=""
                 class="rounded-circle"
                 style="width: 70px">
            <input type="text"
                   hidden="hidden" 
                   name="old_pp"
                   value="" >
          </div>
          
          <button style="background-color:black;" type="submit" class="btn btn-primary">Update</button>
           </form>
            
       
       
    </div>
        

       
   
        </section>
  
	</section>
	<!-- CONTENT -->
	

	<script src="script.js"></script>
</body>
</html>