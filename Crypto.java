import java.util.List;
import java.util.ArrayList;

public class Crypto {
	public Crypto (String input) {
		this.cString = input;
	}
	
	public String getNormalizedPlaintext() {
		return cString.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	}
	
	public int getSquareSize() {
		
		return (int) Math.ceil(Math.sqrt(getNormalizedPlaintext().length()));
	}
	
	public List<String> getPlaintextSegments() {
		List<String> rList = new ArrayList<String>();
		String gnpt = getNormalizedPlaintext();
		int gss = getSquareSize();
		
		for(int x=0; x<gnpt.length(); x+=gss) {
			String curSeg = "";
			for(int y=x;y<(x+gss) && y<(gnpt.length()) ;y++) {
				curSeg += gnpt.charAt(y);
			}
			rList.add(curSeg);
		}
		return rList;
	}
	
	public String getCipherText() {
		String rString = "";
		
		for (String cur : CipherText()) {
			rString = rString.concat(cur);
		}
		
		return rString;
	}
	
	public String getNormalizedCipherText() {
		String rString = "";
		for (String cur : CipherText()) {
			rString = rString.concat(cur);
			rString+=" ";
		}
		return rString.trim();
	}
	
	private List<String> CipherText() {
		List<String> rList = new ArrayList<String>();
		String gnpt = getNormalizedPlaintext();
		int gss = getSquareSize();
		
		for(int x=0; x<gss; x++) {
			String curSeg = "";
			for(int y=x;y<gnpt.length();y+=gss) {
				curSeg += gnpt.charAt(y);
			}
			rList.add(curSeg);
		}
		return rList;
	}
}
