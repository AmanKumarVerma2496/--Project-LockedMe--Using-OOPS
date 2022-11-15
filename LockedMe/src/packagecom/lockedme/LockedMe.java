package packagecom.lockedme;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;   
public class LockedMe {
static final String Path="C:\\Users\\HP\\Desktop\\New folder (3)\\Lockersme.com";
public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
	int choice;
	do {
		displayMenu();
		System.out.println(" Enter your choice :-");
		choice=Integer.parseInt(obj.nextLine());
			switch(choice)
			{
				case 1:getAllFiles();
				break;
				case 2:CreateFiles();
				break;
				case 3:deleteFiles();
				break;
				case 4:searchFiles();
				break;
				case 5:System.exit(0);
				break;
				default:System.out.println("Invalid Option!!!!!");
			}
		
	}
	while(choice>0);
}
public static void displayMenu()
{
	System.out.println("***************************************************************");
	System.out.println("\t Welcome to company Lockers :- LockedMe.com");
	System.out.println("\t Developer Name :- Aman Kumar Verma");
	System.out.println("***************************************************************");
	System.out.println("\t1.Display all files");
	System.out.println("\t2.Add files ");
	System.out.println("\t3.Delete the files");
	System.out.println("\t4.Search the files");
	System.out.println("\t5.exit");
	
}
 private static void searchFiles()
{
	 Scanner obj=new Scanner(System.in);
	 try 
	 {
		 String fileName;
		 System.out.println("Enter file name for search :- ");
		 fileName=obj.nextLine();
		 File f= new File(Path+"\\"+fileName);
		 if(f.exists())
		 {
			 System.out.println("File is available!");
		 }
		 else
		 {
			 System.out.println("File is not available!");
		 }
	 }
	 
	catch(Exception e)
		 {
			 System.out.println("An Error Occurred!!!!!"); 
			 e.printStackTrace();
		 }
	 }
 
 private static void deleteFiles()
{
	 Scanner obj=new Scanner(System.in);
	 try 
	 {
		 String fileName;
		 System.out.println("Enter file name to deleted :- ");
		 fileName=obj.nextLine();
		 File f= new File(Path+"\\"+fileName);
		 if(f.exists())
		 {
			 f.delete();
			 System.out.println("File is succesfully deleted!"); 
		 }
		 else
		 {
			 System.out.println("File does not created!");
		 }
	 }
	 
	catch(Exception e)
		 {
			 System.out.println("An Error Occurred!!!!!"); 
			 e.printStackTrace();
		 }
	 }
 
 private static void CreateFiles()
 { 
 	try 
 	{
 		 Scanner obj=new Scanner(System.in);
 		 String fileName;
 		 int lineCount;
 		 System.out.println("Enter the file name :- ");
 		 fileName=obj.nextLine();
 		 System.out.println("Enter how many lines to add in the files :- ");
 		 lineCount=Integer.parseInt(obj.nextLine());
 		 FileWriter fw= new FileWriter(Path+"\\"+fileName);
 		 	for(int i=1;i<=lineCount;i++)
 		 		{
 		 			System.out.println("Enter the file Content line :- ");
 		 			fw.write(obj.nextLine()+"\n");
 		 		}
 		 		System.out.println("File Created Successfully :- ");
 		 		fw.close();
 	}
 		 
 	 
 	catch(Exception e)
 		 {
 			 System.out.println("An Error Occurred!!!!!"); 
 			 e.printStackTrace();
 		 }
 	 }
 
 private static void getAllFiles()
  	{
	 	File[] listOfFiles = new File(Path).listFiles();
	 	if(listOfFiles.length==0)
	 	System.out.println("No Files exist in the directory :- ");	
	 	else
	 	{
	 		for(File file:listOfFiles)
	 		{
	 			System.out.println(file.getName());	
	 		}
	 	}
 
  	}

}
