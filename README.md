# WhereClass Backend API

Spring Boot 기반의 대학 강의실 위치 안내 시스템 백엔드 API

## 📋 요구사항

- Java 17 이상
- Gradle 7.0 이상 (Gradle Wrapper 포함)
- MongoDB 4.4 이상

## 🚀 실행 방법

### 1. MongoDB 설치 및 실행
```bash
# MongoDB 설치 (Ubuntu/Linux Mint)
sudo apt update
sudo apt install mongodb-org

# MongoDB 시작
sudo systemctl start mongod
sudo systemctl enable mongod
```

### 2. 데이터 Import
```bash
# 기존 JSON 데이터를 MongoDB로 import
mongoimport --db whereclass --collection buildings --file ../assets/output_json/flutter_svg_data.json --jsonArray
```

### 3. 애플리케이션 실행
```bash
# Gradle Wrapper 사용 (권장)
./gradlew bootRun

# 또는 JAR 빌드 후 실행
./gradlew build
java -jar build/libs/whereclass-backend-1.0.0.jar

# Windows에서는
gradlew.bat bootRun
```

## 📚 API 엔드포인트

### 건물 관련
- `GET /api/buildings` - 모든 건물 목록
- `GET /api/buildings/{buildingId}` - 특정 건물 정보
- `GET /api/buildings/{buildingId}/floors` - 건물의 층 목록
- `GET /api/buildings/{buildingId}/floors/{floorId}` - 특정 층의 SVG 데이터
- `GET /api/buildings/{buildingId}/floors/{floorId}/rooms/{roomId}` - 특정 강의실 정보

### 예시 요청
```bash
# 모든 건물 조회
curl http://localhost:8080/api/buildings

# 백운관 정보 조회
curl http://localhost:8080/api/buildings/baekun_hall

# 백운관 1층 데이터 조회
curl http://localhost:8080/api/buildings/baekun_hall/floors/baekun_hall_floor_1
```

## 🏗️ 프로젝트 구조

```
src/main/java/com/whereclass/
├── WhereClassApplication.java
├── controller/
│   └── BuildingController.java
├── service/
│   └── BuildingService.java
├── repository/
│   └── BuildingRepository.java
└── model/
    ├── Building.java
    ├── Floor.java
    ├── Room.java
    ├── Coordinate.java
    ├── SvgDimensions.java
    └── SvgPathInfo.java
```

## 📊 데이터 모델

- **Building**: 건물 정보 (ID, 이름, 층 정보)
- **Floor**: 층 정보 (이름, SVG 파일, 치수, 클릭 가능 영역)
- **Room**: 강의실 정보 (ID, 타입, 표시명, 다각형 좌표, 중심점)
- **Coordinate**: 좌표 정보 (x, y)
- **SvgDimensions**: SVG 치수 정보 (너비, 높이, viewBox)
- **SvgPathInfo**: SVG 경로 정보

## 🔧 설정

### application.yml
```yaml
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: whereclass
server:
  port: 8080
  servlet:
    context-path: /api
```