import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.print.Doc;

//import org.apache.batik.ext.awt.image.rendered.TileBlock;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Document docArray[] = new Document[4];
        for(int i =0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.next();
            String folderName = sc.next();
            int pages = sc.nextInt();
            docArray[i] = new Document(id,title,folderName,pages);
        }
        Document result[] = docsWithOddPages(docArray);
        for(Document doc: result){
            System.out.println(doc.getId()+" "+doc.getTitle()+" "+doc.getFolderName()+" "+doc.getPages());
        i++;
        }
    }
    public static Document[] docsWithOddPages(Document docArray[]){
        List<Document> docs = new LinkedList<>();
        int i = 0;
        for(Document doc: docArray){
            if(doc.getPages() % 2 != 0){
                docs.add(doc);
            }
        }
        docs.sort((a,b)->Integer.compare(a.getId(),b.getId()));
        return docs.toArray(new Document[0]);
    }
}
class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    Document(int id, String title, String folderName, int pages){
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setFolderName(String folderName){
        this.folderName = folderName;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getFolderName(){
        return folderName;
    }
    public int getPages(){
        return pages;
    }
}
