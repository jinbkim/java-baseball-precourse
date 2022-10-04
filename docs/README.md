## 1. 기능 요구 사항

- [x] 정상적인 숫자 입력 받기
- [x] 비정상적인 숫자 입력 받기 (잘못된 입력값은 IllegalArgumentException 발생시킨 후 종료)
  - [x] 0이 아닌 자연수 인지 검사하기
  - [x] 3자리 인지 검사하기
  - [x] 서로 다른 숫자 인지 검사하기
- [x] 게임 결과 확인 하기
  - [x] 스트라이크
  - [x] 볼
  - [x] 낫싱
- [x] 게임 종료 후, 입력 받기
  - [x] 1 입력시, 게임 다시 시작 하기
  - [x] 2 입력시, 게임 완전 종료 하기
  - [x] 비정상적인 입력시, IllegalArgumentException 발생시킨 후 종료
- [x] 랜덤으로 정답 생성 하기

## 2. 제출 전 체크

- [ ] 자바 8버전 확인
- [ ] 모든 테스트가 통과하는지 확인 (./gradlew clean test)

## 3. 학습한 내용

### Java 버전

- 자바는 8버전에서 많은 사항들이 변경되고 새롭게 추가됨
- 8버전 특징 : Lambda, Stream, Interface default method, Optional, Date and Time API 등

### Git 사용법

- git branch test : test 브랜치 생성
- git checkout test : test 브렌치로 전환

### 함수형 인터페이스

- Function<T, R> : T 타입의 인자를 받아서 R 타입을 반환

### Stream

- map(Function< T, R >) : 스트림 요소들에게 Function이 적용된 결과의 새로운 요소로 매핑
- collect(Collector< T, A, R >) : 스트림의 데이터를 원하는 자료형으로 변환
- Collectors.toList() : 스트림을 리스트로 변환
- distinct() : 중복되는 요소들을 모두 제거해주고 새로운 스트림을 반환
- count() : 스트림의 요소 개수 반환

### 정규 표현식

- 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용되는 언어
- 자바는 개발자가 정규표현식을 사용할 수 있도록 많은 유틸을 제공
- Pattern.matches(pattern, str) : 정규표현식 pattern에 문자열 str이 매칭되면 true, 아니면 false 반환

### List

- contains(obj) : obj가 리스트 안에 있으면 true, 아니면 false 반환
- indexOf(obj) : obj가 리스트 안에 있으면 해당 객체가 첫번째로 나타는 인덱스 값을 반환, 없으면 -1 반환

## Enum 클래스

- 자바에서는 enum 키워드를 사용하여 열거체를 정의할 수 있음

## StringBuilder

- String과 다르게 변경 가능한 문자열 생성
- append(str) : 문자열에 str을 합침
- toString() : StringBuilder가 가진 문자열 반환