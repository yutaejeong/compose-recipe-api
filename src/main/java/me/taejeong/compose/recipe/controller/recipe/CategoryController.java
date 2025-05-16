package me.taejeong.compose.recipe.controller.recipe;

import me.taejeong.compose.recipe.entity.Category;
import me.taejeong.compose.recipe.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Category> getAllCategories() { return categoryRepository.findAll(); }
}
