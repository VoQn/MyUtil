package jp.ne.voqn;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VoQn
 */
public class StringsControlTest {

    public StringsControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of connect method, of class StringsControl.
     */
    @Test
    public void testConnect_String_List() {
        String seperator = ",";
        List<Object> list = new ArrayList<Object>();
        list.add("foo");
        list.add("bar");
        list.add("buzz");
        list.add(1);
        list.add(true);
        String expResult = "foo,bar,buzz,1,true";
        String result = StringsControl.connect(seperator, list);
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class StringsControl.
     */
    @Test
    public void testConnect_String_ObjectArr() {
        String seperator = ",";
        Object[] values = {"foo","bar","buzz",1,2,3.5};
        String expResult = "foo,bar,buzz,1,2,3.5";
        String result = StringsControl.connect(seperator, values);
        assertEquals(expResult, result);
    }

}