<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<header>
			<img src="../images/bannerweb.png" alt="" width="100%">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Trang chủ</a></li>
							<li class="nav-item"><a class="nav-link active" href="#">Giới
									thiệu</a></li>
							<li class="nav-item"><a class="nav-link active" href="#">Danh
									mục</a></li>
							<li class="nav-item dropdown  "><a
								class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
								role="button" data-bs-toggle="dropdown" aria-expanded="false">
									Tài khoản </a> <c:choose>
									<c:when test="${!empty user}">
										<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
											<li><a class="dropdown-item" href="#">Xin chào : <b>${user}</b></a></li>
											<li><a class="dropdown-item" href="/Assigment/user/profile?id=${username.id}">Thông tin tài khỏan</a></li>
											<li><a class="dropdown-item" href="#">Giỏ hàng</a></li>
											<li><hr class="dropdown-divider"></li>
											<li><a class="dropdown-item"
												href="/Assigment/user/logout">Đăng xuất</a></li>
										</ul>
									</c:when>
									<c:when test="${empty user }">
										<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
											<li><a class="dropdown-item" href="/Assigment/user/login">Đăng nhập</a></li>
											<li><a class="dropdown-item" href="/Assigment/user/create">Đăng ký</a></li>
										</ul>
									</c:when>
								</c:choose></li>
						</ul>
						<form class="d-flex">
							<input class="form-control me-2" type="search"
								placeholder="Search" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form>
					</div>
				</div>
			</nav>
		</header>
		<div class="row">
			<div class="col-9">
				<div class="card" style="width: 16rem;">
					<img src="..." class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>

			</div>
			<div class="col-3">
				<div class="list-group mt-3">
					<a href="#" class="list-group-item list-group-item-action disabled"
						aria-current="true"> Menu </a> <a href="#"
						class="list-group-item list-group-item-action">Sản phẩm phổ
						biến</a> <a href="#" class="list-group-item list-group-item-action">Đang
						hạ giá</a> <a href="#" class="list-group-item list-group-item-action">Hàng
						theo danh mục</a> <a href="#"
						class="list-group-item list-group-item-action">Sản phẩm hết
						hàng</a>
				</div>
			</div>
		</div>

	</div>


	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal tle</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<script src="../js/jquery.min.js"></script>
	<script src="../js/popper.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>