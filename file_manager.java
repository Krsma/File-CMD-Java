import java.io.File;
import java.util.*;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;


public  class	file_manager
{

	public static void list_dir()
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
	
	public static File file_cd(String argument)
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
				if (list[i].getName().equals(argument))
				{
					return list[i];
				}
				
			}
			return f;

		}

	}

	private static void file_copy(String file_name1, String file_name2 ) throws IOException 
	{
		File source = new File(file_name1);
		File dest = new File(file_name2);

    InputStream is = null;
    OutputStream os = null;
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
				while ((length = is.read(buffer)) > 0) 
				{
            os.write(buffer, 0, length);
        }
     
        is.close();
        os.close();
    
}

public static void main(String[] args)
  {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		String[] parts = line.split(" ");
		if (parts[0].equals("exit"))
		{
			System.exit(0);
		}
		else if (parts[0].equals("cd"))
		{
			File f = file_cd(parts[1]);
			System.out.println(f.getName().toString());
		}
		else if (parts[0].equals("dir"))
		{
			list_dir();
		}
		else if (parts[0].equals("copy"))
		{
			file_copy(parts[1], parts[2]);
		}

 
	
	}
}
