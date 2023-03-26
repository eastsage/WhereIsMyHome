<!-- /*
* Template Name: Sterial
* Template Author: Untree.co
* Tempalte URI: https://untree.co/
* License: https://creativecommons.org/licenses/by/3.0/
*/ -->
<%@ page  contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<meta name="author" content="Untree.co">
	<link rel="shortcut icon" href="favicon.png">

	<meta name="description" content="" />
	<meta name="keywords" content="bootstrap, bootstrap5" />
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Brygada+1918:ital,wght@0,400;0,600;0,700;1,400&family=Inter:wght@400;700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="fonts/icomoon/style.css">
	<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

	<link rel="stylesheet" href="css/tiny-slider.css">
	<link rel="stylesheet" href="css/aos.css">
	<link rel="stylesheet" href="css/flatpickr.min.css">
	<link rel="stylesheet" href="css/glightbox.min.css">
	<link rel="stylesheet" href="css/style.css">
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous"
	/>
	<link
		rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css"
	/>
	<script src="./js/key.js"></script>
	
	<title> Where is My Home! </title>
</head>
<body>
	<div class="site-mobile-menu site-navbar-target">
		<div class="site-mobile-menu-header">
			<div class="site-mobile-menu-close">
				<span class="icofont-close js-menu-toggle"></span>
			</div>
		</div>
		<div class="site-mobile-menu-body"></div>
	</div>

	<nav class="site-nav mt-3">
		<div class="container">

			<div class="site-navigation">
				<div class="row">
					<div class="col-6 col-lg-3">
						<a href="index.jsp" class="logo m-0 float-start">SSAFY</a>
					</div>
					<div class="col-lg-6 d-none d-lg-inline-block text-center nav-center-wrap">
						<ul class="js-clone-nav  text-center site-menu p-0 m-0">
							<li class="active"><a href="index.jsp">Home</a></li>

						</ul>
					</div>
					<div class="col-6 col-lg-3 text-lg-end">
						<ul class="js-clone-nav d-none d-lg-inline-block text-end site-menu ">
							<li class="cta-button">
								<a href="memberForm.jsp?type=in">Sign In</a>
							</li>
							<li class="cta-button">
								<a href="memberForm.jsp?type=up">Sign Up</a>
							</li>	
						</ul>

						<a href="#" class="burger ms-auto float-end site-menu-toggle js-menu-toggle d-inline-block d-lg-none light" data-toggle="collapse" data-target="#main-navbar">
							<span></span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</nav>

	

	<div class="hero overlay">
		<div class="img-bg rellax">
			<img src="images/hero_1.jpg" alt="Image" class="img-fluid">
		</div>

		<div class="container">
			<div class="row align-items-center justify-content-start">
				<div class="col-lg-5">
					
					<h1 class="heading" data-aos="fade-up">Where Is<br>&nbsp &nbsp &nbsp &nbsp My Home</h1>
					<p class="mb-5" data-aos="fade-up">구해줘 홈즈!</p>
				</div>
			</div>
		</div>
	</div>

	<!--동별 아파트별 실거래가 조회 기능 -->
	<!--조회하면 아래쪽으로 창 열리면서 뜨게 하기-->
	<!--중간에 핫 매물이 들어갈 거임-->
	<div class="section service-section-1">
		<div class="container">
			<div class="row">
				<!--태그-->
				<div class="col-md-12" id = "searchDetail">
					<!-- 아파트 매매 정보 검색 start -->
					<div class="row">
						<div class="input-group col-md-6">
							<span class="input-group-text mb-3">아파트 명</span>
							<input type="text" class="form-control mb-3" id = "aptName" placeholder="아파트 명">
					
					
							<div class="form-group mb-3">
								<select class="form-select bg-secondary text-light" id="sido">
									<option value="">시도선택</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<select class="form-select bg-secondary text-light" id="gugun">
									<option value="">구군선택</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<select class="form-select bg-secondary text-light" id="dong">
									<option value="">동선택</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<select class="form-select bg-dark text-light" id="year"></select>
							</div>
							<div class="form-group mb-3">
								<select class="form-select bg-dark text-light" id="month">
									<option value="">매매월선택</option>
								</select>
							</div>

						
						</div>
						
					</div>
				</div>
				<div class = "col-md-4">
					<input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" checked>
					<label class="btn btn-outline-primary" for="btnradio1">전체</label>

					<input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off">
					<label class="btn btn-outline-primary" for="btnradio2">매매</label>
					
					<input type="radio" class="btn-check" name="btnradio" id="btnradio3" autocomplete="off">
					<label class="btn btn-outline-primary" for="btnradio3">전세</label>

					<input type="radio" class="btn-check" name="btnradio" id="btnradio4" autocomplete="off">
					<label class="btn btn-outline-primary" for="btnradio4">월세</label>	
				</div> 
				<div class="form-group col-md-2">
					<button type="button" id="list-btn" class="btn btn-outline-primary">
						아파트매매정보
					</button>
				</div>
			</div>
		</div>
	</div>
	<div class = "section">
		<div class = "container">
                <div id="map" class="mt-3" style="width: 100%; height: 400px"></div>
		</div>
	</div>

	<div class = "section">
		<div class = "container">
			<table class="table table-hover text-center" style="display: none">
				<tr>
					<th>아파트이름</th>
					<th>층</th>
					<th>면적</th>
					<th>법정동</th>
					<th>거래금액</th>
				</tr>
				<tbody id="aptlist"></tbody>
			</table>				
		</div>
	</div>

	<div class="site-footer">
		<div class="container">

			<div class="row">
				<div class="col-lg-4">
					<div class="widget">
						<h3>About Passport<span class="text-primary">.</span> </h3>
						<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
					</div> <!-- /.widget -->
					<div class="widget">
						<h3>Connect</h3>
						<ul class="list-unstyled social">
							<li><a href="#"><span class="icon-instagram"></span></a></li>
							<li><a href="#"><span class="icon-twitter"></span></a></li>
							<li><a href="#"><span class="icon-facebook"></span></a></li>
							<li><a href="#"><span class="icon-linkedin"></span></a></li>
							<li><a href="#"><span class="icon-pinterest"></span></a></li>
							<li><a href="#"><span class="icon-dribbble"></span></a></li>
						</ul>
					</div> <!-- /.widget -->
				</div> <!-- /.col-lg-3 -->

				<div class="col-lg-2 ml-auto">
					<div class="widget">
						<h3>Links</h3>
						<ul class="list-unstyled float-left links">
							<li><a href="#">About us</a></li>
							<li><a href="#">Services</a></li>
							<li><a href="#">News</a></li>
							<li><a href="#">Careers</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</div> <!-- /.widget -->
				</div> <!-- /.col-lg-3 -->

				<div class="col-lg-2">
					<div class="widget">
						<h3>Company</h3>
						<ul class="list-unstyled float-left links">
							<li><a href="#">About us</a></li>
							<li><a href="#">Services</a></li>
							<li><a href="#">News</a></li>
							<li><a href="#">Careers</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</div> <!-- /.widget -->
				</div> <!-- /.col-lg-3 -->


				<div class="col-lg-3">
					<div class="widget">
						<h3>Contact</h3>
						<address>43 Raymouth Rd. Baltemoer, London 3910</address>
						<ul class="list-unstyled links mb-4">
							<li><a href="tel://11234567890">+1(123)-456-7890</a></li>
							<li><a href="tel://11234567890">+1(123)-456-7890</a></li>
							<li><a href="mailto:info@mydomain.com">info@mydomain.com</a></li>
						</ul>
					</div> <!-- /.widget -->
				</div> <!-- /.col-lg-3 -->

			</div> <!-- /.row -->

			<div class="row mt-5">
				<div class="col-12 text-center">
					<p class="mb-0">Copyright &copy;<script>document.write(new Date().getFullYear());</script>. All Rights Reserved. &mdash; Designed with love by <a href="https://untree.co">Untree.co</a> <!-- License information: https://untree.co/license/ --> Distributed By <a href="https:/themewagon.com" target="_blank">ThemeWagon</a>
					</p>
				</div>
			</div>
		</div> <!-- /.container -->
	</div> <!-- /.site-footer -->

	<!-- Preloader -->
	<div id="overlayer"></div>
		<div class="loader">
			<div class="spinner-border text-primary" role="status">
				<span class="visually-hidden">Loading...</span>
			</div>
		</div>

		<script src="js/bootstrap.bundle.min.js"></script>
		<script src="js/tiny-slider.js"></script>
		<script src="js/aos.js"></script>
		<script src="js/navbar.js"></script>
		<script src="js/counter.js"></script>
		<script src="js/rellax.js"></script>
		<script src="js/flatpickr.js"></script>
		<script src="js/glightbox.min.js"></script>
		<script src="js/custom.js"></script>
		<script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"
        ></script>
        <script
            type="text/javascript"
            src="//dapi.kakao.com/v2/maps/sdk.js?appkey=458b9c7c88ae93c2ef75e5944de0071f&libraries=services,clusterer,drawing"
        ></script>
        <script>
            ///////////////////////// select box 설정 (지역, 매매기간) /////////////////////////
            let date = new Date();

            let yearEl = document.querySelector("#year");
            let yearOpt = `<option value="">매매년도선택</option>`;
            let year = date.getFullYear();
            for (let i = year; i > year - 20; i--) {
                yearOpt += `<option value="${i}">${i}년</option>`;
            }
            yearEl.innerHTML = yearOpt;

            // 브라우저가 열리면 시도정보 얻기.
            sendRequest("sido", "*00000000");

            document.querySelector("#year").addEventListener("change", function () {
                let month = date.getMonth() + 1;
                let monthEl = document.querySelector("#month");
                let monthOpt = `<option value="">매매월선택</option>`;
                let yearSel = document.querySelector("#year");
                let m = yearSel[yearSel.selectedIndex].value == date.getFullYear() ? month : 13;
                for (let i = 1; i < m; i++) {
                    monthOpt += `<option value="${i < 10 ? "0" + i : i}">${i}월</option>`;
                }
                monthEl.innerHTML = monthOpt;
            });

            // https://juso.dev/docs/reg-code-api/
            // let url = "https://grpc-proxy-server-mkvo6j4wsq-du.a.run.app/v1/regcodes";
            // let regcode = "*00000000";
            // 전국 특별/광역시, 도
            // https://grpc-proxy-server-mkvo6j4wsq-du.a.run.app/v1/regcodes?regcode_pattern=*00000000

            // 시도가 바뀌면 구군정보 얻기.
            document.querySelector("#sido").addEventListener("change", function () {
                if (this[this.selectedIndex].value) {
                    let regcode = this[this.selectedIndex].value.substr(0, 2) + "*00000";
                    sendRequest("gugun", regcode);
                } else {
                    initOption("gugun");
                    initOption("dong");
                }
            });

            // 구군이 바뀌면 동정보 얻기.
            document.querySelector("#gugun").addEventListener("change", function () {
                if (this[this.selectedIndex].value) {
                    let regcode = this[this.selectedIndex].value.substr(0, 5) + "*";
                    sendRequest("dong", regcode);
                } else {
                    initOption("dong");
                }
            });

            function sendRequest(selid, regcode) {
                const url = "https://grpc-proxy-server-mkvo6j4wsq-du.a.run.app/v1/regcodes";
                let params = "regcode_pattern=" + regcode + "&is_ignore_zero=true";
                fetch(`${url}?${params}`)
                    .then((response) => response.json())
                    .then((data) => addOption(selid, data));
            }

            function addOption(selid, data) {
                let opt = ``;
                initOption(selid);
                switch (selid) {
                    case "sido":
                        opt += `<option value="">시도선택</option>`;
                        data.regcodes.forEach(function (regcode) {
                            opt += `
                <option value="${regcode.code}">${regcode.name}</option>
                `;
                        });
                        break;
                    case "gugun":
                        opt += `<option value="">구군선택</option>`;
                        for (let i = 0; i < data.regcodes.length; i++) {
                            if (i != data.regcodes.length - 1) {
                                if (
                                    data.regcodes[i].name.split(" ")[1] ==
                                        data.regcodes[i + 1].name.split(" ")[1] &&
                                    data.regcodes[i].name.split(" ").length !=
                                        data.regcodes[i + 1].name.split(" ").length
                                ) {
                                    data.regcodes.splice(i, 1);
                                    i--;
                                }
                            }
                        }
                        let name = "";
                        data.regcodes.forEach(function (regcode) {
                            if (regcode.name.split(" ").length == 2)
                                name = regcode.name.split(" ")[1];
                            else
                                name =
                                    regcode.name.split(" ")[1] + " " + regcode.name.split(" ")[2];
                            opt += `
                <option value="${regcode.code}">${name}</option>
                `;
                        });
                        break;
                    case "dong":
                        opt += `<option value="">동선택</option>`;
                        let idx = 2;
                        data.regcodes.forEach(function (regcode) {
                            if (regcode.name.split(" ").length != 3) idx = 3;
                            opt += `
                <option value="${regcode.code}">${regcode.name.split(" ")[idx]}</option>
                `;
                        });
                }
                document.querySelector(`#${selid}`).innerHTML = opt;
            }

            function initOption(selid) {
                let options = document.querySelector(`#${selid}`);
                options.length = 0;
                // let len = options.length;
                // for (let i = len - 1; i >= 0; i--) {
                //   options.remove(i);
                // }
            }

            ///////////////////////// 아파트 매매 정보 /////////////////////////
            document.querySelector("#list-btn").addEventListener("click", function () {
                let url =
                    "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
                let gugunSel = document.querySelector("#gugun");
                let regCode = gugunSel[gugunSel.selectedIndex].value.substr(0, 5);
                let yearSel = document.querySelector("#year");
                let year = yearSel[yearSel.selectedIndex].value;
                let monthSel = document.querySelector("#month");
                let month = monthSel[monthSel.selectedIndex].value;
                let dealYM = year + month;
                let queryParams =
                    encodeURIComponent("serviceKey") + "=" + serviceKey; /*Service Key*/
                queryParams +=
                    "&" +
                    encodeURIComponent("LAWD_CD") +
                    "=" +
                    encodeURIComponent(regCode); /*아파트소재 구군*/
                queryParams +=
                    "&" +
                    encodeURIComponent("DEAL_YMD") +
                    "=" +
                    encodeURIComponent(dealYM); /*조회년월*/
                queryParams +=
                    "&" +
                    encodeURIComponent("pageNo") +
                    "=" +
                    encodeURIComponent("1"); /*페이지번호*/
                queryParams +=
                    "&" +
                    encodeURIComponent("numOfRows") +
                    "=" +
                    encodeURIComponent("30"); /*페이지당건수*/

                fetch(`${url}?${queryParams}`)
                    .then((response) => response.text())
                    .then((data) => makeList(data));
            });

            function makeList(data) {
                document.querySelector("table").setAttribute("style", "display: ;");
                let tbody = document.querySelector("#aptlist");
                let parser = new DOMParser();
                const xml = parser.parseFromString(data, "application/xml");
                initTable();
                let apts = xml.querySelectorAll("item");
                apts.forEach((apt) => {
					if (apt.querySelector("법정동").textContent.includes(document.getElementById("dong").options[document.getElementById("dong").selectedIndex].text)){
						if (!apt.querySelector("아파트").textContent.includes(document.getElementById("aptName").value)) return;					
						let tr = document.createElement("tr");

						let nameTd = document.createElement("td");
						nameTd.appendChild(
							document.createTextNode(apt.querySelector("아파트").textContent)
						);
						tr.appendChild(nameTd);

						let floorTd = document.createElement("td");
						floorTd.appendChild(
							document.createTextNode(apt.querySelector("층").textContent)
						);
						tr.appendChild(floorTd);

						let areaTd = document.createElement("td");
						areaTd.appendChild(
							document.createTextNode(apt.querySelector("전용면적").textContent)
						);
						tr.appendChild(areaTd);

						let dongTd = document.createElement("td");
						dongTd.appendChild(
							document.createTextNode(apt.querySelector("법정동").textContent)
						);
						tr.appendChild(dongTd);

						let priceTd = document.createElement("td");
						priceTd.appendChild(
							document.createTextNode(apt.querySelector("거래금액").textContent + "만원")
						);
						priceTd.classList.add("text-end");
						tr.appendChild(priceTd);

						let address =
							apt.querySelector("중개사소재지").textContent +
							" " +
							apt.querySelector("법정동").textContent +
							" " +
							apt.querySelector("지번").textContent;
						tr.addEventListener("click", () =>
							viewMap(apt.querySelector("아파트").textContent, address)
						);

						tbody.appendChild(tr);
					}
                });
            }

            // 카카오지도
            var mapContainer = document.getElementById("map"), // 지도를 표시할 div
                mapOption = {
                    center: new kakao.maps.LatLng(37.500613, 127.036431), // 지도의 중심좌표
                    level: 3, // 지도의 확대 레벨
                };

            // 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
            var map = new kakao.maps.Map(mapContainer, mapOption);

            var marker, infowindow;
            function viewMap(apt, address) {
                if (marker != null && infowindow != null) {
                    marker.setMap(null);
                    infowindow.close();
                }
                // 주소-좌표 변환 객체를 생성합니다
                var geocoder = new kakao.maps.services.Geocoder();

                // 주소로 좌표를 검색합니다
                geocoder.addressSearch(address, function (result, status) {
                    // 정상적으로 검색이 완료됐으면
                    if (status === kakao.maps.services.Status.OK) {
                        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                        // 결과값으로 받은 위치를 마커로 표시합니다
                        marker = new kakao.maps.Marker({
                            map: map,
                            position: coords,
                        });

                        // 인포윈도우로 장소에 대한 설명을 표시합니다
                        infowindow = new kakao.maps.InfoWindow({
                            content: `<div style="width:150px;text-align:center;padding:6px 0;">${apt}</div>`,
                        });
                        infowindow.open(map, marker);

                        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                        map.setCenter(coords);
                    }
                });
            }

            function initTable() {
                let tbody = document.querySelector("#aptlist");
                let len = tbody.rows.length;
                for (let i = len - 1; i >= 0; i--) {
                    tbody.deleteRow(i);
                }
            }
        </script>
	</body>
</html>
