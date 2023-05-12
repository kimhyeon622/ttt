# TTT
![TTT](https://github.com/kimhyeon622/ttt/assets/121088829/6b103f1c-7ac2-41b7-ab4a-40c370537ab2)

## TTTheater
인천일보아카데미 두번째 프로젝트(세미프로젝트) <br/>
개발기간 : 2022.11.30 ~ 2022.12.19(약 2주) <br/>

## 프로젝트 소개
프로젝트의 이름인 TTT는 "영화관 갈 시간" 이라는 의미의 "Time To go to the Theater"입니다
간단하게는 TTT, 로고에는 TTheater로 사용합니다

TTT는 영화를 예매할 수 있는 예매 사이트 입니다 <br/>
현재 상영중인 영화와 상영예정작들을 확인할 수 있습니다. 

## 개발 팀원
개발 인원 : 총 4명 <br/>
#### Front End
 - 팀장 : 오주현 - 대부분의 Front End, PPT 제작 및 발표, 프로젝트 및 데이터베이스 최종수정 <br/>
#### Back End 
 - 팀원1 : 최준호 - 영화 정보 상세보기, 관람평 및 좋아요, 전체 극장
 - 팀원2 : 김현 - 회원 관련,  전체 영화/상영예정작, 예매 관련, 프로젝트 취합
 - 팀원3 : 신대철 - 무비 포스트 기본바탕

## 주요기능
### 회원 관련
#### 회원가입
 - 회원가입을 할 때 생년월일, 연락처, 아이디, 비번, 이메일, 이름을 입력해야 하고 저장 될 때에 연락처는 - 추가해서 저장이 됩니다<br/>
#### 로그인 및 로그아웃
 - 회원가입한 아이디로 로그인이 가능하며 로그아웃도 가능합니다.<br/>
#### 마이 페이지
- 자기 정보 확인 및 수정이 가능하며 아이디는 바꾸지 못합니다.<br/>
- 자신의 예매 내역을 확인할 수 있습니다<br/>
- 회원 탈퇴가 가능합니다<br/>

#### 관리자
 - 관리자는 회원 관리를 할 수 있게 회원 목록을 볼 수 있습니다 <br/>
 - 관리자는 회원의 정보 및 게시글들을 수정 및 삭제를 할 수 있습니다 <br/>

### 영화 정보
 영화 정보는 크게 3가지로 있으며 박스오피스와 상영예정작 그리고 모두 볼 수 있는 전체 영화가 있습니다<br/>
 모든 영화는 예매율에 따라 예매율이 가장 높은 순서대로 포스터가 나옵니다 <br/>
 이 기능은 비회원도 사용이 가능합니다

#### 영화 정보 상세 보기
- 마우스를 해당영화 포스터에 마우스를 올려 두면 해당 영화의 간단한 정보를 볼 수 있습니다
- 클릭시 해당 영화의 더욱 상세한 정보를 확인 할 수 페이지로 이동됩니다<br/>
  **더욱 상세한 정보**로는 영화 설명, 예고편, 상영타입-D, 감독, 장르, 등급, 개봉일, 출연진, 관람평등이 있습니다

### 영화 예매
빠른 예매(회원 한정) : 항상 오른쪽 위에 빠른 예매 버튼이 있으며 클릭시 예매페이지로 바로 이동합니다

#### 극장과 시간 선택
지역과 극장(지점) 그리고 영화이름, 관람 일자가 선택 가능하며 선택시 네 가지 데이터에 해당하는 영화의 시간표가 나옵니다

#### 예매
인원 선택 후 좌석을 선택하면 결제창으로 이동됩니다(단, 인원 수와 좌석이 맞지 않다면 이동되지 않습니다)
결제창에서 결제 완료시 마이페이지로 이동됩니다

### 무비 포스트
#### 무비 포스트 목록
 - 작성한 무비 포스트들을 한 눈에 볼 수 있습니다
 - 만약 로그인 상태면 "무비포스트 작성" 버튼도 같이 보입니다
#### 무비 포스트 작성
 - 영화명과 제목, 내용을 작성할 수 있습니다 <br/>
 영화명에 영화의 제목을 입력하면 무비 포스트 작성시 해당 영화의 포스트로 작성됩니다 <br/>
 무비 포스트 작성 완료시 영화 이름과 작성자 작성일 좋아요 수와 같이 작성됩니다
