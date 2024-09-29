<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/review.css">
</head>
<body>
    <div class="header-wrap">
        <header>
            <div class="logo-img-area" style="background-image:url('logo.jpg')"></div>
            <div class="right-header">
                <button>로그인/회원가입</button>
                <div class="ham-img-area"></div>
            </div>
        </header>
    </div>

    <main>
        <div class="main-header">
            <div class="img-area-box">
            <div class="section-first" >
              <img src="${accommodations[0].imageTitle}" style = "width:100%; height:100%; object-fit:cover" alt="Room Image">
            </div>
                <div class="section-second">
                    <div class="top">
                        <div class="com" style="width:100%; height:100%">
                           <img src="${accommodations[0].hotelImage2}" style = "width:100%; height:100%; object-fit:cover" alt="Room Image">
                        </div>
                        <div class="com" style="width:100%; height:100%">
                            <img src="${accommodations[0].hotelImage3}" style = "width:100%; height:100%; object-fit:cover" alt="Room Image">
                        </div>
                    </div>
                    <div class="bottom">
                        <div class="com"style="width:100%; height:100%" >
                            <img src="${accommodations[0].hotelImage4}" style = "width:100%; height:100%; object-fit:cover" alt="Room Image">
                        </div>
                        <div class="com"style="width:100%; height:100%" >
                            <img src="${accommodations[0].hotelImage5}" style = "width:100%; height:100%; object-fit:cover" alt="Room Image">
                        </div>
                     </div>
                </div>
            </div>
        </div>

        <div class="main-content">
            <p>${accommodations[0].type}</p>
            <p>${accommodations[0].name}</p>
            <p>리뷰보기</p>
            <div class="main-content-wrap">
            <div class="review-box-area">
                <c:forEach var="review" items="${reviews}">
                    <div class="box">
                        <p>${review.reviewContent}</p>
                    </div>
                </c:forEach>
            </div>

            <div class = "room-wrap-header" style="display:flex; justify-content:space-between; align-items:center">
                <p style="font-size: large; font-weight: 800; margin:15px 0 15px 0;color: black">객실 선택</p>
                <a href="/review/new?accommodationId=${accommodations[0].accommodationId}" style="text-decoration:none; font-size: large; font-weight: 800; padding-right:80px">리뷰 등록</a>
            </div>

            <div class="room-wrap" style = "margin-bottom:20px;">

                <div class="room-box">
                    <div class="left-img-area" style="background-image: url('https://image.goodchoice.kr/resize_1742x480/adimg_new/895/541873/246ae0f5208ca1c368c927f2b017cea4.jpg');"></div>
                    <div class="content-box">
                        <p>Earlay 체크인(숙박 2인 무료 조식, 전 객실 OTT 서비스 지원, 호텔토랑 룸 서비스</p>
                        <p>상세정보</p>
                        <div class="sub-box-first">
                            <p>대실</p>
                            <p>무한대실</p>
                            <p>10시간 이용</p>
                            <a class="resv-a" href="/reservation/new?accommodationId=${accommodations[0].accommodationId}"><button>숙박 예약</button></a>
                            <div class="line"></div>

                            <div class="sub-box-second">
                                <p>숙박</p>
                                <p>입실 14:00</p>
                                <p>퇴실 14:00</p>
                                <div class="sub-price">
                                    <p><fmt:formatNumber pattern="#,###">${accommodations[0].price + 35000}</fmt:formatNumber>원</p>
                                    <a class="resv-a" href="/reservation/new?accommodationId=${accommodations[0].accommodationId}"><button>숙박 예약</button></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="room-box">
                <div class="left-img-area" style="background-image: url('https://image.goodchoice.kr/resize_1742x480/adimg_new/895/541873/246ae0f5208ca1c368c927f2b017cea4.jpg');"></div>
                <div class="content-box">
                    <p>Earlay 체크인(숙박 2인 무료 조식, 전 객실 OTT 서비스 지원, 호텔토랑 룸 서비스</p>
                    <p>상세정보</p>
                    <div class="sub-box-first">
                        <p>대실</p>
                        <p>무한대실</p>
                        <p>10시간 이용</p>
                        <a class="resv-a" href="/reservation/new?accommodationId=${accommodations[0].accommodationId}"><button>숙박 예약</button></a>
                        <div class="line"></div>

                        <div class="sub-box-second">
                            <p>숙박</p>
                            <p>입실 14:00</p>
                            <p>퇴실 14:00</p>
                            <div class="sub-price">
                                <p><fmt:formatNumber pattern="#,###">${accommodations[0].price + 10000}</fmt:formatNumber>원</p>
                                <a class="resv-a" href="/reservation/new?accommodationId=${accommodations[0].accommodationId}"><button>숙박 예약</button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <c:forEach var="review" items="${reviews}">
        <div class="review-area">
            <p>욱이깅</p>
            <div class="right-review-area">
                <p>★★★★★ 1개월전</p>
                <div class="review-images">
                    <img src="https://image.withstatic.com/217/157/89/672e737e2fe84e59bb45e8862021bd73_w420_h420.jpg?ext=webp" alt="">
                    <img src="https://image.withstatic.com/217/157/89/672e737e2fe84e59bb45e8862021bd73_w420_h420.jpg?ext=webp" alt="">
                    <img src="https://image.withstatic.com/217/157/89/672e737e2fe84e59bb45e8862021bd73_w420_h420.jpg?ext=webp" alt="">
                    <img src="https://image.withstatic.com/217/157/89/672e737e2fe84e59bb45e8862021bd73_w420_h420.jpg?ext=webp" alt="">
                </div>
                <p>${review.reviewContent}</p>

            </div>
        </div>
    </c:forEach>

    </div>
    </main>
</body>
</html>
