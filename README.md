# Calculator Project

[![CI/CD Pipeline](https://github.com/Kyuho1234/calculator-mock-testing/actions/workflows/ci.yml/badge.svg)](https://github.com/Kyuho1234/calculator-mock-testing/actions/workflows/ci.yml)
[![codecov](https://codecov.io/gh/Kyuho1234/calculator-mock-testing/branch/main/graph/badge.svg)](https://codecov.io/gh/Kyuho1234/calculator-mock-testing)

## 개요

이 프로젝트는 **TDD를 사용하지 않고** 계산기를 먼저 구현한 후, Mock을 이용한 단위 테스트와 통합 테스트를 진행하는 실습 프로젝트입니다.

## 기능

계산기는 다음 5가지 연산자 클래스로 구성됩니다:

- **Adder**: 덧셈 연산
- **Subtractor**: 뺄셈 연산  
- **Multiplier**: 곱셈 연산
- **Divider**: 나눗셈 연산
- **Flipper**: 부호 변경 및 절댓값 연산

## 프로젝트 구조

```
calculator-project/
├── src/
│   ├── main/java/com/example/
│   │   ├── Calculator.java      # 메인 계산기 클래스
│   │   ├── Adder.java          # 덧셈 연산자
│   │   ├── Subtractor.java     # 뺄셈 연산자
│   │   ├── Multiplier.java     # 곱셈 연산자
│   │   ├── Divider.java        # 나눗셈 연산자
│   │   └── Flipper.java        # 부호 변경 연산자
│   └── test/java/com/example/
│       ├── CalculatorMockTest.java        # Mock 단위 테스트
│       ├── CalculatorIntegrationTest.java # 통합 테스트
│       ├── AdderTest.java                 # Adder 단위 테스트
│       └── DividerTest.java              # Divider 단위 테스트
├── .github/workflows/
│   └── ci.yml                  # GitHub Actions CI/CD 설정
├── build.gradle               # Gradle 빌드 설정
└── README.md                  # 이 파일
```

## 테스트 전략

### 1. Mock 단위 테스트 (CalculatorMockTest)
- **목적**: Calculator 클래스의 각 메서드가 올바른 연산자 메서드를 호출하는지 검증
- **도구**: Mockito를 사용하여 의존성(Adder, Subtractor 등)을 Mock 객체로 대체
- **검증 내용**: 
  - 메서드 호출 여부 (verify)
  - 호출 횟수 (times)
  - 반환값 검증 (when/then)

### 2. 통합 테스트 (CalculatorIntegrationTest)
- **목적**: 실제 객체들을 사용하여 전체 시스템의 동작 검증
- **테스트 범위**:
  - 기본 연산 (덧셈, 뺄셈, 곱셈, 나눗셈, 부호 변경)
  - 다중 인수 연산
  - 복합 연산
  - 경계값 및 예외 상황

### 3. 개별 클래스 단위 테스트
- 각 연산자 클래스의 독립적인 기능 검증
- 경계값 및 예외 상황 테스트

## 빌드 및 실행

### 전제 조건
- Java 11 이상
- Gradle 8.4 이상

### 빌드 명령어

```bash
# 프로젝트 빌드
./gradlew build

# 단위 테스트 실행 (Mock 테스트)
./gradlew test --tests "*MockTest"

# 통합 테스트 실행
./gradlew test --tests "*IntegrationTest"

# 모든 테스트 실행
./gradlew test

# 테스트 커버리지 리포트 생성
./gradlew jacocoTestReport
```

## CI/CD Pipeline

이 프로젝트는 GitHub Actions를 사용하여 자동화된 CI/CD 파이프라인을 구현합니다:

### 트리거
- `main` 및 `develop` 브랜치에 푸시
- `main` 브랜치로의 Pull Request

### 파이프라인 단계
1. **코드 체크아웃**
2. **Java 11 환경 설정**
3. **Gradle 의존성 캐싱**
4. **Mock 단위 테스트 실행**
5. **통합 테스트 실행**  
6. **전체 테스트 실행**
7. **테스트 커버리지 리포트 생성**
8. **결과 아티팩트 업로드**

## 사용된 기술 스택

- **언어**: Java 11
- **빌드 도구**: Gradle 8.4
- **테스트 프레임워크**: JUnit 5
- **Mocking 프레임워크**: Mockito 5.1.1
- **코드 커버리지**: JaCoCo
- **CI/CD**: GitHub Actions

## 주요 특징

1. **Mock vs 실제 객체**: Mock 테스트와 통합 테스트를 분리하여 각각의 장점 활용
2. **의존성 주입**: Constructor Injection을 통한 테스트 가능한 설계
3. **예외 처리**: 0으로 나누기 등의 예외 상황 적절히 처리
4. **다양한 입력**: 단일 값 및 가변 인수 지원
5. **자동화된 테스트**: GitHub Actions를 통한 자동 테스트 실행

## 프로젝트 목표 달성

✅ TDD를 사용하지 않고 계산기 구현  
✅ Mock을 이용한 단위 테스트 작성  
✅ 통합 테스트 구현  
✅ GitHub Actions를 이용한 CI/CD 설정  
✅ 테스트 커버리지 측정 및 리포팅