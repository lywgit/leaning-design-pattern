public class PepperoniPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
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