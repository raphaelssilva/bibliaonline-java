<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
</style>
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<script type="text/javascript" src='/static/js/jquery.min.js'></script>
<script type="text/javascript" src='/static/js/kendo.all.min.js'></script>
<script type="text/javascript" src='/static/js/application.js'></script>
<link href="/static/css/kendo.common.min.css" rel="stylesheet" type="text/css">
<link href="/static/css/kendo.default.min.css" rel="stylesheet" type="text/css">
<link href="/static/css/kendo.bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/static/css/home.css" rel="stylesheet" type="text/css">

</head>
<body>

	<div class="head" id="head">
		<div class="top central" id="top">
			<div id="logo-mini">
				<img src="/static/images/logo-biblia-online.png" height="30">
			</div>
			<div class="horizontalcssmenu"
				style="float: right; position: static;">
				<sec:authorize access="hasRole('ROLE_USER')">
					<tiles:insertAttribute name="menu" />
				</sec:authorize>
			</div>

		</div>
	</div>
	<div class="body" id="body">
		<div class="corpo central" id="corpo">
			<!-- <div id="menu-vertical">
				<br>
				<table width="100%" border="0" cellpadding="7" cellspacing="0">
					<tbody>
						<tr>
							<td><div class="ico atualizacao-ico"
									style="color: blue; text-shadow: 1px;">Contas Associadas</div></td>
						</tr>
						<tr>
							<td><div class="ico facebook-ico">raphael.ssilva</div></td>
						</tr>
						<tr>
							<td><div class="ico twitter-ico">raphael_ssilva</div></td>
						</tr>
						<tr>
							<td><div class="ico facebook-ico">raphael19892</div></td>
						</tr>
						<tr>
							<td><div class="ico linkedin-ico">raphaeluvv</div></td>
						</tr>
						<tr>
							<td><div class="ico twitter-ico">raphael19892</div></td>
						</tr>

					</tbody>
				</table>
			</div> -->
			<div id="conteudo">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>
	<div id="base" class="base">
		<div id="rodape" class="rodape central">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>