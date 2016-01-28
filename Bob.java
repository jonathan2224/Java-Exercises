public class Bob {
	public String hey(String userString) {
        userString = userString.trim();
        String userStringCap = userString.toUpperCase();
        String userStringLow = userString.toLowerCase();
        
        if (userString.equals(""))
            return "Fine. Be that way!";
        if (!userStringLow.equals(userStringCap) && userStringCap.equals(userString))
            return "Whoa, chill out!";
        if (userString.endsWith("?"))
            return "Sure.";
        return "Whatever.";
    }
}
