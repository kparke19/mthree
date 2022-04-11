package dvdlibrary.dao;

/**
 *
 * @author 17202
 */
import java.util.HashMap;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;
import java.util.List;

import dvdlibrary.dto.DVD;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public class DVDLibraryDaoFI implements DVDLibraryDao {

    HashMap<String, DVD> hmap = new HashMap<String, DVD>();
    private String ROSTER_FILE= "DVDLibrary.txt";
    
    public DVDLibraryDaoFI(String rosterTextFile){
    ROSTER_FILE = rosterTextFile;
}

    @Override
    public void addDVD(DVD dvd) {
        hmap.put(dvd.getTitle(), dvd);
    }

    @Override
    public void removeDVD(DVD dvd) {
        hmap.remove(dvd.getTitle());
    }

    @Override
    public void editDVD(DVD dvd) {
        hmap.replace(dvd.getTitle(), dvd);

    }

    @Override
    public List<DVD> listAllDVDs() {
        //list the keys

        List<DVD> list = new ArrayList<DVD>();
        for (DVD key : hmap.values()) {
            list.add(key);
        }
        return list;
    }

    @Override
    public void displayDVD(DVD dvd) {
        System.out.println(dvd);
    }

    @Override
    public DVD findDVD(String title) {
        return hmap.get(title);
    }

    @Override
    public void loadFromFile() {

        HashMap<String, DVD> loaded = new HashMap<>();

        try {

            File myObj = new File(ROSTER_FILE);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dvdField = data.split("::");

                DVD tmp = new DVD(dvdField[0], dvdField[1], dvdField[2], dvdField[3], dvdField[4], dvdField[5]);
                loaded.put(tmp.getTitle(), tmp);
                
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        hmap = loaded;
    }

    @Override
    public void saveToFile() {

        try {
            PrintWriter myWriter = new PrintWriter(new File(ROSTER_FILE));
            for (DVD dvd : hmap.values()) {
                //System.out.println(dvd.createDVDRecord());
                myWriter.write(dvd.createDVDRecord() + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
