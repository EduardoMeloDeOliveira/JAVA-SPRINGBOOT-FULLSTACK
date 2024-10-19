package api.restaurant.cardapio.controller;

import api.restaurant.cardapio.domain.food.DTO.FoodRequestDTO;
import api.restaurant.cardapio.domain.food.DTO.FoodResponseDTO;
import api.restaurant.cardapio.domain.food.service.FoodService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {


    @Autowired
    private FoodService foodService;

    @PostMapping
    public ResponseEntity<FoodResponseDTO> createFood(@RequestBody FoodRequestDTO foodRequestDTO) {

        FoodResponseDTO foodResponseDTO = foodService.createFood(foodRequestDTO);

        return ResponseEntity.created(null).body(foodResponseDTO);
    }

    @GetMapping
    public ResponseEntity<List<FoodResponseDTO>> getAllFoods() {

        List<FoodResponseDTO> foodResponseDTOList = foodService.getAllFoods();

        if (foodResponseDTOList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(foodResponseDTOList);
    }
}
