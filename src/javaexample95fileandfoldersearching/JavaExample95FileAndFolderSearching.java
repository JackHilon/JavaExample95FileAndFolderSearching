
package javaexample95fileandfoldersearching;

import java.io.*;

public class JavaExample95FileAndFolderSearching {

    
    public static void main(String[] args) {
        
        PrintWriter pw = new PrintWriter(System.out, true);
        
        try{
            
            // represent a folder
            File myFolder = new File("folder1");
            
            // or alternatively
            // C:\Users\marka\Documents\NetBeansProjects\JavaExample95FileAndFolderSearching
            File hisFolder = new File("/." + File.separatorChar + "Users" + 
                    File.separatorChar + "marka" + File.separatorChar + 
                    "Documents" + File.separatorChar + "NetBeansProjects" + 
                    File.separatorChar + "JavaExample95FileAndFolderSearching" + 
                    File.separatorChar + "hisFolder");
            
            // I write this line. To get the results
            myFolder.mkdir();
            hisFolder.mkdir();
            
            // search for the folder
            if(myFolder.exists() && myFolder.isDirectory())
            {
                pw.println("Folder: " + myFolder.getName());
                pw.println("Path:\n" + myFolder.getCanonicalPath());
                String[] files = myFolder.list();
                // or alternatively
                File[] files1 = myFolder.listFiles();
                
                pw.print("Files in the folder (1): ");
                for (int i = 0; i < files.length; i++) {
                    pw.print(files[i] + " ");
                } // end-for
                pw.println();
                
                pw.print("Files in the folder (2): ");
                for (int i = 0; i < files1.length; i++) {
                    pw.print(files1[i].getName() + " ");
                } // end-for
                pw.println();
            } // end-if
            
            // representing a file
            File myFile1 = new File("folder1" + File.separatorChar + "myFile1.txt");
            
            // I write this line. To get the result
            myFile1.createNewFile();
            
            // or alternatively
            File myFile2 = new File(myFolder, "myFile2.txt");
            
            // I write this line. To get the result
            myFile2.createNewFile();
            
            // search for the file
            if(myFile1.isFile() && myFile1.exists())
            {
                pw.println("\nFile1: " + myFile1.getName());
                pw.println("Path:\n" + myFile1.getCanonicalPath());
                
                /*
                myFile1.getParent()
                --------------------
                Returns the pathname string of this abstract pathname's parent, 
                or null if this pathname does not name a parent directory.
                
                The parent of an abstract pathname consists of the pathname's prefix, 
                if any, and each name in the pathname's name sequence except for the last. 
                If the name sequence is empty then the pathname does not name a 
                parent directory.
                */
                pw.println("Is in: " + myFile1.getParent());
                
                pw.println("File can be read: " + myFile1.canRead());
                pw.println("File can be written: " + myFile1.canWrite());
                
                /*
                myFile1.lastModified()
                --------------------------
                Returns the time that the file denoted by this abstract pathname 
                was last modified.
                */
                pw.println("Last modified (long): " + myFile1.lastModified());
                pw.println("Last modified (DateTime): " + Helper.ConvertTime(myFile1.lastModified()));
            } // end-if
            
        } // end-try
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
