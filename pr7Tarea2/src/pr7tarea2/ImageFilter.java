package pr7tarea2;
import java.io.File;
import javax.swing.filechooser.*;  

public class ImageFilter extends FileFilter {
        
    public boolean accept(File f) {         
        if (f.isDirectory()) {             
            return true;
        }         
        String filename = f.getName();
        int dot = filename.lastIndexOf('.');
        String extension = filename.substring(dot + 1);
  
        if (extension != null) {             
            if( extension.equals("tiff") ||                 
                extension.equals("tif") ||                 
                extension.equals("gif") ||                 
                extension.equals("jpeg") ||                 
                extension.equals("jpg") ||                 
                extension.equals("png")) {                     
                return true;             
            } else {                 
                return false;             
            }        
        }           
        return false;     
    }       
    public String getDescription() {         
        return "Ficheros de Imagenes";     
    } 
}