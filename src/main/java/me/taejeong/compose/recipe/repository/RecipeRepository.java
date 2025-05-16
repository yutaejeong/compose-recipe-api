package me.taejeong.compose.recipe.repository;

import me.taejeong.compose.recipe.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
