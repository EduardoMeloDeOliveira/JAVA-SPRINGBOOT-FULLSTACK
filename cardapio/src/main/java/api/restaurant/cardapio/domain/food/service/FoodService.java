package api.restaurant.cardapio.domain.food.service;


import api.restaurant.cardapio.domain.food.DTO.FoodRequestDTO;
import api.restaurant.cardapio.domain.food.DTO.FoodResponseDTO;
import api.restaurant.cardapio.domain.food.entity.Food;
import api.restaurant.cardapio.domain.food.mapper.FoodMapper;
import api.restaurant.cardapio.domain.food.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;


    public FoodResponseDTO createFood(FoodRequestDTO foodRequestDTO) {

        Food food = FoodMapper.foodRequestDtoToFoodEntity(foodRequestDTO);
        foodRepository.save(food);
        return FoodMapper.foodEntityToFoodResponseDTO(food);
    }

    public List<FoodResponseDTO> getAllFoods() {

        List<Food> foods = foodRepository.findAll();
        List<FoodResponseDTO> foodResponseDTOS = new ArrayList<>();

        if (foods.isEmpty()) {
            return foodResponseDTOS;
        }

        return foodResponseDTOS = foods.stream()
                .map(food -> FoodMapper.foodEntityToFoodResponseDTO(food))
                .collect(Collectors.toList());

    }
}
