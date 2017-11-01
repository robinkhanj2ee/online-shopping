package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {

		Category category = new Category();

		// adding cat item 1 //

		category.setId(1);
		category.setName("Phone");
		category.setDescription("Here is phone description");
		category.setImageURL("image1.jpg");

		categories.add(category);

		// 2nd cat //

		category = new Category();

		category.setId(2);
		category.setName("Book");
		category.setDescription("Here is Book description");
		category.setImageURL("image2.jpg");

		categories.add(category);

		// 3rd cat //

		category = new Category();

		category.setId(3);
		category.setName("Cloth");
		category.setDescription("Here is Cloth description");
		category.setImageURL("image3.jpg");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories){
			
			
			if(category.getId()== id) 
				return category;
		}
		
		return null;
	}

}
