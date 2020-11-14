<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!-- Include header -->
<jsp:include page="includes/header.jsp" flush="true"/>

<!-- Insert title -->
<title>Template: Error</title>

<body class="d-flex flex-column h-100 text-center bg-light">

<!-- Include navbar -->
<jsp:include page="includes/navbar.jsp" flush="true"/>

<main role="main" class="container flex-shrink-0">
    <!-- Called if an error happens in the system -->
    <h1>Error</h1>
    <c:if test="${requestScope.error != null}">
        <h4>${requestScope.error}</h4>
    </c:if>
</main>

<!-- Include footer -->
<jsp:include page="includes/footer.jsp" flush="true"/>
</body>
</html>