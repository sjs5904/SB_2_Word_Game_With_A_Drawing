# SB_2
본 프로젝트는 캐치마인드의 컨셉을 카피하여 구현했습니다
### 블록 
![555555](https://user-images.githubusercontent.com/49792776/83830631-8fb4bc00-a720-11ea-9ed5-5918f1975e37.png)
### 데이터베이스 테이블 예시
![image](https://user-images.githubusercontent.com/49792776/83830733-d1456700-a720-11ea-8119-a616342b8aa3.png)

### 사용한 프로그램
  1. git desktop  
  2. MySQL Workbench  
  3. Android Studio  
  4. Spring Boot  
   
### 디자인 세부사항  
  + 서버:  
    + 유저 매니지먼트  
      + 로그인 관리  
      + 회원가입 관리  
      + 친구초대, 친구목록 관리  
    + 갤러리  
      + 서버에 저장된 이미지들을 보여줌  
    + 멀티플레이:  
      + 단어를 무작위로 정해 그리는 플레이어에게 보냄  
      + 채팅과 그리는 좌표를 같은 방안에 있는 플레이어들에게 브로드캐스팅함  

  + 데이터베이스  
    + 유저 정보 저장/수정.  
    + 단어와 그 설명을 저장.  
    + 이미지를 저장.  

  + 클라이언트:  
    + 멀티플레이   
      + 안드로이드 자체 캔버스 라이브러리 사용  
      + 로비 : 방을 생성하고 참여 가능  
      + 방에서부터 채팅가능, 모든 플레이어가 준비됐을 시 5초 후 게임 시작    
      + 그리는 플레이어 : 그릴 단어 변경 가능, 그릴때마다 서버에 좌표 전송  
      + 문제 맞추는 플레이어 : 그림을 보고 단어를 맞춤, 맞추거나 맞추지 못할 시 그에 따른 피드백 제공  
    + 기타 행동   
      + 유저 프로필 수정  
      + 로그인, 회원가입  
      + 갤러리: 비트맵 이미지를 String64로 변환 후 인코딩하여 서버로 전송, 서버에서 받은 이미지 정보를 다시 변환하여 게재  
      + 친구목록 관리: 친구 추가, 초대, 로그인 여부 확인.  
