package test;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

class TestCase
{

    @Test
    void thisTestShouldPass()
    {
	System.out.println("running test case 1!");
    }

    @Test
    void thisTestShouldFail()
    {
	fail("This test should fail!");
    }

}
