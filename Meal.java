/ Filename: Meal.java 
public enum Meal {
	// Each enum constant defines a constant-specific class body
	BREAKFAST(7,30) {
		public double mealPrice(Day day) {
			double breakfastPrice = 10.50;
			if (day.equals(Day.SATURDAY) || day == Day.SUNDAY)
				breakfastPrice *= 1.5; return breakfastPrice;
		}
		public String toString() {
			return "Breakfast"; }
	},
	LUNCH(12,15) {
		public double mealPrice(Day day) { double lunchPrice = 20.50; switch (day) {
				￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼￼case SATURDAY: case SUNDAY:
				lunchPrice *= 2.0; }
			return lunchPrice; }
			public String toString() { return "Lunch";
				} },
	DINNER(19,45) {
			public double mealPrice(Day day) {
				// (6)
				double dinnerPrice = 25.50;
				if (day.compareTo(Day.SATURDAY) >= 0 && day.compareTo(Day.SUNDAY) <= 0)
					dinnerPrice *= 2.5; return dinnerPrice;
			} };
	// Abstract method implemented in constant-specific class bodies. abstract double mealPrice(Day day);
	// (7)
	// Enum constructor: 
	Meal(int hh, int mm) {
	assert (hh >= 0 && assert (mm >= 0 &&
	this.hh = hh;
	this.mm = mm; 
	}
	// Instance fields: Time for the meal. 
	private int hh;
	private int mm;
	// Instance methods: 
	public int getHour() 
		{ return this.hh; }
	public int getMins()
		{ return this.mm; 	} }

	// Filename: MealPrices.java 

	public class MealPrices {
	public static void main(String[] args) System.out.printf(
			// (8)
			// (9)
			// (10)
			);
	{
		hh <= 23): "Illegal mm <= 59): "Illegal
						hour."; mins.";
		"Please note that %s, %02d:%02d, Meal.BREAKFAST.name(),
			Meal.BREAKFAST.getHour(), Meal.BREAKFAST.getMins(), Day.MONDAY,
			Meal.BREAKFAST.mealPrice(Day.MONDAY)
				on %s costs $%.2f.%n",
			System.out.println("Meal prices on " + Day.SATURDAY + " are as follows:"); Meal[] meals = Meal.values();
		for (Meal meal : meals)
			System.out.printf(
					"%s costs $%.2f.%n", meal, meal.mealPrice(Day.SATURDAY) // (11)
					); }
}
