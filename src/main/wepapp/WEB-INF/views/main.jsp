<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
    <header>
        <div class="logo-img-area"></div>
        <div class="right-header">
            <button>로그인/회원가입</button>
            <div class="ham-img-area"></div>
        </div>

    </header>
    <main>
        <div class="main-header">
            <div class="title">
                <p>국내부터 해외까지</p>
                <p>여형할때 저기어때</p>
            </div>
            <div class="section-box">
                <p>숙소 검색</p>
            <form class="section-content" id="search-form" action="/stay" method="GET">
                <input type="text" id="search-text-area" placeholder="검색어를 입력하세요" name="name">
                <button type="submit" id="search-submit">검색</button>
            </form>

            </div>
        </div>
        <div class="main-content">
           <div class="main-content-header">
                <p class="list-name">숙소 리스트</p>
                <a href="/stay/new" class="list-name">숙소 등록</a>
           </div>

            <div class="reserve-list-area">
                <c:forEach var="accommodation" items="${postByPageNumber.getContent()}">
                    <a href="/review?accommodationId=${accommodation.accommodationId}">
                        <div class="com">
                            <div class="com-img-area" style = "background-image:url('${accommodation.imageTitle}');">

                            </div>
                            <p>${accommodation.type}</p>
                            <p>${accommodation.name}</p>
                            <p>${accommodation.address}</p>
                            <p><fmt:formatNumber value="${accommodation.price}" pattern="#,###"/>원</p>
                        </div>
                    </a>
                 </c:forEach>

                </div>

            <div class="com-area-paging">


            <c:forEach var="i" begin="1" end="${postByPageNumber.totalPages}">
                <form action="http://localhost:8080/stay" method="get" style="display: inline;">
                    <input type="hidden" name="page" value="${i - 1}" />
                    <button type="submit">${i}</button>
                </form>
            </c:forEach>


            </div>
        </div>

    </main>






</body>
</html>