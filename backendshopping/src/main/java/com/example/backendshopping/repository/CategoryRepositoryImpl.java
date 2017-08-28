package com.example.backendshopping.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.backendshopping.entity.Category;

public class CategoryRepositoryImpl implements CategoryRepository {
private static List<Category> categories = new ArrayList<>();

static {
	Category category = new Category();
	category.setId(1);
	category.setName("Television");
	category.setDescription("This is some description for television");
	category.setImageURL("CAT_1.png");
	
	categories.add(category);
	
	category = new Category();
	category.setId(2);
	category.setName("Mobile");
	category.setDescription("This is some description for mobile");
	category.setImageURL("CAT_2.png");
	
	categories.add(category);
	
	category = new Category();
	category.setId(1);
	category.setName("Laptop");
	category.setDescription("This is some description for laptop");
	category.setImageURL("CAT_3.png");
	
	categories.add(category);
	
}
	@Override
	public List<Category> list() {
		return categories;
	}

}
