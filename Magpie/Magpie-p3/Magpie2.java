public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		

		if(statement.length() = 0)
		{
			response = "Say something, please.";
		}
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("turtle") >= 0)
			response = "Tell me more about your pet";
		}

		else (statement.indexOf("Robinette") >= 0
		{
			response = "He sounds like a pretty dank teacher";
		}
		return response;
	}
	
	/**
* Take a statement with "I want to <something>." and transform it into
* "What would it mean to <something>?"
* @param statement the user statement, assumed to contain "I want to"
* @return the transformed statement
*/
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement,"I want to ");
		String restOfStatement = statement.substring(psn + 1);
		return "What would it mean to" + restOfStatement;
  /**
   * trim the statement
   * variable lastChar = last character in statement
   * if lastChar is a period...
   *        remove the last character from statement
   *
   * Set new int psn to the result from...
   *        findKeyword() method @param statement, goal is "I want to "
   * Set new String restOfStatement to the rest of statement after the
   * "I want to ".
   * /
   * return "What would it mean to" + restOfStatement; **/
	}


/**
* Take a statement with "you <something> me" and transform it into
* "What makes you think that I <something> you?"
* @param statement the user statement, assumed to contain "you" followed by "me"
* @return the transformed statement
*/
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I " + restOfStatement + "you?"
  /**
   * trim the statement
   * Set new String lastChar to the last character in statement
   * if lastChar is a period...
   *        remove the period
   *
   * Set new int psnOfYou to the result of findKeyword
   *        @param statement and "you"
   * Set new int psnOfMe to the result of findKeyword
   *      @param statement, "me", and psnOfYou + 3
   * Set new String restOfStatement to the rest of statement after "You" + 3,
   * and before "me".
   *
   * return "What makes you think that I " + restOfStatement + "you?"
   * */
	}
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfI = findKeyword (statement, "I", 0);
		int psnOfYou = findKeyword (statement, "You", psnOfI + 3);
		return "Why do you" + restOfStatement + "me?"
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		int psn = int.indexof(goal,startPos + 1);
		if(psn >= 0)
		{
			if(psn > 1)
			{
				before = int.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
					{
						after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
					}

			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}

		return -1;
				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

				//=====> code here
	

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
