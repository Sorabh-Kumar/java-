import java.util.regex.*;

class RegexExample4
{
	public static void main (String args[])
	{
		System.out.println("?quantifier....")

		System.out.println(Pattern.matches("[amn]","aaa"));//flase(not a or m or n)
		System.out.println(Pattern.matches("[amn]","a"));//true(among a or m or n)
		System.out.println(Pattern.matches("[amn]","ammmmmma"));//flase (m and a comes more than once)
		System.out.println(Pattern.matches("[amn]","aazzta"));//flase (a comes more then one time)
		System.out.println(Pattern.matches("[amn]","am"));//flase (m and a comes more than once)


		System.out.println("+quantifer....");
		System.out.println(Pattern.matches("[amn]+","a"));//true (m and a or n are one or more than once)
		System.out.println(Pattern.matches("[amn]+","aaa"));//true (a comes more than once)
		System.out.println(Pattern.matches("[amn]+","aaaammm"));//true (m and a comes more than once)
		System.out.println(Pattern.matches("[amn]+","aazzta"));//flase (z and t are not matching pattern)

		System.out.println("*quantifier...");
		System.out.println(Pattern.matches("[amn]*","ammmns"));
	}
}