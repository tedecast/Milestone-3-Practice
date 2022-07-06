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
import java.io.FileWriter;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Teresa
 */
public class BadMonsterDaoATest{
    
    BadMonsterDaoA testDao;
    
    public BadMonsterDaoATest() {
    }
    
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
        assertEquals(monster.getName(), retrievedMonster.getName());
        
        assertEquals(monster.getType(), retrievedMonster.getType());
        
        assertEquals(monster.getPeopleEaten(), retrievedMonster.getPeopleEaten());
        
        assertEquals(monster.getFavoriteFood(),retrievedMonster.getFavoriteFood());   
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
        testDao.addMonster(0, monster1);
        testDao.addMonster(1, monster2);
        
        // Retrieve the list of all monsters within the DAO
        List<Monster> allMonsters = testDao.getAllMonsters();
        
        // First check the general contents of the list
        assertNotNull(allMonsters);
        assertEquals(2, allMonsters.size());
        
        // Then the specifics
        assertTrue(testDao.getAllMonsters().contains(monster1));
        assertTrue(testDao.getAllMonsters().contains(monster2));
    }
    
    
    @Test 
    public void testUpdateMonsters() throws Exception {
        // create our method test inputs
        Monster monster = new Monster();
        monster.setName("Yuki");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(3);
        monster.setFavoriteFood("Mice");
        
        // Add monster to DAO
        testDao.addMonster(1, monster);
        
        // Get the monster from the DAO
        Monster retrievedMonster = testDao.getMonster(1);
        
        // Check the data is equal
        assertEquals(monster.getName(), 
                retrievedMonster.getName());
        
        assertEquals(monster.getType(), 
                retrievedMonster.getType());
        
        assertEquals(monster.getPeopleEaten(),
                retrievedMonster.getPeopleEaten());
        
        assertEquals(monster.getFavoriteFood(),
                retrievedMonster.getFavoriteFood());  
        
        // Replace / Update existing data
        monster.setName("Bubby");
        testDao.updateMonster(3, monster);     
    }
    
    @Test 
    public void testRemoveMonster() throws Exception {
        // Create two new Monsters
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

        // Add both to the DAO
        testDao.addMonster(1, monster1);
        testDao.addMonster(2, monster2);
        
        // remove the first Monster - Yuki
        Monster removedMonster = testDao.removeMonster(1);
        
        // Check that the correct object was removed
        assertEquals(removedMonster, monster1);
        
        // get all Monsters
        List<Monster> allMonsters = testDao.getAllMonsters();
        
        // First check the general contents of the list 
        assertNotNull(allMonsters); // Should not be null
        assertEquals(1, allMonsters.size()); // Should only have 1 monster
        
        // Then the specifics 
        assertFalse(allMonsters.contains(monster1)); // should NOT contain Yuki
        assertTrue (allMonsters.contains(monster2)); // 
        
        // remove the second Monster
        removedMonster = testDao.removeMonster(2);
        // Check that the correct obejct was removed
        assertEquals(removedMonster, monster2); // should remove Happy
        
        // Get all the monsters
        allMonsters = testDao.getAllMonsters();
        
        // Then heck that the contents of the list is empty
        assertTrue(allMonsters.isEmpty());
        
        // Try to 'get' both monsters by id number, they should be null!
        Monster retrievedMonster = testDao.getMonster(1);
        assertNull(retrievedMonster);
        
        retrievedMonster = testDao.getMonster(2);
        assertNull(retrievedMonster);
        
    }
//    
//    @org.junit.jupiter.api.Test
//    public void testBadMonstersA() {
//    }
}
