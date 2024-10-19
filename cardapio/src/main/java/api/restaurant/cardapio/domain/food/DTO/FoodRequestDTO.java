package api.restaurant.cardapio.domain.food.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record FoodRequestDTO(

        Long id,

        @NotBlank
        String title,

        @NotBlank
        String image,

        @Positive
        Double price

) {
}
