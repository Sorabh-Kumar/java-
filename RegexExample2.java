import java.util.regex.*;

class RegexExample2
{
	public static void main (strting args[])
	{
		System.out.println(Pattern.match(".s","as"));//true(2nd char is s)
		System.out.println(Pattern.match(".s","mk"));//false(2nd char is not s)
		System.out.println(Pattern.match(".s","mst"));//flase (has more than two char)
		System.out.println(Pattern.match(".s","amms"));//false(Has more than two char)
		System.out.println(Pattern.match("..s","mas"));//true(3rd char is s)
	}
}