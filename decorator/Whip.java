public class Whip extends Beverage {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
