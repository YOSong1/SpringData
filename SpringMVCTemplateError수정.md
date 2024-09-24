### STS 3 SpringMVC Template 생성오류 해결
- 2024년 이후 문제 발생 중

- 다음 2개의 파일을 다운로드하여 사용 중인 workspace 폴더 중 다음 위치에 저장합니다.
  
https-content.xml

org.springframework.templates.mvc-3.2.2.zip 


![sts_workspace](https://github.com/user-attachments/assets/b6cb0cad-d71f-4e23-9dd3-3b00fbe62be3)



- 만약 위의 과정처럼 파일을 위치시키고 다시 STS를 실행한 후에도 문제 해결 되지 않는 경우 STS 설치 폴더의 STS.ini 파일 내부에 자바 경로를 추가해 봅니다.
- 다음 코드와 같이 추가하며 자바 경로는 각자 설치되어 있는 위치를 확인합니다.

-vm

C:\Program Files\Java\jdk-11\bin\javaw.exe

![sts_ini](https://github.com/user-attachments/assets/c9f4bdc4-2e23-4dfd-b72f-d0c2a5e79203)


