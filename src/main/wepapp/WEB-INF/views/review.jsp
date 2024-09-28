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
            <div class="logo-img-area"></div>
            <div class="right-header">
                <button>로그인/회원가입</button>
                <div class="ham-img-area"></div>
            </div>
        </header>
    </div>

    <main>
        <div class="main-header">
            <div class="img-area-box">
                <div class="section-first" style = "background-image:url('${roomReservations[0].imageTitle}');"></div>
                <div class="section-second">
                    <div class="top">
                        <div class="com" style = "background-image:url('${roomReservations[0].hotelImage2}');"></div>
                        <div class="com" style = "background-image:url('${roomReservations[0].hotelImage3}');"></div>
                    </div>
                    <div class="bottom">
                        <div class="com" style = "background-image:url('${roomReservations[0].hotelImage4}');"></div>
                        <div class="com" style = "background-image:url('${roomReservations[0].hotelImage5}');"></div>
                    </div>
                </div>
            </div>
        </div>

        <div class="main-content">
            <p>${roomReservations[0].type}</p>
            <p>${roomReservations[0].name}</p>
            <p>리뷰보기</p>
            <div class="main-content-wrap">
            <div class="review-box-area">
                <div class="box">
                    <p>구월 호텔반월을 처음 이용하게 되었어요.
                        호텔반월을 이용하면서 깜짝 놀랄일들이 많아서 리뷰를 작성하게 되었네요~^^</p></div>
                <div class="box"><p>조식을 먹으려고 오는건지?
                    숙박을 하려고 오는건지? 이젠 솔직히 나도 헷갈릴때가 있는 호텔 입니다.</p></div>
                <div class="box"><p>집에서 도보로 30분 거리에 있는 호텔반월~
                    호텔반월은 구월아시아드에 있습니다</p></div>
            </div>

            <div class="room-wrap">
             <!-- 반복부분 -->
            <p style="font-size: large; font-weight: 800; margin:15px 0 15px 0;color: black">객실 선택</p>
                <div class="room-box">
                    <div class="left-img-area" style="background-image: url('https://image.goodchoice.kr/resize_1742x480/adimg_new/895/541873/246ae0f5208ca1c368c927f2b017cea4.jpg');"></div>
                    <div class="content-box">
                        <p>Earlay 체크인(숙박 2인 무료 조식, 전 객실 OTT 서비스 지원, 호텔토랑 룸 서비스</p>
                        <p>상세정보</p>
                        <div class="sub-box-first">
                            <p>대실</p>
                            <p>무한대실</p>
                            <p>10시간 이용</p>
                            <button>숙박 예약</button>
                            <div class="line"></div>

                            <div class="sub-box-second">
                                <p>숙박</p>
                                <p>입실 14:00</p>
                                <p>퇴실 14:00</p>
                                <div class="sub-price">
                                    <p>40,500원</p>
                                    <button>숙박 예약</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
         <!-- 반복부분 -->
  <!-- 반복부분 -->
            <p style="font-size: large; font-weight: 800; margin:15px 0 15px 0; color: black;" >객실 선택</p>
            <div class="room-box">
                <div class="left-img-area" style="background-image: url('https://image.goodchoice.kr/resize_1742x480/adimg_new/895/541873/246ae0f5208ca1c368c927f2b017cea4.jpg');"></div>
                <div class="content-box">
                    <p>Earlay 체크인(숙박 2인 무료 조식, 전 객실 OTT 서비스 지원, 호텔토랑 룸 서비스</p>
                    <p>상세정보</p>
                    <div class="sub-box-first">
                        <p>대실</p>
                        <p>무한대실</p>
                        <p>10시간 이용</p>
                        <button>숙박 예약</button>
                        <div class="line"></div>

                        <div class="sub-box-second">
                            <p>숙박</p>
                            <p>입실 14:00</p>
                            <p>퇴실 14:00</p>
                            <div class="sub-price">
                                <p>40,500원</p>
                                <button>숙박 예약</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- 반복부분 -->
    </div>


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
            <p>서울시강동구 길동에 위치한 간만에 좋은 업소에 온거 같습니다. 👍
                주차장은 매우 넓고 편하게 입실하였습니다.침구는 보기드문 좋은재질의 고급이여서 너무 상쾌하였습니다 어메니티는 종류별로 잘 구비되어 있어서 편리하게 이용하였으며</p>

        </div>

    </div>
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
            <p>서울시강동구 길동에 위치한 간만에 좋은 업소에 온거 같습니다. 👍
                주차장은 매우 넓고 편하게 입실하였습니다.침구는 보기드문 좋은재질의 고급이여서 너무 상쾌하였습니다 어메니티는 종류별로 잘 구비되어 있어서 편리하게 이용하였으며</p>
        </div>
    </div>

    </div>
    </main>
</body>
</html>
