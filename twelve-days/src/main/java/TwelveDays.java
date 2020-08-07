class TwelveDays {
    String[] sents = { "Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Gold Rings", "Geese-a-Laying",
	"Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing", "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming" };
	
    String[] day = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
	
    String[] count = { "a", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve" };
	
    String verse(int verseNumber) {
      	String statement = "On the " + day[verseNumber - 1] + " day of Christmas my true love gave to me: ";
		statement += count[verseNumber - 1] + " " + sents[verseNumber - 1];
		for(int i = verseNumber - 1; i >= 2; --i)
			statement += ", " + count[i - 1] + " " + sents[i - 1];

		if(verseNumber != 1)
			statement += ", and " + count[0] + " " + sents[0];
		statement += ".\n";
		return statement;
    }

    String verses(int startVerse, int endVerse) {
		String res = "";
		for(int i = startVerse; i <= endVerse; ++i){
			res = res + verse(i);
			if(i != endVerse) res += "\n";
		}
		return res;
    }
    
    String sing() {
    	return verses(1,12);
    }
}
