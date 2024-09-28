<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
                <div class="section-content">
                    <form action="/stay/search" method="GET">
                        <input type="text" id="search-text-area" name="name">
                        <input type="text" id="date-area" name="type">
                        <input type="text" id="pr-num-area">
                        <button type="submit" id="search-submit">검색</button>
                    </form>

                </div>
            </div>
        </div>
        <div class="main-content">
            <p class="list-name">숙소 리스트</p>
            <div class="reserve-list-area">
                <c:forEach var="accommodation" items="${accommodations}">
                    <div class="com">
                        <div class="com-img-area" style="background-image: url('${accommodation.imageTitle}'); "></div>
                        <p>${accommodation.type}</p>
                        <p>${accommodation.name}</p>
                        <p>${accommodation.address}</p>
                        <p>${accommodation.price}원</p>
                    </div>
                </c:forEach>
            </div>
            <div class="com-area-paging">
                <button>1</button>
                <button>2</button>
                <button>3</button>
                <button>4</button>
                <button>5</button>
            </div>
        </div>
    </main>
</body>
</html>
