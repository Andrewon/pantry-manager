package dev.ducta.pantrymanager.repo;

import dev.ducta.pantrymanager.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodRepo extends JpaRepository <Food, Long>{
        void deleteFoodById(Long id);

        Optional<Food> findFoodById(Long id);
}
