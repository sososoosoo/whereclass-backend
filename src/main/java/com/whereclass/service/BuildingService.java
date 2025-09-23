package com.whereclass.service;

import com.whereclass.model.Building;
import com.whereclass.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    public Optional<Building> getBuildingById(String buildingId) {
        return buildingRepository.findById(buildingId);
    }

    public Set<String> getFloorIdsByBuildingId(String buildingId) {
        Optional<Building> building = buildingRepository.findById(buildingId);
        if (building.isPresent()) {
            return building.get().getFloors().keySet();
        }
        return Set.of();
    }

    public Optional<Object> getFloorData(String buildingId, String floorId) {
        Optional<Building> building = buildingRepository.findById(buildingId);
        if (building.isPresent()) {
            Object floor = building.get().getFloors().get(floorId);
            return Optional.ofNullable(floor);
        }
        return Optional.empty();
    }

    public Optional<Object> getRoomData(String buildingId, String floorId, String roomId) {
        Optional<Object> floor = getFloorData(buildingId, floorId);
        if (floor.isPresent() && floor.get() instanceof Map) {
            Map<String, Object> floorMap = (Map<String, Object>) floor.get();
            Object clickableAreas = floorMap.get("clickable_areas");
            if (clickableAreas instanceof Map) {
                Map<String, Object> clickableAreasMap = (Map<String, Object>) clickableAreas;
                Object room = clickableAreasMap.get(roomId);
                return Optional.ofNullable(room);
            }
        }
        return Optional.empty();
    }
}