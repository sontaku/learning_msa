# MSA

> MicroService Architecture : 마이크로서비스 아키텍처

​                                 

## Microservices란?

Monolith(단일) 어플리케이션을 작은 서비스 단위로 개발하는 방법

Monolith <-> Microservice

​                                    

## 특징

- **각각 자체 프로세스에서 실행**
- 대부분 HTTP기반 API와 통신
- 비즈니스 기능을 중심으로 구축
- 완전 자동화된 배포머신을 통해 독립배포
- **중앙 집중식 관리는 최소화**
- 다른 프로그래밍 언어로 개발될 수 있음
- 다른 데이터 저장 기술을 사용할 수 있음

​                                

## MSA 적용을 통해 얻는 이점

- **장애 격리와 복구가 쉬움** -> *다른 서비스에 영향을 주지 않음!*
- 비용 효율적으로 증설이 가능함
- 서비스 개선 속도가 증가함 -> **빠른 배포**가 가능!*
- 생산성 향상 및 코드량이 적어 쉽게 수정 가능
- **각각의 서비스가 작기 때문에 신기술 도입이 쉬움**
- Polyglot 적용 가능 -> *서비스에 최적화된 개발 언어와 DB 선택에 용이*
  - 구축하고자 하는 서비스에 따라 Java, Python 등 분리

​                                    

## MSA 적용시 고려사항

1. MSA에 적합한 서비스인가?
   - 빠르고 잦은 배포를 필요로 하는가?
   - 성능에 민감한 서비스인가?
   - 분산 트랜잭션이 있는 서비스인가?
2. 데이터의 중복성을 허용해야함 -> 서비스별로 다른 데이터를 다루기 때문
3. 배포 및 릴리즈를 자동화해야 함 -> 자동화되지 않으면 운영에 굉장한 부담 발생
4. MSA 서비스에 맞는 팀이 운영되어야 함

​                                   

## 개발환경

OS : Windows 10

Java : AdoptOpenJDK 11

Spring Boot : 2.5.2

Spring Cloud : 2020.0.3

​                                                 

## 개념 정리

### Spring Cloud Eureka

마이크로서비스들의 정보를 레지스트리에 등록할 수 있도록 하고 마이크로서비스의 동적인 탐색과 로드밸런싱을 제공

1. 마이크로 서비스들을 client로 가질 eureka server 구현
2. 해당 server에 eureka client들을 등록하여 Instance로 추가

​                                        

### ~~Spring Cloud Zuul : API Gateway -> Client 요청별 처리~~ 

zuul 은 최신버전에서 지원하지 않으므로 ```Spring Cloud Gateway```로 대체

​                                        

### Spring Cloud Gateway : API Gateway -> Client 요청별 처리

- Zuul과 같이 비동기, 논블로킹 방식
- Netty 런타임 기반 동작
- Spring WebFlux 기반
- Servlet 기반 Spring MVC와 호환이 매끄럽지 않음

​                                                 

## 참조

- https://youtu.be/UsWrvBaQOA4
- https://earlgreybutter.tistory.com/222
- https://taes-k.github.io/2019/06/16/spring-msa-3/
- https://github.com/taes-k/spring-example/tree/master/spring-msa/msa-web-site
- https://wonit.tistory.com/497