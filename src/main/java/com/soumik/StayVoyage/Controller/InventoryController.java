package com.soumik.StayVoyage.Controller;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.soumik.StayVoyage.Dto.InventoryDTO;
import com.soumik.StayVoyage.Dto.UpdateInventoryRequestDTO;
import com.soumik.StayVoyage.Service.Interfaces.InventoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/admin/inventory")
@RequiredArgsConstructor
@SecurityRequirement(name = "BearerAuth")
@Tag(name = "Admin Inventory", description = "Manage hotel room inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/rooms/{roomId}")
    @Operation(summary = "Retrieve inventory of a room",description = "Fetch all available inventory items for a given room ID", tags = {"Admin Inventory"})
    public ResponseEntity<List<InventoryDTO>> getAllInventoryByRoom(@PathVariable Long roomId) {
        return ResponseEntity.ok(inventoryService.getAllInventoryByRoom(roomId));
    }

    @PatchMapping("/rooms/{roomId}")
    @Operation(summary = "Update inventory for a room",description = "Modify the inventory details for a specific room", tags = {"Admin Inventory"})
    public ResponseEntity<Void> updateInventory(@PathVariable Long roomId,
                                                @RequestBody UpdateInventoryRequestDTO updateInventoryRequestDto) {
        inventoryService.updateInventory(roomId, updateInventoryRequestDto);
        return ResponseEntity.noContent().build();
    }
}

