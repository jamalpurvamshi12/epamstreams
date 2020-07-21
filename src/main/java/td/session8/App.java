package td.session8;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RemoveChar c=new RemoveChar();
        String out=c.removeAcharacter("AABCD");
		System.out.println(out);
		 String out1=c.removeAcharacter("AAACD");
		 System.out.println(out1);
		 String out11=c.removeAcharacter("AABCAAAD");
		 System.out.println(out11);
		 String out111=c.removeAcharacter("AABAAAA");
		 System.out.println(out111);
		 String out1111=c.removeAcharacter("AAAAAB");
		 System.out.println(out1111);
		 String out111111=c.removeAcharacter("AABCD");
		 System.out.println(out111111);
		 
    }
}
