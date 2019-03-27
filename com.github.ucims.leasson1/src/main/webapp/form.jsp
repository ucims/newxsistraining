<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Form profil</title>
</head>
<body>
	<c:if test="${modus == 'input' }">
	<form method="post" action="simpan.ums">
		<table>
			<tr>
			<td>Asal Kampus</td>
				<td>:</td>
				<td><input type="text" name="asal_kampus"
					placeholder="Masukan Asal Kampus" /></td>
			</tr>
			<tr>
				<td>Jurusan</td>
				<td>:</td>
				<td><input type="text" name="jurusan"
					placeholder="Masukan Jurusan" /></td>
			</tr>
			<tr>
				<td>Akun Github</td>
				<td>:</td>
				<td><input type="text" name="github"
					placeholder="Masukan Akun Github" /></td>
			</tr>
			<tr>
				<td>LinkedIn</td>
				<td>:</td>
				<td><input type="text" name="linkedin"
					placeholder="Masukan akun linkedIn" /></td>
			</tr>
			<tr align="center">
				<td>
				<input type="submit" name="submit" value"Submit"/>
				</td>
			</tr>
		</table>		
	</form>
	<c:if test="${modus == 'tampil' }">
</body>
</html>