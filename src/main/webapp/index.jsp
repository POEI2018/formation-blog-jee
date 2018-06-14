<%-- Configuration d'une page JSP avec la syntaxe "<%@ ... %>" --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Première page JSP</title>
<%-- Utilisation de l'API EL (Expression Language) qui permet d'évaluer du code Java. --%>
<%-- Utilisation de la syntaxe "<%= ... %>" pour affecter le résultat de l'expression
au contenu HTML généré en sortie. --%>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/index.css" />
</head>
<body>
	<h1>Bienvenue sur mon blog !</h1>
	<div class="main">
		<div class="article">
			<h2>Article n°1</h2>
			<p>Cras et cursus erat, non pretium est. Fusce vel pellentesque neque, eu consequat est. Vivamus blandit placerat felis nec pellentesque. Donec imperdiet massa quis quam accumsan condimentum. Fusce laoreet faucibus nisl et sodales. Pellentesque aliquam orci vitae pulvinar commodo. Sed vitae facilisis velit. Nunc lobortis congue iaculis. Etiam mauris quam, luctus vitae velit ut, pulvinar aliquet libero. Aenean et sapien porttitor, aliquet mi bibendum, finibus lectus. Suspendisse ut auctor sem. Vivamus porta mauris in odio semper tristique. Donec cursus efficitur placerat. Proin pretium nisl sem, non viverra velit pharetra et. Vivamus pharetra lectus quis pharetra finibus.</p>
		</div>
		<div class="article">
			<h2>Article n°2</h2>
			<p>Cras et cursus erat, non pretium est. Fusce vel pellentesque neque, eu consequat est. Vivamus blandit placerat felis nec pellentesque. Donec imperdiet massa quis quam accumsan condimentum. Fusce laoreet faucibus nisl et sodales. Pellentesque aliquam orci vitae pulvinar commodo. Sed vitae facilisis velit. Nunc lobortis congue iaculis. Etiam mauris quam, luctus vitae velit ut, pulvinar aliquet libero. Aenean et sapien porttitor, aliquet mi bibendum, finibus lectus. Suspendisse ut auctor sem. Vivamus porta mauris in odio semper tristique. Donec cursus efficitur placerat. Proin pretium nisl sem, non viverra velit pharetra et. Vivamus pharetra lectus quis pharetra finibus.</p>
		</div>
		<div class="article">
			<h2>Article n°3</h2>
			<p>Cras et cursus erat, non pretium est. Fusce vel pellentesque neque, eu consequat est. Vivamus blandit placerat felis nec pellentesque. Donec imperdiet massa quis quam accumsan condimentum. Fusce laoreet faucibus nisl et sodales. Pellentesque aliquam orci vitae pulvinar commodo. Sed vitae facilisis velit. Nunc lobortis congue iaculis. Etiam mauris quam, luctus vitae velit ut, pulvinar aliquet libero. Aenean et sapien porttitor, aliquet mi bibendum, finibus lectus. Suspendisse ut auctor sem. Vivamus porta mauris in odio semper tristique. Donec cursus efficitur placerat. Proin pretium nisl sem, non viverra velit pharetra et. Vivamus pharetra lectus quis pharetra finibus.</p>
		</div>
	</div>
</body>
</html>