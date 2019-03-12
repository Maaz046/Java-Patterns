package strategy;


public class Test {

	public static void main(String[] args) {
		System.out.println("Mallard");
		MallardDuck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("Model");
		Duck model = new ModelDuck();
		model.performFly();
		//change FlyBehavior on the fly/runtime
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
		

	}

}
