# SB_2
본 프로젝트는 캐치마인드의 컨셉을 카피하여 구현했습니다

![555555](https://user-images.githubusercontent.com/49792776/83830631-8fb4bc00-a720-11ea-9ed5-5918f1975e37.png)
데이터베이스 테이블 예시
![image](https://user-images.githubusercontent.com/49792776/83830733-d1456700-a720-11ea-8119-a616342b8aa3.png)

사용한 프로그램
  1. git desktop
  2. MySQL Workbench
  3. Android Studio
  4. Spring Boot

디자인 세부사항
  1. 서버:
    1) 유저 매니지먼트:
    - 로그인 관리.
    - 회원가입 관리.
    - 친구초대, 친구목록 관리.
    2) 갤러리:
    - Browse top drawings gallery.
    3) 멀티플레이:
    - 단어를 무작위로 정해 그리는 플레이어에게 보냄
    - 채팅과 그리는 좌표를 같은 방안에 있는 플레이어들에게 브로드캐스팅함

  2. 데이터베이스:
    1) 유저 정보 저장/수정.
    2) 단어와 그 설명을 저장.
    3) 이미지를 저장.

  3. 클라이언트:
    1) Main Activity :
      • Main game feature
      • Utilizes Android built-in class ‘Canvas’
      • Lobby : user can create and join room
      • Room : game starts if all users in a room inputs ‘ready’
      • Drawer : Draw on canvas, Send Json Object to server with certain protocol
      • Guesser: Input guessing word, Receives Json Object response from the server and follows the instruction in received data
    2) Sub-Activity :
      • Update user data
      • Login, Register: register a new user and send login information to the server
      • Gallery: get images from the server and list them
      • Friend List: Users can search and add other users to their friend list. Send volley requests to the server for all user lists.
