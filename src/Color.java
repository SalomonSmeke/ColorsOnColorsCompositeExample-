import java.util.ArrayList;
import java.util.UnknownFormatConversionException;

public class Color extends _CompositeSkeleton implements _Composite{
	
	String base = "";
	int steps = 2;
	
	public Color(){}
	
	public Color(String hex, int steps){
		setBase(hex);
		setSteps(steps);
	}
	
	public void setSteps(int steps){
		if (steps>=2 && steps<256){
			this.steps = steps;
			return;
		}
		throw new UnknownFormatConversionException("Steps out of range.");
	}
	
	public ArrayList<_Composite> getChildren(){
		return children;
	}
	
	public void setBase(String hex){
		if (Logic.verifyHex(hex)) base = hex.toLowerCase(); else {
			throw new UnknownFormatConversionException("Hex value fed not a valid color.");
		}
		if (base.length()==3){
			String out = "";
			for (int i = 0; i < 3; i++){
				out = out + base.charAt(i) + base.charAt(i);
			}
			base = out;
		}
	}
	
	@Override
	public void generateChildren(String in) {
		if (!Logic.verifyHex(in)) throw new UnknownFormatConversionException("Hex value fed not a valid color."); else {
			if (in.length()==3){
				String out = "";
				for (int i = 0; i < 3; i++){
					out = out + in.charAt(i) + in.charAt(i);
				}
				in = out;
			}
			children = Logic.generate(base, in, steps);
		}
	}

	public _Composite dumpParent(_Composite parent) {
		parent = this;
		System.gc();
		return this;
	}
	
	

}
