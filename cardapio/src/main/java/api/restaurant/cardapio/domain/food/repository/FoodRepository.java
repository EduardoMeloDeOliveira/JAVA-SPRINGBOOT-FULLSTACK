package api.restaurant.cardapio.domain.food.repository;

import api.restaurant.cardapio.domain.food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
