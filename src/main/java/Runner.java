import com.codeclan.example.db.DBHelper;
import com.codeclan.example.models.Folder;
import com.codeclan.example.models.File;




public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder folder3 = new Folder("Folder3");
        Folder folder4 = new Folder("Folder4");
        Folder folder5 = new Folder("Folder5");
        DBHelper.save(folder1);
        DBHelper.save(folder2);
        DBHelper.save(folder3);
        DBHelper.save(folder4);
        DBHelper.save(folder5);

        File file1 = new File("File1", "txt", 10, folder1);
        File file2 = new File("File2", "txt", 100, folder1);
        File file3 = new File("File3", "txt", 25, folder2);
        File file4 = new File("File4", "txt", 6000, folder3);
        File file5 = new File("File5", "txt", 255, folder4);
        File file6 = new File("File6", "txt", 8721, folder5);
        File file7 = new File("File7", "txt", 169, folder3);
        File file8 = new File("File8", "txt", 1, folder2);
        File file9 = new File("File9", "txt", 9962, folder1);
        DBHelper.save(file1);
        DBHelper.save(file2);
        DBHelper.save(file3);
        DBHelper.save(file4);
        DBHelper.save(file5);
        DBHelper.save(file6);
        DBHelper.save(file7);
        DBHelper.save(file8);
        DBHelper.save(file9);
    }
}
