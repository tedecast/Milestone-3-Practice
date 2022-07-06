/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations.buggy;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.dao.implementations.AGoodMonsterDao;
import com.sg.testing.model.Monster;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teresa
 */
public class BadMonsterDaoATest extends AGoodMonsterDao{
    
    BadMonsterDaoA testDao;
    
    public BadMonsterDaoATest(BadMonsterDaoA dao) {
        this.testDao = dao;
    }
    

    @Test
    public void addMonster() {
//        String monsterID = "0001";
        Monster m monster = new id("0001");
        monster1.setName("Yuki");
        
    }
    
}
