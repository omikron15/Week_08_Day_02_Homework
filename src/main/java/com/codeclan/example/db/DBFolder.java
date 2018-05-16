package com.codeclan.example.db;

import com.codeclan.example.models.File;
import com.codeclan.example.models.Folder;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import java.util.List;

public class DBFolder {

    private static Session session;

    public static List<File> getFilesInFolder(Folder folder){
        session = db.HibernateUtil.getSessionFactory().openSession();
        List<File> results = null;

        try {
            Criteria criteria = session.createCriteria(File.class);
//            dont understand this next line ? why dont we use the folder_id field in files and use folder.getid
            criteria.add(Restrictions.eq("folder", folder));
            results = criteria.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }

        return results;
    }




}
