public class OrderPizzaTest{
	public static void main(String [] args){
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore myStore = new PizzaStore(factory);
		Pizza pizza1, pizza2;
		pizza1 = myStore.orderPizza("cheese");
		pizza2 = myStore.orderPizza("pepperoni"); 
	}
}