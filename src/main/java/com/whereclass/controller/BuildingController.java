package com.whereclass.controller;

import com.whereclass.model.Building;
import com.whereclass.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/buildings")
@CrossOrigin(origins = "*")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public ResponseEntity<List<Building>> getAllBuildings() {
        List<Building> buildings = buildingService.getAllBuildings();
        return ResponseEntity.ok(buildings);
    }

    @GetMapping("/{buildingId}")
    public ResponseEntity<Building> getBuildingById(@PathVariable String buildingId) {
        Optional<Building> building = buildingService.getBuildingById(buildingId);
        return building.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{buildingId}/floors")
    public ResponseEntity<Set<String>> getFloorIds(@PathVariable String buildingId) {
        Set<String> floorIds = buildingService.getFloorIdsByBuildingId(buildingId);
        if (floorIds.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(floorIds);
    }

    @GetMapping("/{buildingId}/floors/{floorId}")
    public ResponseEntity<Object> getFloorData(@PathVariable String buildingId,
                                              @PathVariable String floorId) {
        Optional<Object> floor = buildingService.getFloorData(buildingId, floorId);
        return floor.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{buildingId}/floors/{floorId}/rooms/{roomId}")
    public ResponseEntity<Object> getRoomData(@PathVariable String buildingId,
                                           @PathVariable String floorId,
                                           @PathVariable String roomId) {
        Optional<Object> room = buildingService.getRoomData(buildingId, floorId, roomId);
        return room.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }
}