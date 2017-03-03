package com.spring.nauka;

import com.spring.nauka.web.WebTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Admin on 2017-02-08.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
// @formatter:off
        WebTestSuite.class
}) //
public class TestSuite {

}