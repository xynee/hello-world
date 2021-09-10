public class VariableDefinitions
{
	public static void main (String[]args)
	{
		//initial declaration of numPeople variable
			byte numPeople = 3;
	
		//initial declaration of priceItem variable
			double priceItem = 32.32;
		
		//initial declaration of numClass variable
			int numClass = 207;

		//initial declaration of priceDinner variable
			float priceDinner = 30.0F;

		System.out.println("The numPeople variable has a value of " + numPeople);
		System.out.println("The priceItem variable has a value of " + priceItem);
		System.out.println("The numClass variable has a value of " + numClass);
		System.out.println("The priceDinner variable has a value of " + priceDinner);

		//modified value of numPeople variable
			numPeople = 6;

		//modified value of priceItem variable
			priceItem = 40.43;

		//modified value of numPeople variable
			numClass = 307;

		//modified value of priceDinner variable
			priceDinner = 40.0F;

		System.out.println("The numPeople variable now has a value of " + numPeople);
		System.out.println("The priceItem variable now has a value of " + priceItem);
		System.out.println("The numClass variable now has a value of " + numClass);
		System.out.println("The priceDinner variable now has a value of " + priceDinner);

		//initial declaration of numPets variable
			final byte numPets = 4;

		//initial declaration of priceTotal variable
			final double priceTotal = 90.90;

		//initial declaration of count variable
			final int count = 42;

		//initial declaration of bigNum variable
			final long bigNum = 19887738629L;

		System.out.println("The numPets variable has a value of " + numPets);
		System.out.println("The priceTotal variable has a value of " + priceTotal);
		System.out.println("The count variable has a value of " + count);
		System.out.println("The bigNum variable has a value of " + bigNum);

		//modified value of numPets
		
			//numPets = 5;
		//System.out.println("The numPets variable now has a value of " + numPets);

	}

}
