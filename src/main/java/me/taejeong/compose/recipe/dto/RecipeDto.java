package me.taejeong.compose.recipe.dto;

import lombok.Data;
import me.taejeong.compose.recipe.entity.Category;

@Data
public class RecipeDto {
    String name;
    String category;
    String recipe;
    String imageUrl;

    String map(Category category) {
        return category.getName();
    }
}
