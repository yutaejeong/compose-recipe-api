package me.taejeong.compose.recipe.controller.recipe;

import me.taejeong.compose.recipe.dto.RecipeDto;
import me.taejeong.compose.recipe.dto.RecipeMapper;
import me.taejeong.compose.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<RecipeDto> getAllRecipes() {
        return StreamSupport
                .stream(recipeRepository.findAll().spliterator(), false)
                .map(RecipeMapper.INSTANCE::toRecipeDto)
                .toList();
    }

    @PostMapping("/find")
    public @ResponseBody Iterable<RecipeDto> findRecipesByCategories(@RequestBody Integer[] category_ids) {
        return Arrays.stream(category_ids)
                .map(recipeRepository::findByCategoryId)
                .flatMap(Collection::stream)
                .map(RecipeMapper.INSTANCE::toRecipeDto)
                .collect(Collectors.toList());
    }
}
