package api.restaurant.cardapio.domain.food.DTO;


import lombok.Builder;

@Builder
public record FoodResponseDTO(Long id, String title, String image, Double price){
}
