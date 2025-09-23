import json

# 기존 JSON 파일 읽기
with open('../assets/output_json/flutter_svg_data.json', 'r', encoding='utf-8') as f:
    data = json.load(f)

# MongoDB용 배열 형식으로 변환
mongodb_data = []

for building_id, building_data in data['buildings'].items():
    mongodb_building = {
        "_id": building_id,
        "buildingName": building_data['building_name'],
        "floors": building_data['floors']
    }
    mongodb_data.append(mongodb_building)

# MongoDB용 JSON 파일 생성
with open('mongodb_buildings.json', 'w', encoding='utf-8') as f:
    json.dump(mongodb_data, f, ensure_ascii=False, indent=2)

print(f"MongoDB data conversion completed!")
print(f"Generated file: mongodb_buildings.json")
print(f"Number of buildings: {len(mongodb_data)}")