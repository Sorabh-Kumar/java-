import java.util.regex.*;

class RegexExample
{
	public static void main (String args[])
	{
		System.out.println(Pattern.matches("[amn]","abcd"));//flase(not a or m or n)
		System.out.println(Pattern.matches("[amn]","a"));//true(among a or m or n)
		System.out.println(Pattern.matches("[amn]","ammmmmma"));//flase (m and a comes more than once)
	}
}