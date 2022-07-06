/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao;

import com.sg.testing.dao.implementations.AGoodMonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Teresa
 */
public class MonsterDaoTest {
    
    MonsterDao testDao;

    public MonsterDaoTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        testDao = new AGoodMonsterDao();
    }
    
    @Test
    public void testAddGetMonster() throws Exception {
        
        Monster monster = new Monster();
        monster.setName("Fluffy");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(5);
        monster.setFavoriteFood("Lima Beans");

        testDao.addMonster(1, monster);

        Monster gotMonster = testDao.getMonster(1);

        assertEquals(monster.getName(), gotMonster.getName());
        assertEquals(monster.getType(), gotMonster.getType());
        assertEquals(monster.getPeopleEaten(), gotMonster.getPeopleEaten());
        assertEquals(monster.getFavoriteFood(), gotMonster.getFavoriteFood());
    }

    @Test
    public void testGetAllMonsters() throws Exception {
        Monster monster = new Monster();
        monster.setName("Fluffy");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(5);
        monster.setFavoriteFood("Lima Beans");

        testDao.addMonster(1, monster);

        Monster secMonster = new Monster();
        monster.setName("Max");
        monster.setType(MonsterType.WEREWOLF);
        monster.setPeopleEaten(8);
        monster.setFavoriteFood("Brussel Sprouts");

        testDao.addMonster(2, secMonster);

        List<Monster> allMonsters = testDao.getAllMonsters();

        assertNotNull(allMonsters);
        assertEquals(2, allMonsters.size());

        assertTrue(testDao.getAllMonsters().contains(monster));
        assertTrue(testDao.getAllMonsters().contains(secMonster));
    }
    
    @Test
    public void testRemoveMonster() throws Exception {
        Monster monster = new Monster();
        monster.setName("Fluffy");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(5);
        monster.setFavoriteFood("Lima Beans");

        testDao.addMonster(1, monster);

        Monster secMonster = new Monster();
        monster.setName("Max");
        monster.setType(MonsterType.WEREWOLF);
        monster.setPeopleEaten(8);
        monster.setFavoriteFood("Brussel Sprouts");

        testDao.addMonster(2, secMonster);

        Monster removedMonster = testDao.removeMonster(1);
        assertEquals(removedMonster, monster);

        List<Monster> allMonsters = testDao.getAllMonsters();

        assertNotNull(allMonsters);
        assertEquals(1, allMonsters.size());

        removedMonster = testDao.removeMonster(2);

        assertEquals(removedMonster, secMonster);

        allMonsters = testDao.getAllMonsters();

        assertTrue(allMonsters.isEmpty());

        Monster gotMonster = testDao.getMonster(1);
        assertNull(gotMonster);

        gotMonster = testDao.getMonster(2);
        assertNull(gotMonster);
    }

    @Test
    public void testEditMonster() throws Exception {
        Monster monster = new Monster();
        monster.setName("Fluffy");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(5);
        monster.setFavoriteFood("Lima Beans");

        String expName = "Fluffy";

        testDao.addMonster(1, monster);
        List<Monster> allMonsters = testDao.getAllMonsters();
        assertEquals(expName, allMonsters.get(0).getName());

        monster.setName("Scruffy");
        testDao.updateMonster(1, monster);

        String expNameChange = ("Scruffy");

        List<Monster> secMonsters = testDao.getAllMonsters();
        assertEquals(expNameChange, secMonsters.get(0).getName());
    }   
}   

