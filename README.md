# TTT

## TTTheater
인천일보아카데미 두번째 프로젝트(세미프로젝트) <br/>
개발기간 : 2022.11.30 ~ 2022.12.19(약 2주) <br/>

## 프로젝트 소개
프로젝트의 이름인 TTT는 "영화관 갈 시간" 이라는 의미의 "Time To go to the Theater"입니다
간단하게는 TTT, 로고에는 TTheater로 사용합니다

TTT는 영화를 예매할 수 있는 예매 사이트 입니다
현재 상영중인 영화와 상영예정작들을 확인할 수 있습니다. 

## 주요기능

1)회원 관련<br/>
 **회원가입**<br/>
 - 회원가입을 할 때 생년월일, 연락처, 아이디, 비번, 이메일, 이름을 입력해야 하고 저장 될 때에 연락처는 - 추가해서 저장이 됩니다 <br/>
**로그인 및 로그아웃**<br/>
 - 회원가입한 아이디로 로그인이 가능하며 로그아웃도 가능합니다.<br/>
**마이 페이지**<br/>
- 자기 정보 확인 및 수정이 가능하며 아이디는 바꾸지 못합니다.<br/>
- 자신의 예매 내역을 확인할 수 있습니다<br/>
- 회원 탈퇴가 가능합니다<br/>

**<관리자>**
 - 관리자는 회원 관리를 할 수 있게 회원 목록을 볼 수 있습니다 <br/>

2)영화 정보
영화 정보는 크게 3가지로 있으며 박스오피스와 상영예정작 그리고 모두 볼 수 있는 전체 영화가 있습니다<br/>
모든 영화는 예매율에 따라 예매율이 가장 높은 순서대로 포스터가 나옵니다 <br/>

**영화 정보 상세 보기**
- 마우스를 해당영화 포스터에 마우스를 올려 두면 해당 영화의 간단한 정보를 볼 수 있습니다
- 클릭시 해당 영화의 더욱 상세한 정보를 확인 할 수 페이지로 이동됩니다
  더욱 상세한 정보로는 영화 설명, 예고편, 상영타입-D, 감독, 장르, 등급, 개봉일, 출연진, 관람평등이 있습니다

3)영화 예매
빠른 예매(회원 한정)
*이동하는 정보: 아이디, 관람일자, 영화이름, 극장(지역-상세 지역), 관람시간
*페이지 1 - 극장과 시간 선택
- 관람일자
- 영화: 영화 이름
- 극장(그냥 메가박스 그대로): 전체/특별관 - 지역 선택(버튼) 후 상세 지역도 버튼으로 생성(오버플로: 스크롤)
- 관람시간: 위의 세 가지 데이터에 해당하는 시간표 들고 옴. 추가적으로 현재 시간이 영화 시작 시간보다 이른 경우에는
아예 안 가져오도록 설계
오도록.
*페이지2 - 인원 선택 > 좌석 선택 > 결제창 이동.
좌석 옆에 선택한 정보들 표기하는데 그 정보가

등급, 이름, 타입 - 극장, 영화관, 관람 날짜, 관람 시간 - 선택 좌석 - 인원 수(성인1, 청소년2 등)최종 결제 금액

이 있음. 이 중 좌석 선택하면 그 정보를 Ajax로 보내서 선택좌석 최신화(취소도 되면 좋은데 메가박스도 이건 안 함),
다음 버튼(결제)또는 이전 버튼(빠른 예매로) 이용
 
*결제창: 단순하게(API x)그냥 결제하시겠습니까? 결제액: - 결제/취소 버튼
*예매 다 되면 마이페이지의 예매내역으로 이동.

상영 시간표
- 영화별/ 극장별/ 특별관
- ${영화이름} 상영시간표 - 날짜 - 지역 - (여기서부터 테이블)상세 지역 - 영화관과 좌석 + 타입 + 시간과 좌석

4)극장
전체 극장
- 테이블&버튼1(div?): 지역
- 테이블&버튼2: 상세지역 > 누르면 상영시간표, 관람가격표(고정 가격)
상영 시간표는 괜찮을 듯(hidden으로 지역, 상세 지역은 들어간 상태. 날짜 누르면 상영 시간표의 상세 지역부분이 영화 이름으로 바뀜)
- 테이블3: 나의 선호 영화관 정보(ID, 선호 영화관 - 이걸 문자열로 받아서 split 하는 법도 있고 아예 스키마를 다섯 개 써서 담으면 됨. null 허용해서)

특별관 = 전체 극장과 데이터만 다름
