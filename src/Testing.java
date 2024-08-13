import java.util.ArrayList;
import java.util.List;

public class Testing
{
	public static void main(String[] args)
	{
		String[] strs = {"flower", "flow", "flight"};
		String res = "";

		for (int i = 0; i < strs.length; i++)
		{
			for (int j = 0; j < strs.length - 1; j++)
			{
				if (strs[j].length() < strs[j + 1].length())
				{
					String temp = strs[j];
					strs[j] = strs[j + 1];
					strs[j + 1] = temp;
				}
			}
		}
		String smallestString = strs[strs.length - 1];

		int l = 0;
		for (int j = 0; j < smallestString.length(); j++)
		{
			char tempChar = 0;
			char c = strs[0].charAt(l);
			for (int i = 0; i < strs.length; i++)
			{
				tempChar = c;
				if (c != strs[i].charAt(l))
				{
					tempChar = 0;
				}
			}
			res = res + tempChar;
			l++;
		}
		System.out.println(res);

	}

}
