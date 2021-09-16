package dev.ducta.pantrymanager;

import dev.ducta.pantrymanager.model.Food;
import dev.ducta.pantrymanager.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodResouce {
    public FoodResouce(FoodService foodService) {
        this.foodService = foodService;
    }

    private final FoodService foodService;

    @GetMapping("/all")
    public ResponseEntity<List<Food>> getAllFood(){
        List<Food> foods = foodService.findAllFood();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable("id") Long id){
        Food food = foodService.findFoodById(id);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Food> addFood(@RequestBody Food food){
        Food newFood = foodService.addFood(food);
        return new ResponseEntity<>(newFood, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Food> updateFood(@RequestBody Food food){
        Food updateFood = foodService.updateFood(food);
        return new ResponseEntity<>(updateFood, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable("id") Long id){
        foodService.deleteFood(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
