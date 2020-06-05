# SB_2
본 프로젝트는 캐치마인드의 컨셉을 카피하여 구현했습니다
![Main-Feature-Test-Run](https://user-images.githubusercontent.com/49792776/83834002-35b7f480-a728-11ea-9ee4-cc22124953a6.gif)
### 블록 다이어그램
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
      
### 스크린 플로우 
![image](https://user-images.githubusercontent.com/49792776/83834529-7f550f00-a729-11ea-8c5f-aa8db6582d42.png)

### 클래스 기획 세부사항
[Server doc pdf-1.pdf](https://github.com/sjs5904/SB_2_Word_Game_With_A_Drawing/files/4733749/Server.doc.pdf-1.pdf)  
[client doc pdf-1.pdf](https://github.com/sjs5904/SB_2_Word_Game_With_A_Drawing/files/4733747/client.doc.pdf-1.pdf)  

![Server doc pdf-1-1](https://user-images.githubusercontent.com/49792776/83834305-f211ba80-a728-11ea-91f1-7a19487a121a.png)
![Server doc pdf-1-2](https://user-images.githubusercontent.com/49792776/83834306-f342e780-a728-11ea-8be9-a6a1f30084c1.png)
![Server doc pdf-1-3](https://user-images.githubusercontent.com/49792776/83834307-f342e780-a728-11ea-8963-143a3c3d60bd.png)
![Server doc pdf-1-4](https://user-images.githubusercontent.com/49792776/83834308-f3db7e00-a728-11ea-9e29-7b4e8a36fd86.png)
![Server doc pdf-1-5](https://user-images.githubusercontent.com/49792776/83834310-f4741480-a728-11ea-9b84-05591111a407.png)

![client doc pdf-1-01](https://user-images.githubusercontent.com/49792776/83834328-05bd2100-a729-11ea-958c-1afc704860db.png)
![client doc pdf-1-02](https://user-images.githubusercontent.com/49792776/83834330-06ee4e00-a729-11ea-9220-af7146fee18c.png)
![client doc pdf-1-03](https://user-images.githubusercontent.com/49792776/83834331-06ee4e00-a729-11ea-9e15-655113c4ac27.png)
![client doc pdf-1-04](https://user-images.githubusercontent.com/49792776/83834332-0786e480-a729-11ea-8f24-75e5db4f0a00.png)
![client doc pdf-1-05](https://user-images.githubusercontent.com/49792776/83834333-0786e480-a729-11ea-97c1-c5205f20647c.png)
![client doc pdf-1-06](https://user-images.githubusercontent.com/49792776/83834334-081f7b00-a729-11ea-9355-808350956f1d.png)
![client doc pdf-1-07](https://user-images.githubusercontent.com/49792776/83834335-081f7b00-a729-11ea-92d0-46df52c985f0.png)
![client doc pdf-1-08](https://user-images.githubusercontent.com/49792776/83834336-08b81180-a729-11ea-83e9-e516f51b1ee9.png)
![client doc pdf-1-09](https://user-images.githubusercontent.com/49792776/83834339-08b81180-a729-11ea-8871-dc26c8bef155.png)
![client doc pdf-1-10](https://user-images.githubusercontent.com/49792776/83834340-0950a800-a729-11ea-9d4e-6a7e5fc3b222.png)
