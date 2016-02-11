public class RnaTranscription {
	private static final String DNA = "GCTA";
	private static final String RNA = "CGAU";
	
	public static String ofDna(String convStr) {
		String rStr = "";
		for(int i=0;i<convStr.length();i++) {
			rStr += convNuc(convStr.charAt(i));
		}
		return rStr;
	}
	
	private static char convNuc(char nuc) {
		return RNA.charAt(DNA.indexOf(nuc));
	}
}
