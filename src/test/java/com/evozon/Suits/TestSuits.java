package com.evozon.Suits;

import com.evozon.Tests.HeaderTests;
import com.evozon.Tests.HomePageTests;
import com.evozon.Tests.LoginTests;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        HeaderTests.class,
        HomePageTests.class,
        LoginTests.class
})
public class TestSuits {
}
