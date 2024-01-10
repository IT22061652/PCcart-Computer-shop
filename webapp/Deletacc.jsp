<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form by Colorlib</title>

<!-- Font Icon -->
<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="style.css">
 <link href="css2/styleprofile.css" rel="stylesheet" />
</head>
<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Are you sure to delete account?</h2>
					
						
							<div class="form-group">
							<form action="<%= request.getContextPath() %>/deletacc" method="post"> <button class=" class="btn btn-primary" id="btn-prof" style="background-color:black;size:50px;">Delete Account</button>
							
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="ID" id="ID" value="<%=session.getAttribute("cusID") %>" readonly />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" value=" Name:   <%=session.getAttribute("name1") %>" readonly/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" value="Email:   <%=session.getAttribute("mail") %>" readonly />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="pno" id="pno" value="Contact Number:   <%=session.getAttribute("pno") %>" readonly/>
							</div>
							
							
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="address" id="address"
									value="Address: <%=session.getAttribute("add") %>" readonly />
							</div>
							
							
							</form>
							</div>
							 
							
							 
						
					</div>
					
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>

</html>

