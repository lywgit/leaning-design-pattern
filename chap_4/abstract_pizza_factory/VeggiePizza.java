public class VeggiePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public VeggiePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;

	}
	void prepare(){
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauch();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}