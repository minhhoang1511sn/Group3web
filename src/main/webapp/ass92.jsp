<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Murach's Java Servlets and JSP</title>
		<link rel="stylesheet" href="css/mains.css" type="text/css" />
	</head>
	<body>
		<h1>CD list</h1>
		<table>
			<tr>
				<th>Description</th>
				<th class="right">Price</th>
				<th>&nbsp;</th>
			</tr>
			<tr>
				<td>Masew</td>
				<td class="right">$14.95</td>
				<td>
					<form action="cart" method="post">
						<input type="hidden" name="productCode" value="8601" />
						<input type="submit" value="Add To Cart" />
					</form>
				</td>
			</tr>
			<tr>
				<td>X2X</td>
				<td class="right">$12.95</td>
				<td>
					<form action="cart" method="post">
						<input type="hidden" name="productCode" value="pf01" />
						<input type="submit" value="Add To Cart" />
					</form>
				</td>
			</tr>
			<tr>
				<td>Tăng Duy Tân</td>
				<td class="right">$14.95</td>
				<td>
					<form action="cart" method="post">
						<input type="hidden" name="productCode" value="pf02" />
						<input type="submit" value="Add To Cart" />
					</form>
				</td>
			</tr>
			<tr>
				<td>Phát Hồ</td>
				<td class="right">$14.95</td>
				<td>
					<form action="cart" method="post">
						<input type="hidden" name="productCode" value="jr01" />
						<input type="submit" value="Add To Cart" />
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>
