package com.gtm.compte.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompteEpargneTest.class, ComptePayantTest.class, CompteSimpleTest.class, CompteTest.class })
public class CompteAllTests {

}
