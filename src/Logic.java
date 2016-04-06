import java.util.ArrayList;

public class Logic {
	
	//Color Storage
	protected static int[] base0;
	protected static int[] base1;
	protected static int steps;
	protected static int strength = 100;
	
	public static ArrayList<_Composite> generate(String base, String in, int stepsIn) {
		ArrayList<_Composite> generated = new ArrayList<_Composite>();
		
		base0 = colorToInts(base);
		base1 = colorToInts(in);
		steps = stepsIn;
		
		int []clrs0 = intervals(base0[0],base1[0]); //r
		int []clrs1 = intervals(base0[1],base1[1]); //g
		int []clrs2 = intervals(base0[2],base1[2]); //b
		
		for (int i = 0; i < steps; i++){
			String add = toHex(clrs0[i],2) + toHex(clrs1[i],2) + toHex(clrs2[i],2);
			generated.add(new Color(add,steps));
		}		
		return generated;
	}
	
	public static boolean verifyHex(String in){
		if (in.length()!=6 && in.length()!=3) return false;
		int len = in.length();
		in = in.toLowerCase();
		for (int i = 0; i < len; i++){
			char store = in.charAt(i);
			if ( (store>='0' && store<='9') || (store>='a' && store<='f')){
			} else return false;
		}
		return true;
	}
	
	private static int[] colorToInts(String hex){
		int [] out = new int[3];
		for (int i = 0; i < 3; i++){
			out[i] = toInt(hex.substring(2*i, 2*(i+1)));
		}
		return out;
	}

	private static int[] intervals(int in, int min){
		int[] out = new int[steps];
		int delta = in-min;
		for (int i = 0; i < steps; i++) out[i] = (int) (in - ((delta*strength/100.0)/(steps-1))*i);
		return out;
	}

	private static int toInt(String hex){
		return Integer.parseInt(hex, 16);  
	}
	
	private static String toHex(int decimal, int minLength){
		String out = Integer.toHexString(decimal);
		while (out.length()<minLength){
			out = "0" + out;
		}
		return out;
	}


}
