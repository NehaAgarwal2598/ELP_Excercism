class TwelveDays {
    	String[] sents = { "Partridge in a Pear Tree", "Turtle Doves", "French Hens", 	"Calling Birds", "Gold Rings", "Geese-a-Laying",
	"Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing", "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};
    	String[] day = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth" };
	String verse(int verseNumber) 
	{
		int i;
		if(verseNumber==1)
			return  "On the "+ days[0]+ " day of Christmas my true love gave to me: " +things[0]+".\n";

		String statement="On the "+ days[verseNumber-1]+ " day of Christmas my true love gave to me: ";

		for(i = verseNumber-1; i > 0; i--)
			statement+= things[i]+", ";

		statement+= "and "+things[0]+".\n";
		return statement;
    	}

    String verses(int startVerse, int endVerse) 
    {
        int i;
	String lyrics="";
	for(i = startVerse; i < endVerse; i++)
		lyrics+= verse(i)+ "\n";

	lyrics+= verse(endVerse);
	return lyrics;
    }

    String sing() {
        return verses(1,12);
     }
}

