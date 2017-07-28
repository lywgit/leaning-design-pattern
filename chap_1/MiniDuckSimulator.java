public class MiniDuckSimulator{
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.display();
		model.swim();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}