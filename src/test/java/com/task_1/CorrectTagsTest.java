package com.task_1;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CorrectTagsTest {
    private CorrectTags correctTags;
    static Logger logger = Logger.getLogger(CorrectTagsTest.class);

    @Before
    public void initialize(){
        correctTags = new CorrectTags();
    }

    @Test
    public void sameCorrectTagsTest(){
        String expression = "g{fsdfg}s";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertTrue(b);
        logger.info("1-st test");
    }

    @Test
    public void differentCorrectTagsTest(){
        String expression = "{{[cc(c)ggg]}ssss}";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertTrue(b);
        logger.info("2-nd test");
    }

    @Test
    public void sameUnCorrectTagsTest(){
        String expression = "{g{fsdfg}s";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertFalse(b);
        logger.info("3-d test");
    }

    @Test
    public void differentUnCorrectTagsTest(){
        String expression = "{{[cc(c)ggg]}ssss}{";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertFalse(b);
        logger.info("4-th test");
    }

    @Test
    public void differentUnCorrectTagsStartWithCloseTagTest(){
        String expression = ")g{f(sd)fg}s";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertFalse(b);
        logger.info("5-th test");
    }

    @Test
    public void sameUnCorrectTagsStartWithCloseTagTest(){
        String expression = "}g{f{sd}fg}s";
        boolean b = correctTags.checkExpression(expression);
        Assert.assertFalse(b);
        logger.info("6-th test");
    }

}
