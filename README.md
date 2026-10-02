# IntelliJ Guide Study

향로(이동욱)의 IntelliJ 가이드 강의를 따라 IDE의 코드 편집, 탐색, 검색 기능을 연습한 Java 실습 기록입니다. 작은 예제 파일을 이용해 줄 편집, 코드 정보 확인, 포커스 이동, 텍스트 검색·치환을 실습했습니다.

## 학습 자료

- 강의: [IntelliJ를 시작하시는 분들을 위한 IntelliJ 가이드](https://www.inflearn.com/course/intellij-guide)
- 강사: 향로 · 이동욱
- 플랫폼: 인프런

## 실습 내용

소스 코드는 [src/main/java/com/hyeok/inflearn/intellij](./src/main/java/com/hyeok/inflearn/intellij/)에 있습니다.

| 구분 | 파일·폴더 | 학습 내용 |
| --- | --- | --- |
| 메인 메서드 | Main.java, Main2.java | main 메서드 작성과 실행 |
| 줄 편집 | [chap1/lineedit](./src/main/java/com/hyeok/inflearn/intellij/chap1/lineedit/) | 줄 복사, 여러 줄 합치기, 줄·구문 이동 |
| 코드 정보 확인 | [chap1/view](./src/main/java/com/hyeok/inflearn/intellij/chap1/view/) | 메서드 인자 정보, 선언부, API 문서 확인 |
| 에디터 탐색 | [chap2/editor](./src/main/java/com/hyeok/inflearn/intellij/chap2/editor/) | 코드 안에서 포커스 이동 |
| 선택·탐색 기능 | [chap2/special](./src/main/java/com/hyeok/inflearn/intellij/chap2/special/) | 선택 영역 확장, 오류 위치 이동, 반복되는 코드 편집 관련 연습 |
| 텍스트 검색·치환 | [chap3/text](./src/main/java/com/hyeok/inflearn/intellij/chap3/text/) | 파일 안과 프로젝트 전체에서 문자열 찾기·바꾸기 |
| 같은 이름의 클래스 탐색 | [chap3/special](./src/main/java/com/hyeok/inflearn/intellij/chap3/special/) | 서로 다른 폴더에 있는 Member 클래스 예제 |

학습의 중심은 IntelliJ에서 예제 코드를 선택하고 편집하며 기능을 익히는 것입니다.

## 프로젝트 열기

1. 저장소를 내려받아 IntelliJ IDEA에서 루트 폴더를 엽니다.
2. build.gradle을 기준으로 Gradle 프로젝트를 불러옵니다.
3. JDK를 설정한 뒤 주제별 Java 파일을 열어 IDE 기능을 연습합니다.

프로젝트에는 Gradle 8.14 Wrapper가 포함되어 있습니다. 단축키는 운영체제와 IntelliJ의 Keymap 설정에 따라 달라질 수 있으므로, 기능 이름을 검색해 현재 설정을 확인하면 됩니다.

## 현재 코드 상태

일부 예제에는 문법 오류, 메서드 인자 누락, 잘못된 import나 패키지 선언이 남아 있어 전체 프로젝트가 바로 컴파일되는 상태는 아닙니다. 예를 들어 ViewArguments.java에는 생성자·메서드 인자가 빠져 있고, FocusError.java에는 문법 오류가 있습니다.

강의는 자동완성, 리팩토링, 디버깅, Git 등의 기능도 다룹니다. 이 README는 현재 저장소에서 확인되는 코드 편집·포커스·검색 예제를 설명하며, 강의 전체 수강 여부를 나타내지는 않습니다.
