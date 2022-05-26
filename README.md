## jsp/servlet basic_crud

기초적인 jsp 와 servlet 만으로 구성된 CRUD 입니다

### 사용된 언어

1. Java 8
2. jsp 
3. oracleDB


### 기능

최소한의 CRUD를 직접 넣어보고자 만들었습니다.

1. ListController로 실행해 JSP를 직접 건들이지 않고 프로젝트 실행 
2. JSTL , ELtag 로 입력값을 WebServlet으로 전달
3. 데이터 전달을 위해 각 기능별 doGet,doPost 메서드를 오버라이드 해 기능을 Service에서 수행 하도록 Controller 패키지 생성
4. NoticeService 클래스에서 각 기능별 수행 로직, 데이터 베이스 연결 로직을 생성
5. 가장 기본적인 입력, 출력, 삭제, 수정 기능이 가능하도록 구성완료

