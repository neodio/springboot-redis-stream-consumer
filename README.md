## 개요
Spring Boot를 사용한 Redis stream 구현의 예제 (컨슈머)

## 환경
- java 17
- spring boot 3.4.4
- IDE : IntelliJ IDEA
- OS : macOS

## 실행
- 레디스 스트림 프로듀싱 엔드포인트 (프로듀서용) 
    ```
    curl --request POST \
      --url http://localhost:8080/jobs/start \
      --header 'Content-Type: application/json' \
      --data '{"id": 1, "name": "some job name"}'
    ```

- 레디스 스트림 대기열 큐 id 조회 (프로듀서용)
    ```
    curl --request GET \
      --url http://localhost:8080/jobs/queued
    ```

- 컨슈밍 활성화 상태 모니터링 (컨슈머)
  ```
  curl --request GET \
    --url http://localhost:8081/actuator/health
  ```