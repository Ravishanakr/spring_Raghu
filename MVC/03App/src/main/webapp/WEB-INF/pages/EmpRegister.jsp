<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body class="container-fluid">
	<div class="w-50 m-auto">


		<div class="mt-5">
			<div class="mb-4 text-center">

				<h3>
					Register Employee
				<h3 />
			</div>

			<form action="/register" method="POST">

				<dl>
					<dt for="username">Empolyee Id:</dt>
					<dd>
						<input type="text" class="form-control" name=empId />
					</dd>
					<dt for="username">Empolyee name:</dt>
					<dd>
						<input type="text" class="form-control" name="empName" />
					</dd>
					<dt for="username">Empolyee Salary:</dt>
					<dd>
						<input type="text" class="form-control" name="empSal" />
					</dd>


					<dt for="username">Empolyee Password:</dt>
					<dd>
						<input type="password" class="form-control" name="empPass" />
					</dd>

					<dt for="username">Empolyee Department:</dt>
					<dd>
						<input type="text" class="form-control" name="empDept" />
					</dd>

					<dt for="username">Empolyee City:</dt>
					<dd>
						<select class="form-control" name="empAddress">
							<option>Select</option>
							<option>Delhi</option>
							<option>Hydrabad</option>
							<option>Vizag</option>
						</select>
					</dd>



					<button class="btn btn-primary w-100 mt-2">Submit</button>
			</form>
		</div>


		
	</div>
</body>
</html>
