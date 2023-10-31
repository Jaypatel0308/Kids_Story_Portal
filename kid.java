import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.io.*;

class kid
{
	void pattern()
	{
		System.out.println();
		System.out.println();
		System.out.println("		*   *    *    * * *     * * * *       * * * *    * * * * *    * * * *    * * *     *     *    ");
		System.out.println("		*  *     *    *    *    *             *              *        *     *    *    *     *   *     ");
		System.out.println("		* *      *    *    *    * * * *       * * * *        *        *     *    * * *        *       ");
		System.out.println("		*  *     *    *    *          *             *        *        *     *    * *          *       ");
		System.out.println("		*   *    *    * * *     * * * *       * * * *        *        * * * *    *  *         *       ");
		System.out.println();
		System.out.println();
	} //Pattern of kid story for display
	void p1()
	{
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
		System.out.println("				* * * *    * * * * *    * * * *    * * *     *     *    ");
		System.out.println("				*              *        *     *    *    *     *   *     ");
		System.out.println("				* * * *        *        *     *    * * *        *       ");
		System.out.println("				      *        *        *     *    * *          *       ");
		System.out.println("				* * * *        *        * * * *    *  *         *       ");
		System.out.println();
	} //Pattern story for display
	void p2()
	{
		System.out.println();
		System.out.println();
		System.out.println("		# # #         #        #          #    #     #    # # #     # # #     # # # #    #     #    # # # #    ");
		System.out.println("		#    #       # #       #          #    # #   #    #    #    #    #    #     #    # # # #    #          ");
		System.out.println("		# # #       #   #      #          #    #  #  #    #    #    # # #     #     #    #  #  #    # # #      ");
		System.out.println("		#          # # # #     #          #    #   # #    #    #    # #       #     #    #     #    #          ");
		System.out.println("		#         #       #    # # # #    #    #     #    # # #     #   #     # # # #    #     #    # # # #    ");
		System.out.println();
		System.out.println();
	} //Pattern palindrome for display
	void p3()
	{
		System.out.println();
		System.out.println();
		System.out.println("				@     @    @ @ @ @    @ @ @     @ @ @     @ @ @ @    ");
		System.out.println("				@     @    @     @    @    @    @    @    @          ");
		System.out.println("				@  @  @    @     @    @ @ @     @    @    @ @ @ @    ");
		System.out.println("				@ @ @ @    @     @    @ @       @    @          @    ");
		System.out.println("				@     @    @ @ @ @    @  @      @ @ @     @ @ @ @    ");
		System.out.println();
		System.out.println();
	} //Pattern words for display
	void p4()
	{
		System.out.println();
		System.out.println();
		System.out.println("      $        $     $    $ $ $ $ $    $             $ $ $ $    $          $ $ $ $    $     $    $ $ $ $    $ $ $     ");
		System.out.println("     $ $       $ $   $        $        $             $          $          $     $    $ $   $    $          $    $    ");
		System.out.println("    $   $      $  $  $        $        $    $$$$$    $          $          $     $    $  $  $    $ $ $      $    $    ");
		System.out.println("   $ $ $ $     $   $ $        $        $             $          $          $     $    $   $ $    $          $    $    ");
		System.out.println("  $       $    $     $        $        $             $ $ $ $    $ $ $ $    $ $ $ $    $     $    $ $ $ $    $ $ $     ");
		System.out.println();
		System.out.println();
	} //Pattern anti-cloned for display
	void submenu(String[] t)
	{
		int w;
			System.out.println("\n\nEnter 1 for display of story in ascending order");
			System.out.println("Enter 2 for display of story in descending order");
			System.out.print("\nEnter the choice : "); 
			Scanner sc=new Scanner(System.in);
			w=sc.nextInt(); //Taking input for ascending or descending
			System.out.println();
			switch(w)
			{
				case 1: Arrays.sort(t); //sorts data in ascending order
						for(String x:t)
						{
							if(x==null)
							break; //for space elemnts
							System.out.print(x+" "); //Printing the words
						}
						System.out.println();
					break;
					
				case 2: Arrays.sort(t,Collections.reverseOrder()); //sorts data in descending order
						for(String x:t)
						{
							if(x==null)
							break; //for space elements
							System.out.print(x+" "); //printig the words
						}
						System.out.println();
					break;
				default: System.out.println("Invalid choice! Please enter again");
						submenu(t); //calling submenu
			}
	} //method for displaying in ascending or descending order
	void edit(File g)
	{
		p4();
		String data=new String();
		String[] mydata=new String[1000]; //String array to store unique data
		System.out.println("\n\nThe story without repeated words are : \n\n");
		try{
			Scanner scan=new Scanner(new FileReader(g));
			while(scan.hasNextLine())
			{
				data=data+scan.nextLine(); //taking data of file in string
			}
			String[] ar=data.split("[\\s+.?!,\"\']"); //spliting the string into string array
			int i,count=0;
			for(String x:ar)
			{
				if(x.length()<1)
					continue; //space elements
				else
					for(i=0;i<count;i++)
						if(x.equalsIgnoreCase(mydata[i]))
							break; //comparing it with other words of array
					if(i==count)
						mydata[count++]=x; //storing the word in unique array
			} //for loop to find array of unique words
			for(String x:mydata)
			{
				if(x==null)
					break;
				System.out.print(x+" "); //printing the non cloned story
			}
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			String[] t=new String[count]; //String array
			for(i=0;i<count;i++)
			{
				t[i]=mydata[i];
			} //copying the array
			p3();
			System.out.println("\n\nThe total number of words are "+count); //displaying the count of words
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
			submenu(t);  //calling submenu
			System.out.println();
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println();
			p2();
			System.out.println("\n\nThe palindrome words in story are : ");
			System.out.println();
			for(String x:t)
			{
				String h=""; //taking a null string to store reverse of the word
				if(x.length()>1)
				{
					int n=x.length();
					if(x==null)
						break;
					for(int k=n-1;k>=0;k--)
					{
						h=h+x.charAt(k);
					} //printing the word reverse 
					if(x.equalsIgnoreCase(h))
						System.out.print(x+", "); //comparing the word with its reverse and if equal then print it
				}
			} //to check palindrome words
			System.out.println();
			System.out.println();
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		}catch(FileNotFoundException e){
				System.out.println(e);
		}
	} //method to do changes in story
	void open(File f)
	{
		try{
			//File file=new File(fname);
			Scanner scan=new Scanner(new FileReader(f));
			while(scan.hasNextLine())
			{
				System.out.println(scan.nextLine());
			} //reads the file and prints it
			}catch(FileNotFoundException e){
				System.out.println(e);
		}
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	void mainmenu()
	{
		pattern();
		String ch;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("\n\nThe Story titles are ");
			System.out.println("\n1 : Monkey Offers A Solution");
			System.out.println("2 : The Mighty Meeting");
			System.out.println("3 : Five Rats And a Funny Top Hat");
			System.out.println("4 : The Spotty Grey Kitten");
			System.out.println("5 : Parable Of The Pencil");
			System.out.println("6 : Don't Judge a Book By Its Cover");
			System.out.println("To Exit enter "+"exit");
			System.out.print("\nEnter the name of story : ");
			ch=sc.nextLine(); //taking input as story name from the user
			
			if("monkey offers a solution".compareToIgnoreCase(ch)==0)
			{
				p1();
				File afile=new File("a.txt"); //making file object
				open(afile); //printing the story
				edit(afile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("the mighty meeting".compareToIgnoreCase(ch)==0)
			{
				p1();
				File bfile=new File("b.txt"); //making file object
				open(bfile); //printing the story
				System.out.println();
				edit(bfile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("five rats and a funny top hat".compareToIgnoreCase(ch)==0)
			{
				p1();
				File cfile=new File("c.txt"); //making file object
				open(cfile); //printing the story
				edit(cfile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("the spotty grey kitten".compareToIgnoreCase(ch)==0)
			{
				p1();
				File dfile=new File("d.txt"); //making file object
				open(dfile); //printing the story
				edit(dfile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("parable of the pencil".compareToIgnoreCase(ch)==0)
			{
				p1();
				File efile=new File("e.txt"); //making file object
				open(efile); //printing the story
				edit(efile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("don't judge a book by its cover".compareToIgnoreCase(ch)==0)
			{
				p1();
				File ffile=new File("f.txt"); //making file object
				open(ffile); //printing the story
				edit(ffile); //doing different functions on the story
				mainmenu(); //calling mainmenu
			}
			else if("exit".compareToIgnoreCase(ch)==0)
			{
				System.exit(0); //exit the program
			}
			else
			{
				System.out.println("\nInvalid Input. Enter the name of story again"); 
				mainmenu(); //calling mainmenu
			}
		}while(ch.compareToIgnoreCase("Exit")==1);
	} //method of main menu
	public static void main(String args[])
	{
		int r=0;
		
		kid k=new kid();
		k.mainmenu(); //calling mainmenu
		
	}
}