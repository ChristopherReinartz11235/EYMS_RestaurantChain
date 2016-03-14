package EYMS;

import java.util.Map;

public class Meal {
	private Map<String,Integer> ingredients;
	private Map<String,Double> ingredientPrices;
	
	public Meal(Map<String, Integer> ingredients, Map<String, Double> ingredientPrices) {
		super();
		this.ingredients = ingredients;
		this.ingredientPrices = ingredientPrices;
	}

	public Meal() {
		super();
		this.ingredients = null;
		this.ingredientPrices = null;
	}
	
	public void addIngredientWithPrice(String ingredient, double price){
		if(!this.ingredients.containsKey(ingredient)){
		this.ingredients.put(ingredient, 1);
		this.ingredientPrices.put(ingredient, price);
		}
		else{
			System.out.println("Ingredient is already registered.");
			/**
			 * replace later, so that a ingredient price can be overwritten
			 *  */
		}
	}
	
	
}
