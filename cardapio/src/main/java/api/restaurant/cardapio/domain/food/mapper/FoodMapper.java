package api.restaurant.cardapio.domain.food.mapper;

import api.restaurant.cardapio.domain.food.DTO.FoodRequestDTO;
import api.restaurant.cardapio.domain.food.DTO.FoodResponseDTO;
import api.restaurant.cardapio.domain.food.entity.Food;

public class FoodMapper {


    public static FoodResponseDTO foodEntityToFoodResponseDTO(Food food) {

        return FoodResponseDTO.builder()
                .id(food.getId())
                .title(food.getTitle())
                .image(food.getImage())
                .price(food.getPrice())
                .build();
    }


    public static Food foodRequestDtoToFoodEntity(FoodRequestDTO foodRequest) {

        return Food.builder()
                .id(null)
                .title(foodRequest.title())
                .image(foodRequest.image())
                .price(foodRequest.price())
                .build();
    }


}
