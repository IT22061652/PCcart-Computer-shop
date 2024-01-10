<%@ page import="DBconnetion.DBconnection"%>
<%@ page import="jakarta.servlet.RequestDispatcher"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



 <link href="img/favicon.png" rel="icon" />
    <link href="img/apple-touch-icon.png" rel="apple-touch-icon" />

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
        <style>
       .icon-hover:hover {
  border-color: #3b71ca !important;
  background-color: white !important;
}

.icon-hover:hover i {
  color: #3b71ca !important;
}</style>
</head>
<body style="font-size:medium;">




   <div  class="head_top">
            <div class="header">
               <div class="container">
                  <div class="row">
                     <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                        <div class="full">
                           <div class="center-desk">
                              <div class="logo">
                                 <a href="index.html"><img src="" alt="#" />Pc Cart</a>
                              </div>
                           </div>
                        </div>
                     </div>
                     <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                        <nav class="navigation navbar navbar-expand-md navbar-dark ">
                           <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                           <span class="navbar-toggler-icon"></span>
                           </button>
                           <div class="collapse navbar-collapse" id="navbarsExample04">
                              <ul class="navbar-nav mr-auto">
                                 <li style="padding-right:20px;color:black;" class="nav-item">
                                    <a class="nav-link" href="index.html" style="color:black;" > Home  </a>
                                 </li>
                                 <li style="padding-right:20px;" class="nav-item">
                                    <a class="nav-link" href="#about"  style="color:black;">About</a>
                                 </li>
                                 <li style="padding-right:20px;" class="nav-item">
                                    <a class="nav-link" href="#contact"  style="color:black;">Contact us</a>
                                 </li>
                                 <li style="padding-right:20px;" class="nav-item">
                                    <a class="nav-link" href="#contact"  style="color:black;">Account</a>
                                 </li>
                                 <li style="padding-right:20px;" class="nav-item">
                                    <a class="nav-link" href="shop.jsp"  style="color:black;">Shop now</a>
                                 </li>
                              </ul>
                              
                           </div>
                        </nav>
                     </div>
                  </div>
               </div>
            </div>





  <main id="main">
    <input type="hidden"  id="status" value="<%= request.getAttribute("status")%>">
        
        <div class="d-flex flex-column ">

            <div class="profile pt-5 mt-5">
              
              <h1 class="text-black mt-5"><a href="#">hi <%=session.getAttribute("name1") %></a></h1>
              <div class="social-links mt-3 text-center pt-5">
                <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
              </div>
            </div>
      
            <nav id="navbar" class="nav-menu ">
         
                <button class=" mt-5" id="btn-prof" style="background-color:black;">Profile</button>
                <button  class=" mt-5" onclick="window.location.href='customerorders.jsp'" id="btn-prof" style="background-color:black;size:50px;">Orders</button>
           <form action="<%= request.getContextPath() %>/changepass.jsp" method="post">  <button class=" mt-5" id="btn-prof" style="background-color:black;">Change password  </button></form>
         <form action="<%= request.getContextPath() %>/Deletacc.jsp" method="post"> <button class=" mt-5" id="btn-prof" style="background-color:black;">Delete Account</button></form>
        <form action="<%= request.getContextPath() %>/customerlogout1" method="post"> <button class=" mt-5" id="btn-prof" style="background-color:black;">Log out</button>
       </form>     </nav><!-- .nav-menu -->

          </div>
        </main>
    <!-- End #main -->

     	<%     try {
     	

	DBconnection db = DBconnection.getInstance();
	   Connection	con = db.getCon();
	   PreparedStatement pst = con.prepareStatement("SELECT * FROM orders where cusid='"+session.getAttribute("cusID")+"'");


	ResultSet rs = pst.executeQuery();
	while (rs.next()) {
		
		
		
		%>	
    
      
       <div style="padding-top:20px;"class="row justify-content-center mb-3">
          <div class="col-md-12">
            <div class="card shadow-0 border rounded-3">
              <div class="card-body">
                <div class="row g-0">
                  <div class="col-xl-3 col-md-4 d-flex justify-content-center">
                    <div class="bg-image hover-zoom ripple rounded ripple-surface me-md-3 mb-3 mb-md-0">
                    
                      <a href="#!">
                        <div class="hover-overlay">
                          <div class="mask" style="background-color: rgba(253, 253, 253, 0.15);"></div>
                        </div>
                      </a>
                    </div>
                  </div>
                  <div class="col-xl-6 col-md-5 col-sm-7">
                    <h1> <%=rs.getString("Itemnam")%></h1>
                    <div class="d-flex flex-row">
                      <div class="text-warning mb-1 me-2">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                        <span class="ms-1">
                          4.5
                        </span>
                      </div>
                      <span class="text-muted">Tracking number:<%=rs.getString("status")%></span><br>
                      <span class="text-muted">Orderdate:<%=rs.getString("orderdate")%></span>
                    </div>

                    <p class="text mb-4 mb-md-0">
                    
                    </p>
                  </div>
                  <div class="col-xl-3 col-md-3 col-sm-5">
                    <div class="d-flex flex-row align-items-center mb-1">
                      <h4 class="mb-1 me-1">LKR: <%=rs.getString("total")%></h4>
                      
                    </div>
                    <h6 class="text-success">Free shipping</h6>
                    <div class="mt-4">
                     <form action="<%= request.getContextPath() %>/cancelorder1" method="post">
                    
					<input type="hidden"  name="id" id="id" value="<%=rs.getInt("oid") %>">
					
				
					
						<button type="submit"  class="btn btn-primary shadow-0">Cancel order</button> </form><br><br>
                      
                     
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      
      
          										<%		

	}

} catch (Exception e) {

	e.printStackTrace();
}


   
    
    
%>  
      
      
      
</body>
</html>