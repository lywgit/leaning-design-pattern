public interface PizzaIngredientFactory{
	public Dough createDough();
	public Sauce createSauch();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}