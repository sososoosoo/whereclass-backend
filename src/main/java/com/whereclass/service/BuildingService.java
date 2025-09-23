package com.whereclass.service;

import com.whereclass.model.Building;
import com.whereclass.model.Floor;
import com.whereclass.model.Room;
import com.whereclass.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Optional<Floor> getFloorData(String buildingId, String floorId) {
        Optional<Building> building = buildingRepository.findById(buildingId);
        if (building.isPresent()) {
            Floor floor = building.get().getFloors().get(floorId);
            return Optional.ofNullable(floor);
        }
        return Optional.empty();
    }

    public Optional<Room> getRoomData(String buildingId, String floorId, String roomId) {
        Optional<Floor> floor = getFloorData(buildingId, floorId);
        if (floor.isPresent()) {
            Room room = floor.get().getClickableAreas().get(roomId);
            return Optional.ofNullable(room);
        }
        return Optional.empty();
    }
}