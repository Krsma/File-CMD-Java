import java.io.File;
import java.util.*;


public  class	file_manager
{

	public void list_dir()
	{
		try
		 {
      File f = new File(".");
			File[] list = f.listFiles();
			

      for (int i = 0; i < list.length; i++)
					System.out.println(list[i].getName());
					

		} 
		catch (Exception ex)
		 {
      ex.printStackTrace();
		 }
		 

	}
	
	public File file_cd(String argument)
	{


		if (argument.equals("") )
		{
			File f = new File(".");
			String parentDirName = f.getName().toString();
			System.out.println(parentDirName);
			return f;
		}
		else if (argument.equals("..") )
		{
			File f = new File(".");
			File parentDir = f.getParentFile();
			return parentDir;

		}

		else
		{

			File f = new File(".");
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++)
			{
				if (list[i].getName().equals(argument));
				return list[i];
			}
			return f;

		}

	}

	public 

public static void main(String[] args) {
	
}
}
