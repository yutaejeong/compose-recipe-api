package me.taejeong.compose.recipe.repository;

import me.taejeong.compose.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Integer> {
}
