package me.taejeong.compose.recipe.dto;

import me.taejeong.compose.recipe.entity.Category;
import me.taejeong.compose.recipe.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {
    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    RecipeDto toRecipeDto(Recipe recipe);

    default String map(Category category) {
        return category.getName();
    }
}
