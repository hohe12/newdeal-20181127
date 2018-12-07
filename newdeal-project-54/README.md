# eomcs-java-project-54

## 작업

### Spring WebMVC 라이브러리 가져오기

- build.gradle
 - mvnrepository.com 에서 `spring-webmvc`로 검색하여 라이브러리 정보를 찾아 이 파일에 등록한다.
 - `$ gradle eclipse` 실행한다.
 - 이클립스 프로젝트 갱신한다.

 ### Spring WebMVC의 프론트 컨트롤러 설정하기

 - MyWebApplicationInitializer.java
  - webApplicationInitializer 구현체를 만든다.
  - Spring IoC 컨테이너와 DispatcherServlet을 준비한다.

### 기존의 DispatcherServlet을 제거한다.

- Spring WebMVC의 DispatcherServlet을 사용하기 때문에 기존 클래스는 제거한다.

### 기존의 ContextLoaderListener를 제거한다.

- Spring에서 제공한 DispatcherServlet은 자체적으로 Spring IoC 컨테이너를 다루기 떄문에 더이상 이 클래스는 소용이 없다.
