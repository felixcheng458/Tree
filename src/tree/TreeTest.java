package tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {

	Tree<Integer> child1;
	Tree<Integer> child2;
	Tree<Integer> child3;
	Tree<Integer> child1_1;
	Tree<Integer> child3_1;
	Tree<Integer> child3_2;
	Tree<Integer> child3_2_1;
	Tree<Integer> root;
	
    @Before
    public void setUp() throws Exception {
    	child3_2_1 = new Tree<Integer>(8, null);
    	child1_1 = new Tree<Integer>(5, null);
    	child3_1 = new Tree<Integer>(6, null);
    	child3_2 = new Tree<Integer>(7, child3_2_1);
    	
    	child1 = new Tree<Integer>(2, child1_1);
    	child2 = new Tree<Integer>(3, null);
    	child3 = new Tree<Integer>(4, child3_1, child3_2);
    	
    	
    	root = new Tree<Integer>(1, child1, child2, child3);
    }

    @Test
    public final void testHashCode() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testTree() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testSetValue() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testGetValue() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testAddChildIntTreeOfV() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testAddChildTreeOfV() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testAddChildren() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testGetNumberOfChildren() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testGetChild() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testIterator() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testContains() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testToString() {
    	System.out.println(root);
//        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testEqualsObject() {
        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testParseString() {
        fail("Not yet implemented"); // TODO
    }

}
