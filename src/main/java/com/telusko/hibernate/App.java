package com.telusko.hibernate;

import com.telusko.hibernate.relation.service.RelationService;
import com.telusko.hibernate.service.DataBaseService;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	//anonymous object to do db operations through hibernate
        new DataBaseService().operation();
        
        new RelationService().operation();
        
    }
    
}
