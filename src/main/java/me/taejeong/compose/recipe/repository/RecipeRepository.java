package me.taejeong.compose.recipe.repository;

import me.taejeong.compose.recipe.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, String> {

    List<Recipe> findByCategoryId(Integer category_id);
}
