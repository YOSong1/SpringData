### - STS - Spring Legacy Project - Simple Projects이외에 다른 template(Spring MVC 등) 항목들이 보이지 않을 때
(1) 다음 과정 순서대로 진행

![image](https://github.com/user-attachments/assets/f0d0b1ad-ae76-492b-927b-6fdfeb3bdd18)


- Configure templates... 클릭하고 Spring -> Template Projects 항목을 선택하여 다음 그림의 2개 항목을 Remove하고 적용한다.


![image](https://github.com/user-attachments/assets/5220c2ba-c467-4e83-93a1-da0e2557fb98)


- 두 항목을 Remove한 후에도 적용이 되지 않는다면 다음 파일을 프로젝트 생성된 workspace 경로 중 다음 위치에 https-content.xml 파일을 복사한 후 해당 workspace 경로를 이용하여 다시 STS 실행한다.

- 예를들어 STS 실행 workspaces 이름을 TestProject1으로 생성했다면 해당 경로에서 .metadata -> plugins -> org.springsource.ide.eclipse.commons.content.core위치를 찾아서 파일을 복사한다.


![image](https://github.com/user-attachments/assets/43532762-83d8-4099-914c-85389fd6aa3e)


