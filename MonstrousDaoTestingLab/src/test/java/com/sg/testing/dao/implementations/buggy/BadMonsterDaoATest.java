/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations.buggy;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.dao.implementations.AGoodMonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Teresa
 */
public class BadMonsterDaoATest extends AGoodMonsterDao{
    
    BadMonsterDaoA testDao;
//    
//    public BadMonsterDaoATest(BadMonsterDaoA dao) {
//        this.testDao = dao;
//    }
    
    @BeforeEach
    public void setUp() throws Exception {
        testDao = new BadMonsterDaoA();
    }

    @Test
    public void testAddGetMonster() throws Exception {
        // Create our method test inputs
        Monster monster = new Monster();
        monster.setName("Yuki");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(3);
        monster.setFavoriteFood("Mice");
        
        // Add the monster to the DAO
        testDao.addMonster(1, monster);
        
        // Get the monster from the DAO
        Monster retrievedMonster = testDao.getMonster(1);
        
        // Check the data is equal
        assertEquals(monster.getName(), 
                retrievedMonster.getName(), 
                "Checking Monster Name.");
        
        assertEquals(monster.getType(), 
                retrievedMonster.getType());
        
        assertEquals(monster.getPeopleEaten(),
                retrievedMonster.getPeopleEaten());
        
        assertEquals(monster.getFavoriteFood(),
                retrievedMonster.getFavoriteFood());   
    }
    
    @Test 
    public void testGetAllMonsters() throws Exception {
        // Create our first Monster
        Monster monster1 = new Monster();
        monster1.setName("Yuki");
        monster1.setType(MonsterType.YETI);
        monster1.setPeopleEaten(3);
        monster1.setFavoriteFood("Mice");
        
        // Create our second Monster
        Monster monster2 = new Monster();
        monster2.setName("Happy");
        monster2.setType(MonsterType.VAMPIRE);
        monster2.setPeopleEaten(6);
        monster2.setFavoriteFood("Pork Rinds");
        
        // Add both our monsters to the DAO
        testDao.addMonster(1, monster1);
        testDao.addMonster(2, monster2);
        
        // Retrieve the list of all monsters within the DAO
        List<Monster> allMonsters = testDao.getAllMonsters();
        
        // First check the general contents of the list
        assertNotNull(allMonsters);
        assertEquals(2, allMonsters.size());
        
        // Then the specifics
        assertTrue(testDao.getAllMonsters().contains(monster1));
        assertTrue(testDao.getAllMonsters().contains(monster2));
    }
    
}
