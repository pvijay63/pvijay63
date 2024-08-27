public class Colour {

	public static void main(String[] args) {
		String str="RRRGGGBBB";
		//rgb,gbr,brg,bgr,grb,
		if(str.contains("rbg")||str.contains("rgb")||str.contains("gbr")||str.contains("brg")||str.contains("grb"))
				{
			System.out.println("Black&White");
				}
		else
		{
			System.out.println("color");
		}
		

	}

}
